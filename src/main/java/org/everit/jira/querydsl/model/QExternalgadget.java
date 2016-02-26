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
 * QExternalgadget is a Querydsl query type for QExternalgadget
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QExternalgadget extends com.mysema.query.sql.RelationalPathBase<QExternalgadget> {

    private static final long serialVersionUID = -1106479977;

    public static final QExternalgadget externalgadget = new QExternalgadget("EXTERNALGADGET");

    public final StringPath gadgetXml = createString("gadgetXml");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QExternalgadget> externalgadgetPk = createPrimaryKey(id);

    public QExternalgadget(String variable) {
        super(QExternalgadget.class, forVariable(variable), "PUBLIC", "EXTERNALGADGET");
        addMetadata();
    }

    public QExternalgadget(String variable, String schema, String table) {
        super(QExternalgadget.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExternalgadget(Path<? extends QExternalgadget> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "EXTERNALGADGET");
        addMetadata();
    }

    public QExternalgadget(PathMetadata<?> metadata) {
        super(QExternalgadget.class, metadata, "PUBLIC", "EXTERNALGADGET");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gadgetXml, ColumnMetadata.named("GADGET_XML").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

