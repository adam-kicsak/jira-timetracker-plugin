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
 * QEntityPropertyIndexDocument is a Querydsl query type for QEntityPropertyIndexDocument
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QEntityPropertyIndexDocument extends com.mysema.query.sql.RelationalPathBase<QEntityPropertyIndexDocument> {

    private static final long serialVersionUID = 876240725;

    public static final QEntityPropertyIndexDocument entityPropertyIndexDocument = new QEntityPropertyIndexDocument("ENTITY_PROPERTY_INDEX_DOCUMENT");

    public final StringPath document = createString("document");

    public final StringPath entityKey = createString("entityKey");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath moduleKey = createString("moduleKey");

    public final StringPath pluginKey = createString("pluginKey");

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final com.mysema.query.sql.PrimaryKey<QEntityPropertyIndexDocument> entityPropertyIndexDocumPk = createPrimaryKey(id);

    public QEntityPropertyIndexDocument(String variable) {
        super(QEntityPropertyIndexDocument.class, forVariable(variable), "PUBLIC", "ENTITY_PROPERTY_INDEX_DOCUMENT");
        addMetadata();
    }

    public QEntityPropertyIndexDocument(String variable, String schema, String table) {
        super(QEntityPropertyIndexDocument.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEntityPropertyIndexDocument(Path<? extends QEntityPropertyIndexDocument> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "ENTITY_PROPERTY_INDEX_DOCUMENT");
        addMetadata();
    }

    public QEntityPropertyIndexDocument(PathMetadata<?> metadata) {
        super(QEntityPropertyIndexDocument.class, metadata, "PUBLIC", "ENTITY_PROPERTY_INDEX_DOCUMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(document, ColumnMetadata.named("DOCUMENT").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(entityKey, ColumnMetadata.named("ENTITY_KEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(moduleKey, ColumnMetadata.named("MODULE_KEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(pluginKey, ColumnMetadata.named("PLUGIN_KEY").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updated, ColumnMetadata.named("UPDATED").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
    }

}

