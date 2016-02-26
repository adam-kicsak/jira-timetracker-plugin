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
 * QFieldconfigscheme is a Querydsl query type for QFieldconfigscheme
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldconfigscheme extends com.mysema.query.sql.RelationalPathBase<QFieldconfigscheme> {

    private static final long serialVersionUID = 954253473;

    public static final QFieldconfigscheme fieldconfigscheme = new QFieldconfigscheme("FIELDCONFIGSCHEME");

    public final StringPath configname = createString("configname");

    public final NumberPath<Long> customfield = createNumber("customfield", Long.class);

    public final StringPath description = createString("description");

    public final StringPath fieldid = createString("fieldid");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QFieldconfigscheme> fieldconfigschemePk = createPrimaryKey(id);

    public QFieldconfigscheme(String variable) {
        super(QFieldconfigscheme.class, forVariable(variable), "PUBLIC", "FIELDCONFIGSCHEME");
        addMetadata();
    }

    public QFieldconfigscheme(String variable, String schema, String table) {
        super(QFieldconfigscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldconfigscheme(Path<? extends QFieldconfigscheme> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDCONFIGSCHEME");
        addMetadata();
    }

    public QFieldconfigscheme(PathMetadata<?> metadata) {
        super(QFieldconfigscheme.class, metadata, "PUBLIC", "FIELDCONFIGSCHEME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(configname, ColumnMetadata.named("CONFIGNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(customfield, ColumnMetadata.named("CUSTOMFIELD").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldid, ColumnMetadata.named("FIELDID").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

