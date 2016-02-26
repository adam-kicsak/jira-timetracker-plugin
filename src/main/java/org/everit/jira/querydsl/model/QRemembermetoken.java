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
 * QRemembermetoken is a Querydsl query type for QRemembermetoken
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRemembermetoken extends com.mysema.query.sql.RelationalPathBase<QRemembermetoken> {

    private static final long serialVersionUID = -198618252;

    public static final QRemembermetoken remembermetoken = new QRemembermetoken("REMEMBERMETOKEN");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath token = createString("token");

    public final StringPath username = createString("username");

    public final com.mysema.query.sql.PrimaryKey<QRemembermetoken> remembermetokenPk = createPrimaryKey(id);

    public QRemembermetoken(String variable) {
        super(QRemembermetoken.class, forVariable(variable), "PUBLIC", "REMEMBERMETOKEN");
        addMetadata();
    }

    public QRemembermetoken(String variable, String schema, String table) {
        super(QRemembermetoken.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRemembermetoken(Path<? extends QRemembermetoken> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "REMEMBERMETOKEN");
        addMetadata();
    }

    public QRemembermetoken(PathMetadata<?> metadata) {
        super(QRemembermetoken.class, metadata, "PUBLIC", "REMEMBERMETOKEN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(token, ColumnMetadata.named("TOKEN").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(username, ColumnMetadata.named("USERNAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

