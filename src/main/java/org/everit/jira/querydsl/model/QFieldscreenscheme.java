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
 * QFieldscreenscheme is a Querydsl query type for QFieldscreenscheme
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldscreenscheme extends com.mysema.query.sql.RelationalPathBase<QFieldscreenscheme> {

    private static final long serialVersionUID = -924125621;

    public static final QFieldscreenscheme fieldscreenscheme = new QFieldscreenscheme("FIELDSCREENSCHEME");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QFieldscreenscheme> fieldscreenschemePk = createPrimaryKey(id);

    public QFieldscreenscheme(String variable) {
        super(QFieldscreenscheme.class, forVariable(variable), "PUBLIC", "FIELDSCREENSCHEME");
        addMetadata();
    }

    public QFieldscreenscheme(String variable, String schema, String table) {
        super(QFieldscreenscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldscreenscheme(Path<? extends QFieldscreenscheme> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDSCREENSCHEME");
        addMetadata();
    }

    public QFieldscreenscheme(PathMetadata<?> metadata) {
        super(QFieldscreenscheme.class, metadata, "PUBLIC", "FIELDSCREENSCHEME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

