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
 * QManagedconfigurationitem is a Querydsl query type for QManagedconfigurationitem
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QManagedconfigurationitem extends com.mysema.query.sql.RelationalPathBase<QManagedconfigurationitem> {

    private static final long serialVersionUID = -1739778038;

    public static final QManagedconfigurationitem managedconfigurationitem = new QManagedconfigurationitem("MANAGEDCONFIGURATIONITEM");

    public final StringPath accessLevel = createString("accessLevel");

    public final StringPath descriptionKey = createString("descriptionKey");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath itemId = createString("itemId");

    public final StringPath itemType = createString("itemType");

    public final StringPath managed = createString("managed");

    public final StringPath source = createString("source");

    public final com.mysema.query.sql.PrimaryKey<QManagedconfigurationitem> managedconfigurationitemPk = createPrimaryKey(id);

    public QManagedconfigurationitem(String variable) {
        super(QManagedconfigurationitem.class, forVariable(variable), "PUBLIC", "MANAGEDCONFIGURATIONITEM");
        addMetadata();
    }

    public QManagedconfigurationitem(String variable, String schema, String table) {
        super(QManagedconfigurationitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QManagedconfigurationitem(Path<? extends QManagedconfigurationitem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "MANAGEDCONFIGURATIONITEM");
        addMetadata();
    }

    public QManagedconfigurationitem(PathMetadata<?> metadata) {
        super(QManagedconfigurationitem.class, metadata, "PUBLIC", "MANAGEDCONFIGURATIONITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(accessLevel, ColumnMetadata.named("ACCESS_LEVEL").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(descriptionKey, ColumnMetadata.named("DESCRIPTION_KEY").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(itemId, ColumnMetadata.named("ITEM_ID").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(itemType, ColumnMetadata.named("ITEM_TYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(managed, ColumnMetadata.named("MANAGED").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(source, ColumnMetadata.named("SOURCE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

