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
 * QColumnlayout is a Querydsl query type for QColumnlayout
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QColumnlayout extends com.mysema.query.sql.RelationalPathBase<QColumnlayout> {

    private static final long serialVersionUID = 1605363392;

    public static final QColumnlayout columnlayout = new QColumnlayout("COLUMNLAYOUT");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> searchrequest = createNumber("searchrequest", Long.class);

    public final StringPath username = createString("username");

    public final com.mysema.query.sql.PrimaryKey<QColumnlayout> columnlayoutPk = createPrimaryKey(id);

    public QColumnlayout(String variable) {
        super(QColumnlayout.class, forVariable(variable), "PUBLIC", "COLUMNLAYOUT");
        addMetadata();
    }

    public QColumnlayout(String variable, String schema, String table) {
        super(QColumnlayout.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QColumnlayout(Path<? extends QColumnlayout> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "COLUMNLAYOUT");
        addMetadata();
    }

    public QColumnlayout(PathMetadata<?> metadata) {
        super(QColumnlayout.class, metadata, "PUBLIC", "COLUMNLAYOUT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(searchrequest, ColumnMetadata.named("SEARCHREQUEST").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(username, ColumnMetadata.named("USERNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

