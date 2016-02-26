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
 * QGenericconfiguration is a Querydsl query type for QGenericconfiguration
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QGenericconfiguration extends com.mysema.query.sql.RelationalPathBase<QGenericconfiguration> {

    private static final long serialVersionUID = -960425665;

    public static final QGenericconfiguration genericconfiguration = new QGenericconfiguration("GENERICCONFIGURATION");

    public final StringPath datakey = createString("datakey");

    public final StringPath datatype = createString("datatype");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath xmlvalue = createString("xmlvalue");

    public final com.mysema.query.sql.PrimaryKey<QGenericconfiguration> genericconfigurationPk = createPrimaryKey(id);

    public QGenericconfiguration(String variable) {
        super(QGenericconfiguration.class, forVariable(variable), "PUBLIC", "GENERICCONFIGURATION");
        addMetadata();
    }

    public QGenericconfiguration(String variable, String schema, String table) {
        super(QGenericconfiguration.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGenericconfiguration(Path<? extends QGenericconfiguration> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "GENERICCONFIGURATION");
        addMetadata();
    }

    public QGenericconfiguration(PathMetadata<?> metadata) {
        super(QGenericconfiguration.class, metadata, "PUBLIC", "GENERICCONFIGURATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(datakey, ColumnMetadata.named("DATAKEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(datatype, ColumnMetadata.named("DATATYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(xmlvalue, ColumnMetadata.named("XMLVALUE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

