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
 * QFieldlayoutschemeentity is a Querydsl query type for QFieldlayoutschemeentity
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldlayoutschemeentity extends com.mysema.query.sql.RelationalPathBase<QFieldlayoutschemeentity> {

    private static final long serialVersionUID = -1046953044;

    public static final QFieldlayoutschemeentity fieldlayoutschemeentity = new QFieldlayoutschemeentity("FIELDLAYOUTSCHEMEENTITY");

    public final NumberPath<Long> fieldlayout = createNumber("fieldlayout", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QFieldlayoutschemeentity> fieldlayoutschemeentityPk = createPrimaryKey(id);

    public QFieldlayoutschemeentity(String variable) {
        super(QFieldlayoutschemeentity.class, forVariable(variable), "PUBLIC", "FIELDLAYOUTSCHEMEENTITY");
        addMetadata();
    }

    public QFieldlayoutschemeentity(String variable, String schema, String table) {
        super(QFieldlayoutschemeentity.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldlayoutschemeentity(Path<? extends QFieldlayoutschemeentity> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDLAYOUTSCHEMEENTITY");
        addMetadata();
    }

    public QFieldlayoutschemeentity(PathMetadata<?> metadata) {
        super(QFieldlayoutschemeentity.class, metadata, "PUBLIC", "FIELDLAYOUTSCHEMEENTITY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldlayout, ColumnMetadata.named("FIELDLAYOUT").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issuetype, ColumnMetadata.named("ISSUETYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

