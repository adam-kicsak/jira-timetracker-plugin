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
 * QPropertytext is a Querydsl query type for QPropertytext
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPropertytext extends com.mysema.query.sql.RelationalPathBase<QPropertytext> {

    private static final long serialVersionUID = 493855042;

    public static final QPropertytext propertytext = new QPropertytext("PROPERTYTEXT");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath propertyvalue = createString("propertyvalue");

    public final com.mysema.query.sql.PrimaryKey<QPropertytext> propertytextPk = createPrimaryKey(id);

    public QPropertytext(String variable) {
        super(QPropertytext.class, forVariable(variable), "PUBLIC", "PROPERTYTEXT");
        addMetadata();
    }

    public QPropertytext(String variable, String schema, String table) {
        super(QPropertytext.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertytext(Path<? extends QPropertytext> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROPERTYTEXT");
        addMetadata();
    }

    public QPropertytext(PathMetadata<?> metadata) {
        super(QPropertytext.class, metadata, "PUBLIC", "PROPERTYTEXT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(propertyvalue, ColumnMetadata.named("PROPERTYVALUE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

