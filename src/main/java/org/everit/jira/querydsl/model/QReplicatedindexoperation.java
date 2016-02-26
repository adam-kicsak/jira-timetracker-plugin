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
 * QReplicatedindexoperation is a Querydsl query type for QReplicatedindexoperation
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QReplicatedindexoperation extends com.mysema.query.sql.RelationalPathBase<QReplicatedindexoperation> {

    private static final long serialVersionUID = -2088557904;

    public static final QReplicatedindexoperation replicatedindexoperation = new QReplicatedindexoperation("REPLICATEDINDEXOPERATION");

    public final StringPath affectedIds = createString("affectedIds");

    public final StringPath affectedIndex = createString("affectedIndex");

    public final StringPath entityType = createString("entityType");

    public final StringPath filename = createString("filename");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> indexTime = createDateTime("indexTime", java.sql.Timestamp.class);

    public final StringPath nodeId = createString("nodeId");

    public final StringPath operation = createString("operation");

    public final com.mysema.query.sql.PrimaryKey<QReplicatedindexoperation> replicatedindexoperationPk = createPrimaryKey(id);

    public QReplicatedindexoperation(String variable) {
        super(QReplicatedindexoperation.class, forVariable(variable), "PUBLIC", "REPLICATEDINDEXOPERATION");
        addMetadata();
    }

    public QReplicatedindexoperation(String variable, String schema, String table) {
        super(QReplicatedindexoperation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QReplicatedindexoperation(Path<? extends QReplicatedindexoperation> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "REPLICATEDINDEXOPERATION");
        addMetadata();
    }

    public QReplicatedindexoperation(PathMetadata<?> metadata) {
        super(QReplicatedindexoperation.class, metadata, "PUBLIC", "REPLICATEDINDEXOPERATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(affectedIds, ColumnMetadata.named("AFFECTED_IDS").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(affectedIndex, ColumnMetadata.named("AFFECTED_INDEX").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(entityType, ColumnMetadata.named("ENTITY_TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(filename, ColumnMetadata.named("FILENAME").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(indexTime, ColumnMetadata.named("INDEX_TIME").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(nodeId, ColumnMetadata.named("NODE_ID").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(operation, ColumnMetadata.named("OPERATION").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

