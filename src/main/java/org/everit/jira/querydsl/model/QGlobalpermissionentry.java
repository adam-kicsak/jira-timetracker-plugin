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
 * QGlobalpermissionentry is a Querydsl query type for QGlobalpermissionentry
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QGlobalpermissionentry extends com.mysema.query.sql.RelationalPathBase<QGlobalpermissionentry> {

    private static final long serialVersionUID = 482792768;

    public static final QGlobalpermissionentry globalpermissionentry = new QGlobalpermissionentry("GLOBALPERMISSIONENTRY");

    public final StringPath groupId = createString("groupId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath permission = createString("permission");

    public final com.mysema.query.sql.PrimaryKey<QGlobalpermissionentry> globalpermissionentryPk = createPrimaryKey(id);

    public QGlobalpermissionentry(String variable) {
        super(QGlobalpermissionentry.class, forVariable(variable), "PUBLIC", "GLOBALPERMISSIONENTRY");
        addMetadata();
    }

    public QGlobalpermissionentry(String variable, String schema, String table) {
        super(QGlobalpermissionentry.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGlobalpermissionentry(Path<? extends QGlobalpermissionentry> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "GLOBALPERMISSIONENTRY");
        addMetadata();
    }

    public QGlobalpermissionentry(PathMetadata<?> metadata) {
        super(QGlobalpermissionentry.class, metadata, "PUBLIC", "GLOBALPERMISSIONENTRY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupId, ColumnMetadata.named("GROUP_ID").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(permission, ColumnMetadata.named("PERMISSION").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

