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
 * QIssuestatus is a Querydsl query type for QIssuestatus
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QIssuestatus extends com.mysema.query.sql.RelationalPathBase<QIssuestatus> {

    private static final long serialVersionUID = -1191433909;

    public static final QIssuestatus issuestatus = new QIssuestatus("ISSUESTATUS");

    public final StringPath description = createString("description");

    public final StringPath iconurl = createString("iconurl");

    public final StringPath id = createString("id");

    public final StringPath pname = createString("pname");

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final NumberPath<Long> statuscategory = createNumber("statuscategory", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QIssuestatus> issuestatusPk = createPrimaryKey(id);

    public QIssuestatus(String variable) {
        super(QIssuestatus.class, forVariable(variable), "PUBLIC", "ISSUESTATUS");
        addMetadata();
    }

    public QIssuestatus(String variable, String schema, String table) {
        super(QIssuestatus.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssuestatus(Path<? extends QIssuestatus> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "ISSUESTATUS");
        addMetadata();
    }

    public QIssuestatus(PathMetadata<?> metadata) {
        super(QIssuestatus.class, metadata, "PUBLIC", "ISSUESTATUS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(iconurl, ColumnMetadata.named("ICONURL").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(pname, ColumnMetadata.named("PNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(statuscategory, ColumnMetadata.named("STATUSCATEGORY").withIndex(6).ofType(Types.BIGINT).withSize(19));
    }

}

