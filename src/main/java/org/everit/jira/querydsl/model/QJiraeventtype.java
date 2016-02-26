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
 * QJiraeventtype is a Querydsl query type for QJiraeventtype
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJiraeventtype extends com.mysema.query.sql.RelationalPathBase<QJiraeventtype> {

    private static final long serialVersionUID = -1780692954;

    public static final QJiraeventtype jiraeventtype = new QJiraeventtype("JIRAEVENTTYPE");

    public final StringPath description = createString("description");

    public final StringPath eventType = createString("eventType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> templateId = createNumber("templateId", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QJiraeventtype> jiraeventtypePk = createPrimaryKey(id);

    public QJiraeventtype(String variable) {
        super(QJiraeventtype.class, forVariable(variable), "PUBLIC", "JIRAEVENTTYPE");
        addMetadata();
    }

    public QJiraeventtype(String variable, String schema, String table) {
        super(QJiraeventtype.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJiraeventtype(Path<? extends QJiraeventtype> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JIRAEVENTTYPE");
        addMetadata();
    }

    public QJiraeventtype(PathMetadata<?> metadata) {
        super(QJiraeventtype.class, metadata, "PUBLIC", "JIRAEVENTTYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(eventType, ColumnMetadata.named("EVENT_TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(templateId, ColumnMetadata.named("TEMPLATE_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

