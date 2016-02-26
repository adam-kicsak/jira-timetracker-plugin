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
 * QOsCurrentstepPrev is a Querydsl query type for QOsCurrentstepPrev
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QOsCurrentstepPrev extends com.mysema.query.sql.RelationalPathBase<QOsCurrentstepPrev> {

    private static final long serialVersionUID = 1356576852;

    public static final QOsCurrentstepPrev osCurrentstepPrev = new QOsCurrentstepPrev("OS_CURRENTSTEP_PREV");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> previousId = createNumber("previousId", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QOsCurrentstepPrev> osCurrentstepPrevPk = createPrimaryKey(id, previousId);

    public QOsCurrentstepPrev(String variable) {
        super(QOsCurrentstepPrev.class, forVariable(variable), "PUBLIC", "OS_CURRENTSTEP_PREV");
        addMetadata();
    }

    public QOsCurrentstepPrev(String variable, String schema, String table) {
        super(QOsCurrentstepPrev.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOsCurrentstepPrev(Path<? extends QOsCurrentstepPrev> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OS_CURRENTSTEP_PREV");
        addMetadata();
    }

    public QOsCurrentstepPrev(PathMetadata<?> metadata) {
        super(QOsCurrentstepPrev.class, metadata, "PUBLIC", "OS_CURRENTSTEP_PREV");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(previousId, ColumnMetadata.named("PREVIOUS_ID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

