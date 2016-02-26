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
 * QFieldlayoutitem is a Querydsl query type for QFieldlayoutitem
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldlayoutitem extends com.mysema.query.sql.RelationalPathBase<QFieldlayoutitem> {

    private static final long serialVersionUID = 1629280503;

    public static final QFieldlayoutitem fieldlayoutitem = new QFieldlayoutitem("FIELDLAYOUTITEM");

    public final StringPath description = createString("description");

    public final StringPath fieldidentifier = createString("fieldidentifier");

    public final NumberPath<Long> fieldlayout = createNumber("fieldlayout", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ishidden = createString("ishidden");

    public final StringPath isrequired = createString("isrequired");

    public final StringPath renderertype = createString("renderertype");

    public final NumberPath<Long> verticalposition = createNumber("verticalposition", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QFieldlayoutitem> fieldlayoutitemPk = createPrimaryKey(id);

    public QFieldlayoutitem(String variable) {
        super(QFieldlayoutitem.class, forVariable(variable), "PUBLIC", "FIELDLAYOUTITEM");
        addMetadata();
    }

    public QFieldlayoutitem(String variable, String schema, String table) {
        super(QFieldlayoutitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldlayoutitem(Path<? extends QFieldlayoutitem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDLAYOUTITEM");
        addMetadata();
    }

    public QFieldlayoutitem(PathMetadata<?> metadata) {
        super(QFieldlayoutitem.class, metadata, "PUBLIC", "FIELDLAYOUTITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldidentifier, ColumnMetadata.named("FIELDIDENTIFIER").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldlayout, ColumnMetadata.named("FIELDLAYOUT").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(ishidden, ColumnMetadata.named("ISHIDDEN").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(isrequired, ColumnMetadata.named("ISREQUIRED").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(renderertype, ColumnMetadata.named("RENDERERTYPE").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(verticalposition, ColumnMetadata.named("VERTICALPOSITION").withIndex(5).ofType(Types.BIGINT).withSize(19));
    }

}

