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
 * QUserpickerfilter is a Querydsl query type for QUserpickerfilter
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUserpickerfilter extends com.mysema.query.sql.RelationalPathBase<QUserpickerfilter> {

    private static final long serialVersionUID = -1195158127;

    public static final QUserpickerfilter userpickerfilter = new QUserpickerfilter("USERPICKERFILTER");

    public final NumberPath<Long> customfield = createNumber("customfield", Long.class);

    public final NumberPath<Long> customfieldconfig = createNumber("customfieldconfig", Long.class);

    public final StringPath enabled = createString("enabled");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QUserpickerfilter> userpickerfilterPk = createPrimaryKey(id);

    public QUserpickerfilter(String variable) {
        super(QUserpickerfilter.class, forVariable(variable), "PUBLIC", "USERPICKERFILTER");
        addMetadata();
    }

    public QUserpickerfilter(String variable, String schema, String table) {
        super(QUserpickerfilter.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserpickerfilter(Path<? extends QUserpickerfilter> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "USERPICKERFILTER");
        addMetadata();
    }

    public QUserpickerfilter(PathMetadata<?> metadata) {
        super(QUserpickerfilter.class, metadata, "PUBLIC", "USERPICKERFILTER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(customfield, ColumnMetadata.named("CUSTOMFIELD").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(customfieldconfig, ColumnMetadata.named("CUSTOMFIELDCONFIG").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(enabled, ColumnMetadata.named("ENABLED").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

