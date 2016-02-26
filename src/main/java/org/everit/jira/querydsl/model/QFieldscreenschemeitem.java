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
 * QFieldscreenschemeitem is a Querydsl query type for QFieldscreenschemeitem
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldscreenschemeitem extends com.mysema.query.sql.RelationalPathBase<QFieldscreenschemeitem> {

    private static final long serialVersionUID = -757967906;

    public static final QFieldscreenschemeitem fieldscreenschemeitem = new QFieldscreenschemeitem("FIELDSCREENSCHEMEITEM");

    public final NumberPath<Long> fieldscreen = createNumber("fieldscreen", Long.class);

    public final NumberPath<Long> fieldscreenscheme = createNumber("fieldscreenscheme", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> operation = createNumber("operation", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QFieldscreenschemeitem> fieldscreenschemeitemPk = createPrimaryKey(id);

    public QFieldscreenschemeitem(String variable) {
        super(QFieldscreenschemeitem.class, forVariable(variable), "PUBLIC", "FIELDSCREENSCHEMEITEM");
        addMetadata();
    }

    public QFieldscreenschemeitem(String variable, String schema, String table) {
        super(QFieldscreenschemeitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldscreenschemeitem(Path<? extends QFieldscreenschemeitem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDSCREENSCHEMEITEM");
        addMetadata();
    }

    public QFieldscreenschemeitem(PathMetadata<?> metadata) {
        super(QFieldscreenschemeitem.class, metadata, "PUBLIC", "FIELDSCREENSCHEMEITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldscreen, ColumnMetadata.named("FIELDSCREEN").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(fieldscreenscheme, ColumnMetadata.named("FIELDSCREENSCHEME").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(operation, ColumnMetadata.named("OPERATION").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

