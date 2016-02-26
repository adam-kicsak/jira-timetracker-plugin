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
 * QPermissionscheme is a Querydsl query type for QPermissionscheme
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPermissionscheme extends com.mysema.query.sql.RelationalPathBase<QPermissionscheme> {

    private static final long serialVersionUID = 1053504756;

    public static final QPermissionscheme permissionscheme = new QPermissionscheme("PERMISSIONSCHEME");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QPermissionscheme> permissionschemePk = createPrimaryKey(id);

    public QPermissionscheme(String variable) {
        super(QPermissionscheme.class, forVariable(variable), "PUBLIC", "PERMISSIONSCHEME");
        addMetadata();
    }

    public QPermissionscheme(String variable, String schema, String table) {
        super(QPermissionscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPermissionscheme(Path<? extends QPermissionscheme> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PERMISSIONSCHEME");
        addMetadata();
    }

    public QPermissionscheme(PathMetadata<?> metadata) {
        super(QPermissionscheme.class, metadata, "PUBLIC", "PERMISSIONSCHEME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

