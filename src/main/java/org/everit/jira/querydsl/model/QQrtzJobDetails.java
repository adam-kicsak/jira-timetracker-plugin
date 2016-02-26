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
 * QQrtzJobDetails is a Querydsl query type for QQrtzJobDetails
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QQrtzJobDetails extends com.mysema.query.sql.RelationalPathBase<QQrtzJobDetails> {

    private static final long serialVersionUID = 2121650252;

    public static final QQrtzJobDetails qrtzJobDetails = new QQrtzJobDetails("QRTZ_JOB_DETAILS");

    public final StringPath className = createString("className");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath isDurable = createString("isDurable");

    public final StringPath isStateful = createString("isStateful");

    public final StringPath jobData = createString("jobData");

    public final StringPath jobGroup = createString("jobGroup");

    public final StringPath jobName = createString("jobName");

    public final StringPath requestsRecovery = createString("requestsRecovery");

    public final com.mysema.query.sql.PrimaryKey<QQrtzJobDetails> qrtzJobDetailsPk = createPrimaryKey(id);

    public QQrtzJobDetails(String variable) {
        super(QQrtzJobDetails.class, forVariable(variable), "PUBLIC", "QRTZ_JOB_DETAILS");
        addMetadata();
    }

    public QQrtzJobDetails(String variable, String schema, String table) {
        super(QQrtzJobDetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzJobDetails(Path<? extends QQrtzJobDetails> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_JOB_DETAILS");
        addMetadata();
    }

    public QQrtzJobDetails(PathMetadata<?> metadata) {
        super(QQrtzJobDetails.class, metadata, "PUBLIC", "QRTZ_JOB_DETAILS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(className, ColumnMetadata.named("CLASS_NAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(isDurable, ColumnMetadata.named("IS_DURABLE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(isStateful, ColumnMetadata.named("IS_STATEFUL").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(jobData, ColumnMetadata.named("JOB_DATA").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(jobGroup, ColumnMetadata.named("JOB_GROUP").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(jobName, ColumnMetadata.named("JOB_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(requestsRecovery, ColumnMetadata.named("REQUESTS_RECOVERY").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

