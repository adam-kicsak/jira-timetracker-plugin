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
 * QPropertystring is a Querydsl query type for QPropertystring
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPropertystring extends com.mysema.query.sql.RelationalPathBase<QPropertystring> {

    private static final long serialVersionUID = 2133330662;

    public static final QPropertystring propertystring = new QPropertystring("PROPERTYSTRING");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath propertyvalue = createString("propertyvalue");

    public final com.mysema.query.sql.PrimaryKey<QPropertystring> propertystringPk = createPrimaryKey(id);

    public QPropertystring(String variable) {
        super(QPropertystring.class, forVariable(variable), "PUBLIC", "PROPERTYSTRING");
        addMetadata();
    }

    public QPropertystring(String variable, String schema, String table) {
        super(QPropertystring.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertystring(Path<? extends QPropertystring> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROPERTYSTRING");
        addMetadata();
    }

    public QPropertystring(PathMetadata<?> metadata) {
        super(QPropertystring.class, metadata, "PUBLIC", "PROPERTYSTRING");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(propertyvalue, ColumnMetadata.named("PROPERTYVALUE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

