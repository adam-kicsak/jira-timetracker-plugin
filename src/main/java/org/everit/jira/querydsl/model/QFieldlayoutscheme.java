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
 * QFieldlayoutscheme is a Querydsl query type for QFieldlayoutscheme
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldlayoutscheme extends com.mysema.query.sql.RelationalPathBase<QFieldlayoutscheme> {

    private static final long serialVersionUID = -1653822839;

    public static final QFieldlayoutscheme fieldlayoutscheme = new QFieldlayoutscheme("FIELDLAYOUTSCHEME");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QFieldlayoutscheme> fieldlayoutschemePk = createPrimaryKey(id);

    public QFieldlayoutscheme(String variable) {
        super(QFieldlayoutscheme.class, forVariable(variable), "PUBLIC", "FIELDLAYOUTSCHEME");
        addMetadata();
    }

    public QFieldlayoutscheme(String variable, String schema, String table) {
        super(QFieldlayoutscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldlayoutscheme(Path<? extends QFieldlayoutscheme> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDLAYOUTSCHEME");
        addMetadata();
    }

    public QFieldlayoutscheme(PathMetadata<?> metadata) {
        super(QFieldlayoutscheme.class, metadata, "PUBLIC", "FIELDLAYOUTSCHEME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

