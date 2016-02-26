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
 * QJquartzBlobTriggers is a Querydsl query type for QJquartzBlobTriggers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzBlobTriggers extends com.mysema.query.sql.RelationalPathBase<QJquartzBlobTriggers> {

    private static final long serialVersionUID = -404870179;

    public static final QJquartzBlobTriggers jquartzBlobTriggers = new QJquartzBlobTriggers("JQUARTZ_BLOB_TRIGGERS");

    public final SimplePath<byte[]> blobData = createSimple("blobData", byte[].class);

    public final StringPath schedName = createString("schedName");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzBlobTriggers> jquartzBlobTriggersPk = createPrimaryKey(triggerGroup, triggerName);

    public QJquartzBlobTriggers(String variable) {
        super(QJquartzBlobTriggers.class, forVariable(variable), "PUBLIC", "JQUARTZ_BLOB_TRIGGERS");
        addMetadata();
    }

    public QJquartzBlobTriggers(String variable, String schema, String table) {
        super(QJquartzBlobTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzBlobTriggers(Path<? extends QJquartzBlobTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_BLOB_TRIGGERS");
        addMetadata();
    }

    public QJquartzBlobTriggers(PathMetadata<?> metadata) {
        super(QJquartzBlobTriggers.class, metadata, "PUBLIC", "JQUARTZ_BLOB_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(blobData, ColumnMetadata.named("BLOB_DATA").withIndex(4).ofType(Types.VARBINARY).withSize(16000));
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("TRIGGER_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

