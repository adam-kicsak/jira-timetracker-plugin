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
 * QJquartzLocks is a Querydsl query type for QJquartzLocks
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzLocks extends com.mysema.query.sql.RelationalPathBase<QJquartzLocks> {

    private static final long serialVersionUID = 471045347;

    public static final QJquartzLocks jquartzLocks = new QJquartzLocks("JQUARTZ_LOCKS");

    public final StringPath lockName = createString("lockName");

    public final StringPath schedName = createString("schedName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzLocks> jquartzLocksPk = createPrimaryKey(lockName);

    public QJquartzLocks(String variable) {
        super(QJquartzLocks.class, forVariable(variable), "PUBLIC", "JQUARTZ_LOCKS");
        addMetadata();
    }

    public QJquartzLocks(String variable, String schema, String table) {
        super(QJquartzLocks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzLocks(Path<? extends QJquartzLocks> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_LOCKS");
        addMetadata();
    }

    public QJquartzLocks(PathMetadata<?> metadata) {
        super(QJquartzLocks.class, metadata, "PUBLIC", "JQUARTZ_LOCKS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(lockName, ColumnMetadata.named("LOCK_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(40).notNull());
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
    }

}

