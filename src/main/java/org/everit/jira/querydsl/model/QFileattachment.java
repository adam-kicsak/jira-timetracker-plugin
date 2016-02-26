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
 * QFileattachment is a Querydsl query type for QFileattachment
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFileattachment extends com.mysema.query.sql.RelationalPathBase<QFileattachment> {

    private static final long serialVersionUID = 315548767;

    public static final QFileattachment fileattachment = new QFileattachment("FILEATTACHMENT");

    public final StringPath author = createString("author");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath filename = createString("filename");

    public final NumberPath<Long> filesize = createNumber("filesize", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final StringPath mimetype = createString("mimetype");

    public final NumberPath<Integer> thumbnailable = createNumber("thumbnailable", Integer.class);

    public final NumberPath<Integer> zip = createNumber("zip", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QFileattachment> fileattachmentPk = createPrimaryKey(id);

    public QFileattachment(String variable) {
        super(QFileattachment.class, forVariable(variable), "PUBLIC", "FILEATTACHMENT");
        addMetadata();
    }

    public QFileattachment(String variable, String schema, String table) {
        super(QFileattachment.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFileattachment(Path<? extends QFileattachment> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FILEATTACHMENT");
        addMetadata();
    }

    public QFileattachment(PathMetadata<?> metadata) {
        super(QFileattachment.class, metadata, "PUBLIC", "FILEATTACHMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(author, ColumnMetadata.named("AUTHOR").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(filename, ColumnMetadata.named("FILENAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(filesize, ColumnMetadata.named("FILESIZE").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issueid, ColumnMetadata.named("ISSUEID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(mimetype, ColumnMetadata.named("MIMETYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(thumbnailable, ColumnMetadata.named("THUMBNAILABLE").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(zip, ColumnMetadata.named("ZIP").withIndex(8).ofType(Types.INTEGER).withSize(10));
    }

}

