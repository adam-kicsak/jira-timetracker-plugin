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
 * QJiraaction is a Querydsl query type for QJiraaction
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJiraaction extends com.mysema.query.sql.RelationalPathBase<QJiraaction> {

    private static final long serialVersionUID = 2096753700;

    public static final QJiraaction jiraaction = new QJiraaction("JIRAACTION");

    public final StringPath actionbody = createString("actionbody");

    public final StringPath actionlevel = createString("actionlevel");

    public final NumberPath<Long> actionnum = createNumber("actionnum", Long.class);

    public final StringPath actiontype = createString("actiontype");

    public final StringPath author = createString("author");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final NumberPath<Long> rolelevel = createNumber("rolelevel", Long.class);

    public final StringPath updateauthor = createString("updateauthor");

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final com.mysema.query.sql.PrimaryKey<QJiraaction> jiraactionPk = createPrimaryKey(id);

    public QJiraaction(String variable) {
        super(QJiraaction.class, forVariable(variable), "PUBLIC", "JIRAACTION");
        addMetadata();
    }

    public QJiraaction(String variable, String schema, String table) {
        super(QJiraaction.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJiraaction(Path<? extends QJiraaction> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JIRAACTION");
        addMetadata();
    }

    public QJiraaction(PathMetadata<?> metadata) {
        super(QJiraaction.class, metadata, "PUBLIC", "JIRAACTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionbody, ColumnMetadata.named("ACTIONBODY").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(actionlevel, ColumnMetadata.named("ACTIONLEVEL").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(actionnum, ColumnMetadata.named("ACTIONNUM").withIndex(11).ofType(Types.BIGINT).withSize(19));
        addMetadata(actiontype, ColumnMetadata.named("ACTIONTYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(author, ColumnMetadata.named("AUTHOR").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issueid, ColumnMetadata.named("ISSUEID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(rolelevel, ColumnMetadata.named("ROLELEVEL").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(updateauthor, ColumnMetadata.named("UPDATEAUTHOR").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updated, ColumnMetadata.named("UPDATED").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
    }

}

