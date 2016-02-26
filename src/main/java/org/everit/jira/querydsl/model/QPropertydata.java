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
 * QPropertydata is a Querydsl query type for QPropertydata
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPropertydata extends com.mysema.query.sql.RelationalPathBase<QPropertydata> {

    private static final long serialVersionUID = 493374399;

    public static final QPropertydata propertydata = new QPropertydata("PROPERTYDATA");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SimplePath<Object> propertyvalue = createSimple("propertyvalue", Object.class);

    public final com.mysema.query.sql.PrimaryKey<QPropertydata> propertydataPk = createPrimaryKey(id);

    public QPropertydata(String variable) {
        super(QPropertydata.class, forVariable(variable), "PUBLIC", "PROPERTYDATA");
        addMetadata();
    }

    public QPropertydata(String variable, String schema, String table) {
        super(QPropertydata.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertydata(Path<? extends QPropertydata> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROPERTYDATA");
        addMetadata();
    }

    public QPropertydata(PathMetadata<?> metadata) {
        super(QPropertydata.class, metadata, "PUBLIC", "PROPERTYDATA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(propertyvalue, ColumnMetadata.named("PROPERTYVALUE").withIndex(2).ofType(Types.OTHER).withSize(2147483647));
    }

}

