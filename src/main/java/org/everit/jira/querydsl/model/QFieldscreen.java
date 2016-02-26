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
 * QFieldscreen is a Querydsl query type for QFieldscreen
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldscreen extends com.mysema.query.sql.RelationalPathBase<QFieldscreen> {

    private static final long serialVersionUID = 1996010790;

    public static final QFieldscreen fieldscreen = new QFieldscreen("FIELDSCREEN");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QFieldscreen> fieldscreenPk = createPrimaryKey(id);

    public QFieldscreen(String variable) {
        super(QFieldscreen.class, forVariable(variable), "PUBLIC", "FIELDSCREEN");
        addMetadata();
    }

    public QFieldscreen(String variable, String schema, String table) {
        super(QFieldscreen.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldscreen(Path<? extends QFieldscreen> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDSCREEN");
        addMetadata();
    }

    public QFieldscreen(PathMetadata<?> metadata) {
        super(QFieldscreen.class, metadata, "PUBLIC", "FIELDSCREEN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

