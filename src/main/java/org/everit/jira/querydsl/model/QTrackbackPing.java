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
 * QTrackbackPing is a Querydsl query type for QTrackbackPing
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QTrackbackPing extends com.mysema.query.sql.RelationalPathBase<QTrackbackPing> {

    private static final long serialVersionUID = -1498264444;

    public static final QTrackbackPing trackbackPing = new QTrackbackPing("TRACKBACK_PING");

    public final StringPath blogname = createString("blogname");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath excerpt = createString("excerpt");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issue = createNumber("issue", Long.class);

    public final StringPath title = createString("title");

    public final StringPath url = createString("url");

    public final com.mysema.query.sql.PrimaryKey<QTrackbackPing> trackbackPingPk = createPrimaryKey(id);

    public QTrackbackPing(String variable) {
        super(QTrackbackPing.class, forVariable(variable), "PUBLIC", "TRACKBACK_PING");
        addMetadata();
    }

    public QTrackbackPing(String variable, String schema, String table) {
        super(QTrackbackPing.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTrackbackPing(Path<? extends QTrackbackPing> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "TRACKBACK_PING");
        addMetadata();
    }

    public QTrackbackPing(PathMetadata<?> metadata) {
        super(QTrackbackPing.class, metadata, "PUBLIC", "TRACKBACK_PING");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(blogname, ColumnMetadata.named("BLOGNAME").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(excerpt, ColumnMetadata.named("EXCERPT").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issue, ColumnMetadata.named("ISSUE").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(title, ColumnMetadata.named("TITLE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(url, ColumnMetadata.named("URL").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

