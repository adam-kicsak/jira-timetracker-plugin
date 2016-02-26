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
 * QSearchrequest is a Querydsl query type for QSearchrequest
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSearchrequest extends com.mysema.query.sql.RelationalPathBase<QSearchrequest> {

    private static final long serialVersionUID = -122419417;

    public static final QSearchrequest searchrequest = new QSearchrequest("SEARCHREQUEST");

    public final StringPath authorname = createString("authorname");

    public final StringPath description = createString("description");

    public final NumberPath<Long> favCount = createNumber("favCount", Long.class);

    public final StringPath filtername = createString("filtername");

    public final StringPath filternameLower = createString("filternameLower");

    public final StringPath groupname = createString("groupname");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> projectid = createNumber("projectid", Long.class);

    public final StringPath reqcontent = createString("reqcontent");

    public final StringPath username = createString("username");

    public final com.mysema.query.sql.PrimaryKey<QSearchrequest> searchrequestPk = createPrimaryKey(id);

    public QSearchrequest(String variable) {
        super(QSearchrequest.class, forVariable(variable), "PUBLIC", "SEARCHREQUEST");
        addMetadata();
    }

    public QSearchrequest(String variable, String schema, String table) {
        super(QSearchrequest.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSearchrequest(Path<? extends QSearchrequest> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SEARCHREQUEST");
        addMetadata();
    }

    public QSearchrequest(PathMetadata<?> metadata) {
        super(QSearchrequest.class, metadata, "PUBLIC", "SEARCHREQUEST");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authorname, ColumnMetadata.named("AUTHORNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(favCount, ColumnMetadata.named("FAV_COUNT").withIndex(9).ofType(Types.BIGINT).withSize(19));
        addMetadata(filtername, ColumnMetadata.named("FILTERNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(filternameLower, ColumnMetadata.named("FILTERNAME_LOWER").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(groupname, ColumnMetadata.named("GROUPNAME").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(projectid, ColumnMetadata.named("PROJECTID").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(reqcontent, ColumnMetadata.named("REQCONTENT").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(username, ColumnMetadata.named("USERNAME").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

