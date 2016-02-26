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
 * QClusternodeheartbeat is a Querydsl query type for QClusternodeheartbeat
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QClusternodeheartbeat extends com.mysema.query.sql.RelationalPathBase<QClusternodeheartbeat> {

    private static final long serialVersionUID = 508004928;

    public static final QClusternodeheartbeat clusternodeheartbeat = new QClusternodeheartbeat("CLUSTERNODEHEARTBEAT");

    public final NumberPath<Long> databaseTime = createNumber("databaseTime", Long.class);

    public final NumberPath<Long> heartbeatTime = createNumber("heartbeatTime", Long.class);

    public final StringPath nodeId = createString("nodeId");

    public final com.mysema.query.sql.PrimaryKey<QClusternodeheartbeat> clusternodeheartbeatPk = createPrimaryKey(nodeId);

    public QClusternodeheartbeat(String variable) {
        super(QClusternodeheartbeat.class, forVariable(variable), "PUBLIC", "CLUSTERNODEHEARTBEAT");
        addMetadata();
    }

    public QClusternodeheartbeat(String variable, String schema, String table) {
        super(QClusternodeheartbeat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QClusternodeheartbeat(Path<? extends QClusternodeheartbeat> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CLUSTERNODEHEARTBEAT");
        addMetadata();
    }

    public QClusternodeheartbeat(PathMetadata<?> metadata) {
        super(QClusternodeheartbeat.class, metadata, "PUBLIC", "CLUSTERNODEHEARTBEAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseTime, ColumnMetadata.named("DATABASE_TIME").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(heartbeatTime, ColumnMetadata.named("HEARTBEAT_TIME").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(nodeId, ColumnMetadata.named("NODE_ID").withIndex(1).ofType(Types.VARCHAR).withSize(2147483647).notNull());
    }

}

