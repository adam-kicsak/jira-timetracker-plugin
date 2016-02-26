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
 * QAvatar is a Querydsl query type for QAvatar
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QAvatar extends com.mysema.query.sql.RelationalPathBase<QAvatar> {

    private static final long serialVersionUID = 762233369;

    public static final QAvatar avatar = new QAvatar("AVATAR");

    public final StringPath avatartype = createString("avatartype");

    public final StringPath contenttype = createString("contenttype");

    public final StringPath filename = createString("filename");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath owner = createString("owner");

    public final NumberPath<Integer> systemavatar = createNumber("systemavatar", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QAvatar> avatarPk = createPrimaryKey(id);

    public QAvatar(String variable) {
        super(QAvatar.class, forVariable(variable), "PUBLIC", "AVATAR");
        addMetadata();
    }

    public QAvatar(String variable, String schema, String table) {
        super(QAvatar.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvatar(Path<? extends QAvatar> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "AVATAR");
        addMetadata();
    }

    public QAvatar(PathMetadata<?> metadata) {
        super(QAvatar.class, metadata, "PUBLIC", "AVATAR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avatartype, ColumnMetadata.named("AVATARTYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(contenttype, ColumnMetadata.named("CONTENTTYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(filename, ColumnMetadata.named("FILENAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(owner, ColumnMetadata.named("OWNER").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(systemavatar, ColumnMetadata.named("SYSTEMAVATAR").withIndex(6).ofType(Types.INTEGER).withSize(10));
    }

}

