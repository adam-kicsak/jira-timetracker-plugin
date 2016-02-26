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
 * QJquartzJobListeners is a Querydsl query type for QJquartzJobListeners
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzJobListeners extends com.mysema.query.sql.RelationalPathBase<QJquartzJobListeners> {

    private static final long serialVersionUID = -1953997209;

    public static final QJquartzJobListeners jquartzJobListeners = new QJquartzJobListeners("JQUARTZ_JOB_LISTENERS");

    public final StringPath jobGroup = createString("jobGroup");

    public final StringPath jobListener = createString("jobListener");

    public final StringPath jobName = createString("jobName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzJobListeners> jquartzJobListenersPk = createPrimaryKey(jobGroup, jobListener, jobName);

    public QJquartzJobListeners(String variable) {
        super(QJquartzJobListeners.class, forVariable(variable), "PUBLIC", "JQUARTZ_JOB_LISTENERS");
        addMetadata();
    }

    public QJquartzJobListeners(String variable, String schema, String table) {
        super(QJquartzJobListeners.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzJobListeners(Path<? extends QJquartzJobListeners> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_JOB_LISTENERS");
        addMetadata();
    }

    public QJquartzJobListeners(PathMetadata<?> metadata) {
        super(QJquartzJobListeners.class, metadata, "PUBLIC", "JQUARTZ_JOB_LISTENERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(jobGroup, ColumnMetadata.named("JOB_GROUP").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(jobListener, ColumnMetadata.named("JOB_LISTENER").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(jobName, ColumnMetadata.named("JOB_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

