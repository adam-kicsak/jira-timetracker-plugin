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
 * QJquartzTriggerListeners is a Querydsl query type for QJquartzTriggerListeners
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzTriggerListeners extends com.mysema.query.sql.RelationalPathBase<QJquartzTriggerListeners> {

    private static final long serialVersionUID = 886993996;

    public static final QJquartzTriggerListeners jquartzTriggerListeners = new QJquartzTriggerListeners("JQUARTZ_TRIGGER_LISTENERS");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerListener = createString("triggerListener");

    public final StringPath triggerName = createString("triggerName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzTriggerListeners> jquartzTriggerListenersPk = createPrimaryKey(triggerGroup, triggerListener);

    public QJquartzTriggerListeners(String variable) {
        super(QJquartzTriggerListeners.class, forVariable(variable), "PUBLIC", "JQUARTZ_TRIGGER_LISTENERS");
        addMetadata();
    }

    public QJquartzTriggerListeners(String variable, String schema, String table) {
        super(QJquartzTriggerListeners.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzTriggerListeners(Path<? extends QJquartzTriggerListeners> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_TRIGGER_LISTENERS");
        addMetadata();
    }

    public QJquartzTriggerListeners(PathMetadata<?> metadata) {
        super(QJquartzTriggerListeners.class, metadata, "PUBLIC", "JQUARTZ_TRIGGER_LISTENERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerListener, ColumnMetadata.named("TRIGGER_LISTENER").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("TRIGGER_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(200));
    }

}

