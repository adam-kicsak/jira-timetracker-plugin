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
 * QSharepermissions is a Querydsl query type for QSharepermissions
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSharepermissions extends com.mysema.query.sql.RelationalPathBase<QSharepermissions> {

    private static final long serialVersionUID = -1082694651;

    public static final QSharepermissions sharepermissions = new QSharepermissions("SHAREPERMISSIONS");

    public final NumberPath<Long> entityid = createNumber("entityid", Long.class);

    public final StringPath entitytype = createString("entitytype");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath param1 = createString("param1");

    public final StringPath param2 = createString("param2");

    public final StringPath sharetype = createString("sharetype");

    public final com.mysema.query.sql.PrimaryKey<QSharepermissions> sharepermissionsPk = createPrimaryKey(id);

    public QSharepermissions(String variable) {
        super(QSharepermissions.class, forVariable(variable), "PUBLIC", "SHAREPERMISSIONS");
        addMetadata();
    }

    public QSharepermissions(String variable, String schema, String table) {
        super(QSharepermissions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSharepermissions(Path<? extends QSharepermissions> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SHAREPERMISSIONS");
        addMetadata();
    }

    public QSharepermissions(PathMetadata<?> metadata) {
        super(QSharepermissions.class, metadata, "PUBLIC", "SHAREPERMISSIONS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entityid, ColumnMetadata.named("ENTITYID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(entitytype, ColumnMetadata.named("ENTITYTYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(param1, ColumnMetadata.named("PARAM1").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(param2, ColumnMetadata.named("PARAM2").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sharetype, ColumnMetadata.named("SHARETYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

