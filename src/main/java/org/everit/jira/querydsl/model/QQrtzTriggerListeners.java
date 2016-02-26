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
 * QQrtzTriggerListeners is a Querydsl query type for QQrtzTriggerListeners
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QQrtzTriggerListeners extends com.mysema.query.sql.RelationalPathBase<QQrtzTriggerListeners> {

    private static final long serialVersionUID = -727651666;

    public static final QQrtzTriggerListeners qrtzTriggerListeners = new QQrtzTriggerListeners("QRTZ_TRIGGER_LISTENERS");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> triggerId = createNumber("triggerId", Long.class);

    public final StringPath triggerListener = createString("triggerListener");

    public final com.mysema.query.sql.PrimaryKey<QQrtzTriggerListeners> qrtzTriggerListenersPk = createPrimaryKey(id);

    public QQrtzTriggerListeners(String variable) {
        super(QQrtzTriggerListeners.class, forVariable(variable), "PUBLIC", "QRTZ_TRIGGER_LISTENERS");
        addMetadata();
    }

    public QQrtzTriggerListeners(String variable, String schema, String table) {
        super(QQrtzTriggerListeners.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzTriggerListeners(Path<? extends QQrtzTriggerListeners> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_TRIGGER_LISTENERS");
        addMetadata();
    }

    public QQrtzTriggerListeners(PathMetadata<?> metadata) {
        super(QQrtzTriggerListeners.class, metadata, "PUBLIC", "QRTZ_TRIGGER_LISTENERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(triggerId, ColumnMetadata.named("TRIGGER_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(triggerListener, ColumnMetadata.named("TRIGGER_LISTENER").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

