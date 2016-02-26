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
 * QQrtzSimpleTriggers is a Querydsl query type for QQrtzSimpleTriggers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QQrtzSimpleTriggers extends com.mysema.query.sql.RelationalPathBase<QQrtzSimpleTriggers> {

    private static final long serialVersionUID = -2030523756;

    public static final QQrtzSimpleTriggers qrtzSimpleTriggers = new QQrtzSimpleTriggers("QRTZ_SIMPLE_TRIGGERS");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> repeatCount = createNumber("repeatCount", Integer.class);

    public final NumberPath<Long> repeatInterval = createNumber("repeatInterval", Long.class);

    public final NumberPath<Integer> timesTriggered = createNumber("timesTriggered", Integer.class);

    public final NumberPath<Long> triggerId = createNumber("triggerId", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QQrtzSimpleTriggers> qrtzSimpleTriggersPk = createPrimaryKey(id);

    public QQrtzSimpleTriggers(String variable) {
        super(QQrtzSimpleTriggers.class, forVariable(variable), "PUBLIC", "QRTZ_SIMPLE_TRIGGERS");
        addMetadata();
    }

    public QQrtzSimpleTriggers(String variable, String schema, String table) {
        super(QQrtzSimpleTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzSimpleTriggers(Path<? extends QQrtzSimpleTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_SIMPLE_TRIGGERS");
        addMetadata();
    }

    public QQrtzSimpleTriggers(PathMetadata<?> metadata) {
        super(QQrtzSimpleTriggers.class, metadata, "PUBLIC", "QRTZ_SIMPLE_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(repeatCount, ColumnMetadata.named("REPEAT_COUNT").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(repeatInterval, ColumnMetadata.named("REPEAT_INTERVAL").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(timesTriggered, ColumnMetadata.named("TIMES_TRIGGERED").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(triggerId, ColumnMetadata.named("TRIGGER_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

