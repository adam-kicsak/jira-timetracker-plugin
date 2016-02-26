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
 * QReindexRequest is a Querydsl query type for QReindexRequest
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QReindexRequest extends com.mysema.query.sql.RelationalPathBase<QReindexRequest> {

    private static final long serialVersionUID = -890582064;

    public static final QReindexRequest reindexRequest = new QReindexRequest("REINDEX_REQUEST");

    public final DateTimePath<java.sql.Timestamp> completionTime = createDateTime("completionTime", java.sql.Timestamp.class);

    public final StringPath executionNodeId = createString("executionNodeId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> requestTime = createDateTime("requestTime", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final StringPath status = createString("status");

    public final StringPath type = createString("type");

    public final com.mysema.query.sql.PrimaryKey<QReindexRequest> reindexRequestPk = createPrimaryKey(id);

    public QReindexRequest(String variable) {
        super(QReindexRequest.class, forVariable(variable), "PUBLIC", "REINDEX_REQUEST");
        addMetadata();
    }

    public QReindexRequest(String variable, String schema, String table) {
        super(QReindexRequest.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QReindexRequest(Path<? extends QReindexRequest> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "REINDEX_REQUEST");
        addMetadata();
    }

    public QReindexRequest(PathMetadata<?> metadata) {
        super(QReindexRequest.class, metadata, "PUBLIC", "REINDEX_REQUEST");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(completionTime, ColumnMetadata.named("COMPLETION_TIME").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(executionNodeId, ColumnMetadata.named("EXECUTION_NODE_ID").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(requestTime, ColumnMetadata.named("REQUEST_TIME").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(startTime, ColumnMetadata.named("START_TIME").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(status, ColumnMetadata.named("STATUS").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(type, ColumnMetadata.named("TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

