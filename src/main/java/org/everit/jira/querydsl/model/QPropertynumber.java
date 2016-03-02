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
 * QPropertynumber is a Querydsl query type for QPropertynumber
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPropertynumber extends com.mysema.query.sql.RelationalPathBase<QPropertynumber> {

    private static final long serialVersionUID = 1990952478;

    public static final QPropertynumber propertynumber = new QPropertynumber("PROPERTYNUMBER");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> propertyvalue = createNumber("propertyvalue", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QPropertynumber> propertynumberPk = createPrimaryKey(id);

    public QPropertynumber(String variable) {
        super(QPropertynumber.class, forVariable(variable), "PUBLIC", "PROPERTYNUMBER");
        addMetadata();
    }

    public QPropertynumber(String variable, String schema, String table) {
        super(QPropertynumber.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertynumber(Path<? extends QPropertynumber> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROPERTYNUMBER");
        addMetadata();
    }

    public QPropertynumber(PathMetadata<?> metadata) {
        super(QPropertynumber.class, metadata, "PUBLIC", "PROPERTYNUMBER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(propertyvalue, ColumnMetadata.named("PROPERTYVALUE").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}
