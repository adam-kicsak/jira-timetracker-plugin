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
 * QAuditItem is a Querydsl query type for QAuditItem
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QAuditItem extends com.mysema.query.sql.RelationalPathBase<QAuditItem> {

    private static final long serialVersionUID = 823422158;

    public static final QAuditItem auditItem = new QAuditItem("AUDIT_ITEM");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> logId = createNumber("logId", Long.class);

    public final StringPath objectId = createString("objectId");

    public final StringPath objectName = createString("objectName");

    public final StringPath objectParentId = createString("objectParentId");

    public final StringPath objectParentName = createString("objectParentName");

    public final StringPath objectType = createString("objectType");

    public final com.mysema.query.sql.PrimaryKey<QAuditItem> auditItemPk = createPrimaryKey(id);

    public QAuditItem(String variable) {
        super(QAuditItem.class, forVariable(variable), "PUBLIC", "AUDIT_ITEM");
        addMetadata();
    }

    public QAuditItem(String variable, String schema, String table) {
        super(QAuditItem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAuditItem(Path<? extends QAuditItem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "AUDIT_ITEM");
        addMetadata();
    }

    public QAuditItem(PathMetadata<?> metadata) {
        super(QAuditItem.class, metadata, "PUBLIC", "AUDIT_ITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(logId, ColumnMetadata.named("LOG_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(objectId, ColumnMetadata.named("OBJECT_ID").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(objectName, ColumnMetadata.named("OBJECT_NAME").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(objectParentId, ColumnMetadata.named("OBJECT_PARENT_ID").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(objectParentName, ColumnMetadata.named("OBJECT_PARENT_NAME").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(objectType, ColumnMetadata.named("OBJECT_TYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

