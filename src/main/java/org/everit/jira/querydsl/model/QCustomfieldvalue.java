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
 * QCustomfieldvalue is a Querydsl query type for QCustomfieldvalue
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCustomfieldvalue extends com.mysema.query.sql.RelationalPathBase<QCustomfieldvalue> {

    private static final long serialVersionUID = -2022228056;

    public static final QCustomfieldvalue customfieldvalue = new QCustomfieldvalue("CUSTOMFIELDVALUE");

    public final NumberPath<Long> customfield = createNumber("customfield", Long.class);

    public final DateTimePath<java.sql.Timestamp> datevalue = createDateTime("datevalue", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issue = createNumber("issue", Long.class);

    public final NumberPath<Double> numbervalue = createNumber("numbervalue", Double.class);

    public final StringPath parentkey = createString("parentkey");

    public final StringPath stringvalue = createString("stringvalue");

    public final StringPath textvalue = createString("textvalue");

    public final StringPath valuetype = createString("valuetype");

    public final com.mysema.query.sql.PrimaryKey<QCustomfieldvalue> customfieldvaluePk = createPrimaryKey(id);

    public QCustomfieldvalue(String variable) {
        super(QCustomfieldvalue.class, forVariable(variable), "PUBLIC", "CUSTOMFIELDVALUE");
        addMetadata();
    }

    public QCustomfieldvalue(String variable, String schema, String table) {
        super(QCustomfieldvalue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCustomfieldvalue(Path<? extends QCustomfieldvalue> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CUSTOMFIELDVALUE");
        addMetadata();
    }

    public QCustomfieldvalue(PathMetadata<?> metadata) {
        super(QCustomfieldvalue.class, metadata, "PUBLIC", "CUSTOMFIELDVALUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(customfield, ColumnMetadata.named("CUSTOMFIELD").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(datevalue, ColumnMetadata.named("DATEVALUE").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issue, ColumnMetadata.named("ISSUE").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(numbervalue, ColumnMetadata.named("NUMBERVALUE").withIndex(6).ofType(Types.DOUBLE).withSize(17));
        addMetadata(parentkey, ColumnMetadata.named("PARENTKEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(stringvalue, ColumnMetadata.named("STRINGVALUE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(textvalue, ColumnMetadata.named("TEXTVALUE").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(valuetype, ColumnMetadata.named("VALUETYPE").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

