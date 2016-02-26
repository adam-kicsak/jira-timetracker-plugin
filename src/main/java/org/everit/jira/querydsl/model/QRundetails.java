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
 * QRundetails is a Querydsl query type for QRundetails
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRundetails extends com.mysema.query.sql.RelationalPathBase<QRundetails> {

    private static final long serialVersionUID = 425915927;

    public static final QRundetails rundetails = new QRundetails("RUNDETAILS");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath infoMessage = createString("infoMessage");

    public final StringPath jobId = createString("jobId");

    public final NumberPath<Long> runDuration = createNumber("runDuration", Long.class);

    public final StringPath runOutcome = createString("runOutcome");

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final com.mysema.query.sql.PrimaryKey<QRundetails> rundetailsPk = createPrimaryKey(id);

    public QRundetails(String variable) {
        super(QRundetails.class, forVariable(variable), "PUBLIC", "RUNDETAILS");
        addMetadata();
    }

    public QRundetails(String variable, String schema, String table) {
        super(QRundetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRundetails(Path<? extends QRundetails> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "RUNDETAILS");
        addMetadata();
    }

    public QRundetails(PathMetadata<?> metadata) {
        super(QRundetails.class, metadata, "PUBLIC", "RUNDETAILS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(infoMessage, ColumnMetadata.named("INFO_MESSAGE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(jobId, ColumnMetadata.named("JOB_ID").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(runDuration, ColumnMetadata.named("RUN_DURATION").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(runOutcome, ColumnMetadata.named("RUN_OUTCOME").withIndex(5).ofType(Types.CHAR).withSize(2147483647));
        addMetadata(startTime, ColumnMetadata.named("START_TIME").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
    }

}

