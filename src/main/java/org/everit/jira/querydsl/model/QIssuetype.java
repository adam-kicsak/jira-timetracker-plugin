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
 * QIssuetype is a Querydsl query type for QIssuetype
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QIssuetype extends com.mysema.query.sql.RelationalPathBase<QIssuetype> {

    private static final long serialVersionUID = 816671443;

    public static final QIssuetype issuetype = new QIssuetype("ISSUETYPE");

    public final NumberPath<Long> avatar = createNumber("avatar", Long.class);

    public final StringPath description = createString("description");

    public final StringPath iconurl = createString("iconurl");

    public final StringPath id = createString("id");

    public final StringPath pname = createString("pname");

    public final StringPath pstyle = createString("pstyle");

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QIssuetype> issuetypePk = createPrimaryKey(id);

    public QIssuetype(String variable) {
        super(QIssuetype.class, forVariable(variable), "PUBLIC", "ISSUETYPE");
        addMetadata();
    }

    public QIssuetype(String variable, String schema, String table) {
        super(QIssuetype.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssuetype(Path<? extends QIssuetype> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "ISSUETYPE");
        addMetadata();
    }

    public QIssuetype(PathMetadata<?> metadata) {
        super(QIssuetype.class, metadata, "PUBLIC", "ISSUETYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avatar, ColumnMetadata.named("AVATAR").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(iconurl, ColumnMetadata.named("ICONURL").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(pname, ColumnMetadata.named("PNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(pstyle, ColumnMetadata.named("PSTYLE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

