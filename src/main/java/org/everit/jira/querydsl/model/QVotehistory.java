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
 * QVotehistory is a Querydsl query type for QVotehistory
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QVotehistory extends com.mysema.query.sql.RelationalPathBase<QVotehistory> {

    private static final long serialVersionUID = 457297322;

    public static final QVotehistory votehistory = new QVotehistory("VOTEHISTORY");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final DateTimePath<java.sql.Timestamp> timestamp = createDateTime("timestamp", java.sql.Timestamp.class);

    public final NumberPath<Long> votes = createNumber("votes", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QVotehistory> votehistoryPk = createPrimaryKey(id);

    public QVotehistory(String variable) {
        super(QVotehistory.class, forVariable(variable), "PUBLIC", "VOTEHISTORY");
        addMetadata();
    }

    public QVotehistory(String variable, String schema, String table) {
        super(QVotehistory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVotehistory(Path<? extends QVotehistory> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "VOTEHISTORY");
        addMetadata();
    }

    public QVotehistory(PathMetadata<?> metadata) {
        super(QVotehistory.class, metadata, "PUBLIC", "VOTEHISTORY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issueid, ColumnMetadata.named("ISSUEID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(timestamp, ColumnMetadata.named("TIMESTAMP").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(votes, ColumnMetadata.named("VOTES").withIndex(3).ofType(Types.BIGINT).withSize(19));
    }

}

