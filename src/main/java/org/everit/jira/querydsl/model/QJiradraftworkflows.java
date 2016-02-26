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
 * QJiradraftworkflows is a Querydsl query type for QJiradraftworkflows
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJiradraftworkflows extends com.mysema.query.sql.RelationalPathBase<QJiradraftworkflows> {

    private static final long serialVersionUID = 62753793;

    public static final QJiradraftworkflows jiradraftworkflows = new QJiradraftworkflows("JIRADRAFTWORKFLOWS");

    public final StringPath descriptor = createString("descriptor");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath parentname = createString("parentname");

    public final com.mysema.query.sql.PrimaryKey<QJiradraftworkflows> jiradraftworkflowsPk = createPrimaryKey(id);

    public QJiradraftworkflows(String variable) {
        super(QJiradraftworkflows.class, forVariable(variable), "PUBLIC", "JIRADRAFTWORKFLOWS");
        addMetadata();
    }

    public QJiradraftworkflows(String variable, String schema, String table) {
        super(QJiradraftworkflows.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJiradraftworkflows(Path<? extends QJiradraftworkflows> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JIRADRAFTWORKFLOWS");
        addMetadata();
    }

    public QJiradraftworkflows(PathMetadata<?> metadata) {
        super(QJiradraftworkflows.class, metadata, "PUBLIC", "JIRADRAFTWORKFLOWS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(descriptor, ColumnMetadata.named("DESCRIPTOR").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(parentname, ColumnMetadata.named("PARENTNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

