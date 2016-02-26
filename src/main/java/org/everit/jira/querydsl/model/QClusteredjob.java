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
package org.everit.jira.querydsl.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;

import com.mysema.query.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QClusteredjob is a Querydsl query type for QClusteredjob
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QClusteredjob extends com.mysema.query.sql.RelationalPathBase<QClusteredjob> {

    private static final long serialVersionUID = 344580548;

    public static final QClusteredjob clusteredjob = new QClusteredjob("CLUSTEREDJOB");

    public final StringPath cronExpression = createString("cronExpression");

    public final NumberPath<Long> firstRun = createNumber("firstRun", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> intervalMillis = createNumber("intervalMillis", Long.class);

    public final StringPath jobId = createString("jobId");

    public final StringPath jobRunnerKey = createString("jobRunnerKey");

    public final NumberPath<Long> nextRun = createNumber("nextRun", Long.class);

    public final SimplePath<Object> parameters = createSimple("parameters", Object.class);

    public final StringPath schedType = createString("schedType");

    public final StringPath timeZone = createString("timeZone");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QClusteredjob> clusteredjobPk = createPrimaryKey(id);

    public QClusteredjob(String variable) {
        super(QClusteredjob.class, forVariable(variable), "PUBLIC", "CLUSTEREDJOB");
        addMetadata();
    }

    public QClusteredjob(String variable, String schema, String table) {
        super(QClusteredjob.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QClusteredjob(Path<? extends QClusteredjob> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CLUSTEREDJOB");
        addMetadata();
    }

    public QClusteredjob(PathMetadata<?> metadata) {
        super(QClusteredjob.class, metadata, "PUBLIC", "CLUSTEREDJOB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cronExpression, ColumnMetadata.named("CRON_EXPRESSION").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(firstRun, ColumnMetadata.named("FIRST_RUN").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(intervalMillis, ColumnMetadata.named("INTERVAL_MILLIS").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(jobId, ColumnMetadata.named("JOB_ID").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(jobRunnerKey, ColumnMetadata.named("JOB_RUNNER_KEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(nextRun, ColumnMetadata.named("NEXT_RUN").withIndex(9).ofType(Types.BIGINT).withSize(19));
        addMetadata(parameters, ColumnMetadata.named("PARAMETERS").withIndex(11).ofType(Types.OTHER).withSize(2147483647));
        addMetadata(schedType, ColumnMetadata.named("SCHED_TYPE").withIndex(4).ofType(Types.CHAR).withSize(2147483647));
        addMetadata(timeZone, ColumnMetadata.named("TIME_ZONE").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(version, ColumnMetadata.named("VERSION").withIndex(10).ofType(Types.BIGINT).withSize(19));
    }

}

