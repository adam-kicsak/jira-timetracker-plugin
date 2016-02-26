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
 * QUserbase is a Querydsl query type for QUserbase
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUserbase extends com.mysema.query.sql.RelationalPathBase<QUserbase> {

    private static final long serialVersionUID = 308471260;

    public static final QUserbase userbase = new QUserbase("USERBASE");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath passwordHash = createString("passwordHash");

    public final StringPath username = createString("username");

    public final com.mysema.query.sql.PrimaryKey<QUserbase> userbasePk = createPrimaryKey(id);

    public QUserbase(String variable) {
        super(QUserbase.class, forVariable(variable), "PUBLIC", "USERBASE");
        addMetadata();
    }

    public QUserbase(String variable, String schema, String table) {
        super(QUserbase.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserbase(Path<? extends QUserbase> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "USERBASE");
        addMetadata();
    }

    public QUserbase(PathMetadata<?> metadata) {
        super(QUserbase.class, metadata, "PUBLIC", "USERBASE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(passwordHash, ColumnMetadata.named("PASSWORD_HASH").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(username, ColumnMetadata.named("USERNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

