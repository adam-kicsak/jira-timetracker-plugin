/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.jira.timetracker.plugin.dto;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.everit.jira.timetracker.plugin.DateTimeConverterUtil;
import org.everit.jira.timetracker.plugin.DurationFormatter;
import org.ofbiz.core.entity.GenericValue;

import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.issue.IssueManager;
import com.atlassian.jira.issue.MutableIssue;
import com.atlassian.jira.issue.worklog.Worklog;

/**
 * The Everit Worklog.
 */
public class EveritWorklog implements Serializable {


  /**
   * Serial version UID.
   */
  private static final long serialVersionUID = 1L;
  /**
   * The worklog note.
   */
  private String body;

  private Date date;

  private int dayNo;

  /**
   * The spent time.
   */
  private String duration;

  /**
   * The calculated end time.
   */
  private String endTime;

  /**
   * The issue estimated time is 0 or not.
   */
  private boolean isMoreEstimatedTime;

  /**
   * The worklog Issue key.
   */
  private String issue;

  /**
   * The worklog issue ID.
   */
  private Long issueId;

  /**
   * The worklog Issue epic.
   */
  private String issueParent;

  /**
   * The worklog Issue Summary.
   */
  private String issueSummary;

  /**
   * The milliseconds between the start time and the end time.
   */
  private long milliseconds;

  private int monthNo;

  /**
   * Remaining time on the issue.
   */
  private String roundedRemaining;

  private String exactRemaining;

  /**
   * The start Date.
   */
  private String startDate;

  /**
   * The start Time.
   */
  private String startTime;

  private int weekNo;

  /**
   * The worklog ID.
   */
  private Long worklogId;

  /**
   * Simple constructor with GenericValue.
   *
   * @param worklogGv
   *          GenericValue worklog.
   * @throws ParseException
   *           If can't parse the date.
   */
  public EveritWorklog(final GenericValue worklogGv) throws ParseException {
    worklogId = worklogGv.getLong("id");
    startTime = worklogGv.getString("startdate");
    date = DateTimeConverterUtil.stringToDateAndTime(startTime);
    startTime = DateTimeConverterUtil.dateTimeToString(date);
    startDate = DateTimeConverterUtil.dateToString(date);
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    weekNo = calendar.get(Calendar.WEEK_OF_YEAR);
    monthNo = calendar.get(Calendar.MONTH) + 1;
    dayNo = calendar.get(Calendar.DAY_OF_YEAR);
    issueId = Long.valueOf(worklogGv.getString("issue"));
    IssueManager issueManager = ComponentAccessor.getIssueManager();
    MutableIssue issueObject = issueManager.getIssueObject(issueId);
    issue = issueObject.getKey();
    issueSummary = issueObject.getSummary();

    if (issueObject.getParentObject() != null) {
      issueParent = issueObject.getParentObject().getKey();
    } else {
      issueParent = "";
    }
    isMoreEstimatedTime = issueObject.getEstimate() == 0 ? false : true;
    body = worklogGv.getString("body");
    if (body != null) {
      body = body.replace("\"", "\\\"");
      body = body.replace("\r", "\\r");
      body = body.replace("\n", "\\n");
    } else {
      body = "";
    }
    long timeSpentInSec = worklogGv.getLong("timeworked").longValue();
    updateWorklogTimeFields(timeSpentInSec);

    roundedRemaining = DurationFormatter.roundedDuration(issueObject.getEstimate());
    exactRemaining = DateTimeConverterUtil.secondConvertToString(issueObject.getEstimate());
  }

  public EveritWorklog(final Long worklogId, final String worklogBody, final Date worklogDate,
      final Long worklogTimeworked, final String issue,
      final Long issueId, final String issueSummary, final Long issueEstimate,
      final String issueParent)
          throws ParseException {

    // worklog
    this.worklogId = worklogId;
    this.body = correctBody(worklogBody);
    updateWorklogDateFields(worklogDate);
    updateWorklogTimeFields(worklogTimeworked.longValue());

    // issue
    this.issueId = issueId;
    this.issue = issue;
    this.issueSummary = issueSummary;
    updateIssueEstimateFields(issueEstimate);

    // issue parent
    this.issueParent = issueParent;
  }

  /**
   * Simple constructor with ResultSet.
   *
   * @param rs
   *          ResultSet
   * @throws ParseException
   *           Cannot parse date time
   * @throws SQLException
   *           Cannot access resultSet fields
   */
  public EveritWorklog(final ResultSet rs)
      throws ParseException, SQLException {
    worklogId = rs.getLong("id");
    startTime = rs.getString("startdate");
    date = DateTimeConverterUtil.stringToDateAndTime(startTime);
    startTime = DateTimeConverterUtil.dateTimeToString(date);
    startDate = DateTimeConverterUtil.dateToString(date);
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    weekNo = calendar.get(Calendar.WEEK_OF_YEAR);
    monthNo = calendar.get(Calendar.MONTH) + 1;
    dayNo = calendar.get(Calendar.DAY_OF_YEAR);
    issueId = rs.getLong("issueid");
    IssueManager issueManager = ComponentAccessor.getIssueManager();
    MutableIssue issueObject = issueManager.getIssueObject(issueId);
    issue = issueObject.getKey();
    issueSummary = issueObject.getSummary();

    if (issueObject.getParentObject() != null) {
      issueParent = issueObject.getParentObject().getKey();
    } else {
      issueParent = "";
    }
    isMoreEstimatedTime = issueObject.getEstimate() == 0 ? false : true;
    body = rs.getString("worklogbody");
    if (body != null) {
      body = body.replace("\"", "\\\"");
      body = body.replace("\r", "\\r");
      body = body.replace("\n", "\\n");
    } else {
      body = "";
    }
    long timeSpentInSec = rs.getLong("timeworked");
    updateWorklogTimeFields(timeSpentInSec);

    roundedRemaining = DurationFormatter.roundedDuration(issueObject.getEstimate());
    exactRemaining = DateTimeConverterUtil.secondConvertToString(issueObject.getEstimate());
  }

  /**
   * Simple constructor whit Worklog.
   *
   * @param worklog
   *          The worklog.
   * @throws ParseException
   *           If can't parse the date.
   */
  public EveritWorklog(final Worklog worklog) throws ParseException {
    worklogId = worklog.getId();
    date = worklog.getStartDate();
    startTime = DateTimeConverterUtil.dateTimeToString(date);
    startDate = DateTimeConverterUtil.dateToString(date);
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    weekNo = calendar.get(Calendar.WEEK_OF_YEAR);
    monthNo = calendar.get(Calendar.MONTH) + 1;
    dayNo = calendar.get(Calendar.DAY_OF_YEAR);
    issue = worklog.getIssue().getKey();
    issueSummary = worklog.getIssue().getSummary();
    body = worklog.getComment();
    if (body != null) {
      body = body.replace("\"", "\\\"");
      body = body.replace("\r", "\\r");
      body = body.replace("\n", "\\n");
    } else {
      body = "";
    }
    long timeSpentInSec = worklog.getTimeSpent().longValue();
    milliseconds = timeSpentInSec
        * DateTimeConverterUtil.MILLISECONDS_PER_SECOND;
    duration = DateTimeConverterUtil
        .millisecondConvertToStringTime(milliseconds);
    endTime = DateTimeConverterUtil.countEndTime(startTime, milliseconds);
  }

  private String correctBody(final String body) {
    if (body != null) {
      return body.replace("\"", "\\\"").replace("\r", "\\r").replace("\n", "\\n");
    } else {
      return "";
    }
  }

  public String getBody() {
    return body;
  }

  public Date getDate() {
    return (Date) date.clone();
  }

  public int getDayNo() {
    return dayNo;
  }

  public String getDuration() {
    return duration;
  }

  public String getEndTime() {
    return endTime;
  }

  public String getExactRemaining() {
    return exactRemaining;
  }

  public boolean getIsMoreEstimatedTime() {
    return isMoreEstimatedTime;
  }

  public String getIssue() {
    return issue;
  }

  public String getIssueParent() {
    return issueParent;
  }

  public String getIssueSummary() {
    return issueSummary;
  }

  public long getMilliseconds() {
    return milliseconds;
  }

  public int getMonthNo() {
    return monthNo;
  }

  public String getRoundedRemaining() {
    return roundedRemaining;
  }

  public String getStartDate() {
    return startDate;
  }

  public String getStartTime() {
    return startTime;
  }

  public int getWeekNo() {
    return weekNo;
  }

  public Long getWorklogId() {
    return worklogId;
  }

  public void setBody(final String body) {
    this.body = body;
  }

  public void setDate(final Date date) {
    this.date = (Date) date.clone();
  }

  public void setDayNo(final int dayNo) {
    this.dayNo = dayNo;
  }

  public void setDuration(final String duration) {
    this.duration = duration;
  }

  public void setEndTime(final String endTime) {
    this.endTime = endTime;
  }

  public void setExactRemaining(final String exactRemaining) {
    this.exactRemaining = exactRemaining;
  }

  public void setIssue(final String issue) {
    this.issue = issue;
  }

  public void setIssueParent(final String issueParent) {
    this.issueParent = issueParent;
  }

  public void setIssueSummary(final String issueSummary) {
    this.issueSummary = issueSummary;
  }

  public void setMilliseconds(final long milliseconds) {
    this.milliseconds = milliseconds;
  }

  public void setMonthNo(final int monthNo) {
    this.monthNo = monthNo;
  }

  public void setMoreEstimatedTime(final boolean isMoreEstimatedTime) {
    this.isMoreEstimatedTime = isMoreEstimatedTime;
  }

  public void setRoundedRemaining(final String remaining) {
    this.roundedRemaining = remaining;
  }

  public void setStartDate(final String startDate) {
    this.startDate = startDate;
  }

  public void setStartTime(final String startTime) {
    this.startTime = startTime;
  }

  public void setWeekNo(final int weekNo) {
    this.weekNo = weekNo;
  }

  public void setWorklogId(final Long worklogId) {
    this.worklogId = worklogId;
  }

  private void updateIssueEstimateFields(final Long issueEstimate) {
    isMoreEstimatedTime = issueEstimate == 0 ? false : true;
    roundedRemaining = DurationFormatter.roundedDuration(issueEstimate);
    exactRemaining = DateTimeConverterUtil.secondConvertToString(issueEstimate);
  }

  private void updateWorklogDateFields(final Date worklogDate) {
    date = worklogDate;
    startTime = DateTimeConverterUtil.dateTimeToString(date);
    startDate = DateTimeConverterUtil.dateToString(date);
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    weekNo = calendar.get(Calendar.WEEK_OF_YEAR);
    monthNo = calendar.get(Calendar.MONTH) + 1;
    dayNo = calendar.get(Calendar.DAY_OF_YEAR);
  }

  private void updateWorklogTimeFields(final long timeSpentInSec) throws ParseException {
    milliseconds = timeSpentInSec
        * DateTimeConverterUtil.MILLISECONDS_PER_SECOND;
    duration = DateTimeConverterUtil.secondConvertToString(timeSpentInSec);
    endTime = DateTimeConverterUtil.countEndTime(startTime, milliseconds);
  }

}
