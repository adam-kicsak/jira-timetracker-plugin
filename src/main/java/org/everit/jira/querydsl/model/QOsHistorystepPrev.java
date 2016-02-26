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
 * QOsHistorystepPrev is a Querydsl query type for QOsHistorystepPrev
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QOsHistorystepPrev extends com.mysema.query.sql.RelationalPathBase<QOsHistorystepPrev> {

    private static final long serialVersionUID = 17863791;

    public static final QOsHistorystepPrev osHistorystepPrev = new QOsHistorystepPrev("OS_HISTORYSTEP_PREV");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> previousId = createNumber("previousId", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QOsHistorystepPrev> osHistorystepPrevPk = createPrimaryKey(id, previousId);

    public QOsHistorystepPrev(String variable) {
        super(QOsHistorystepPrev.class, forVariable(variable), "PUBLIC", "OS_HISTORYSTEP_PREV");
        addMetadata();
    }

    public QOsHistorystepPrev(String variable, String schema, String table) {
        super(QOsHistorystepPrev.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOsHistorystepPrev(Path<? extends QOsHistorystepPrev> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OS_HISTORYSTEP_PREV");
        addMetadata();
    }

    public QOsHistorystepPrev(PathMetadata<?> metadata) {
        super(QOsHistorystepPrev.class, metadata, "PUBLIC", "OS_HISTORYSTEP_PREV");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(previousId, ColumnMetadata.named("PREVIOUS_ID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

