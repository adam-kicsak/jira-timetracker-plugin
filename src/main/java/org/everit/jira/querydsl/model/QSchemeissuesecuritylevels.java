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
 * QSchemeissuesecuritylevels is a Querydsl query type for QSchemeissuesecuritylevels
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSchemeissuesecuritylevels extends com.mysema.query.sql.RelationalPathBase<QSchemeissuesecuritylevels> {

    private static final long serialVersionUID = 336016195;

    public static final QSchemeissuesecuritylevels schemeissuesecuritylevels = new QSchemeissuesecuritylevels("SCHEMEISSUESECURITYLEVELS");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QSchemeissuesecuritylevels> schemeissuesecuritylevelsPk = createPrimaryKey(id);

    public QSchemeissuesecuritylevels(String variable) {
        super(QSchemeissuesecuritylevels.class, forVariable(variable), "PUBLIC", "SCHEMEISSUESECURITYLEVELS");
        addMetadata();
    }

    public QSchemeissuesecuritylevels(String variable, String schema, String table) {
        super(QSchemeissuesecuritylevels.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSchemeissuesecuritylevels(Path<? extends QSchemeissuesecuritylevels> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SCHEMEISSUESECURITYLEVELS");
        addMetadata();
    }

    public QSchemeissuesecuritylevels(PathMetadata<?> metadata) {
        super(QSchemeissuesecuritylevels.class, metadata, "PUBLIC", "SCHEMEISSUESECURITYLEVELS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(4).ofType(Types.BIGINT).withSize(19));
    }

}

