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
 * QSchemepermissions is a Querydsl query type for QSchemepermissions
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSchemepermissions extends com.mysema.query.sql.RelationalPathBase<QSchemepermissions> {

    private static final long serialVersionUID = 1447967999;

    public static final QSchemepermissions schemepermissions = new QSchemepermissions("SCHEMEPERMISSIONS");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> permission = createNumber("permission", Long.class);

    public final StringPath permissionKey = createString("permissionKey");

    public final StringPath permParameter = createString("permParameter");

    public final StringPath permType = createString("permType");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QSchemepermissions> schemepermissionsPk = createPrimaryKey(id);

    public QSchemepermissions(String variable) {
        super(QSchemepermissions.class, forVariable(variable), "PUBLIC", "SCHEMEPERMISSIONS");
        addMetadata();
    }

    public QSchemepermissions(String variable, String schema, String table) {
        super(QSchemepermissions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSchemepermissions(Path<? extends QSchemepermissions> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SCHEMEPERMISSIONS");
        addMetadata();
    }

    public QSchemepermissions(PathMetadata<?> metadata) {
        super(QSchemepermissions.class, metadata, "PUBLIC", "SCHEMEPERMISSIONS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(permission, ColumnMetadata.named("PERMISSION").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(permissionKey, ColumnMetadata.named("PERMISSION_KEY").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(permParameter, ColumnMetadata.named("PERM_PARAMETER").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(permType, ColumnMetadata.named("PERM_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

