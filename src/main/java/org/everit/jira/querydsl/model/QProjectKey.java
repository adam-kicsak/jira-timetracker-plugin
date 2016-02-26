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
 * QProjectKey is a Querydsl query type for QProjectKey
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QProjectKey extends com.mysema.query.sql.RelationalPathBase<QProjectKey> {

    private static final long serialVersionUID = 409073990;

    public static final QProjectKey projectKey1 = new QProjectKey("PROJECT_KEY");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> projectId = createNumber("projectId", Long.class);

    public final StringPath projectKey = createString("projectKey");

    public final com.mysema.query.sql.PrimaryKey<QProjectKey> projectKeyPk = createPrimaryKey(id);

    public QProjectKey(String variable) {
        super(QProjectKey.class, forVariable(variable), "PUBLIC", "PROJECT_KEY");
        addMetadata();
    }

    public QProjectKey(String variable, String schema, String table) {
        super(QProjectKey.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectKey(Path<? extends QProjectKey> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROJECT_KEY");
        addMetadata();
    }

    public QProjectKey(PathMetadata<?> metadata) {
        super(QProjectKey.class, metadata, "PUBLIC", "PROJECT_KEY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(projectId, ColumnMetadata.named("PROJECT_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(projectKey, ColumnMetadata.named("PROJECT_KEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

