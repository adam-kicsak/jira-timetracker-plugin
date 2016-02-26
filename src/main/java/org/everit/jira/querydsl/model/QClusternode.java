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
 * QClusternode is a Querydsl query type for QClusternode
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QClusternode extends com.mysema.query.sql.RelationalPathBase<QClusternode> {

    private static final long serialVersionUID = -404248004;

    public static final QClusternode clusternode = new QClusternode("CLUSTERNODE");

    public final NumberPath<Long> cacheListenerPort = createNumber("cacheListenerPort", Long.class);

    public final StringPath ip = createString("ip");

    public final StringPath nodeId = createString("nodeId");

    public final StringPath nodeState = createString("nodeState");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QClusternode> clusternodePk = createPrimaryKey(nodeId);

    public QClusternode(String variable) {
        super(QClusternode.class, forVariable(variable), "PUBLIC", "CLUSTERNODE");
        addMetadata();
    }

    public QClusternode(String variable, String schema, String table) {
        super(QClusternode.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QClusternode(Path<? extends QClusternode> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CLUSTERNODE");
        addMetadata();
    }

    public QClusternode(PathMetadata<?> metadata) {
        super(QClusternode.class, metadata, "PUBLIC", "CLUSTERNODE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cacheListenerPort, ColumnMetadata.named("CACHE_LISTENER_PORT").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(ip, ColumnMetadata.named("IP").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(nodeId, ColumnMetadata.named("NODE_ID").withIndex(1).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(nodeState, ColumnMetadata.named("NODE_STATE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(timestamp, ColumnMetadata.named("TIMESTAMP").withIndex(3).ofType(Types.BIGINT).withSize(19));
    }

}

