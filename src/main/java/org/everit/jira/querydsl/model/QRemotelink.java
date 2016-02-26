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
 * QRemotelink is a Querydsl query type for QRemotelink
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRemotelink extends com.mysema.query.sql.RelationalPathBase<QRemotelink> {

    private static final long serialVersionUID = -873875968;

    public static final QRemotelink remotelink = new QRemotelink("REMOTELINK");

    public final StringPath applicationname = createString("applicationname");

    public final StringPath applicationtype = createString("applicationtype");

    public final StringPath globalid = createString("globalid");

    public final StringPath icontitle = createString("icontitle");

    public final StringPath iconurl = createString("iconurl");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final StringPath relationship = createString("relationship");

    public final StringPath resolved = createString("resolved");

    public final StringPath statuscategorycolorname = createString("statuscategorycolorname");

    public final StringPath statuscategorykey = createString("statuscategorykey");

    public final StringPath statusdescription = createString("statusdescription");

    public final StringPath statusiconlink = createString("statusiconlink");

    public final StringPath statusicontitle = createString("statusicontitle");

    public final StringPath statusiconurl = createString("statusiconurl");

    public final StringPath statusname = createString("statusname");

    public final StringPath summary = createString("summary");

    public final StringPath title = createString("title");

    public final StringPath url = createString("url");

    public final com.mysema.query.sql.PrimaryKey<QRemotelink> remotelinkPk = createPrimaryKey(id);

    public QRemotelink(String variable) {
        super(QRemotelink.class, forVariable(variable), "PUBLIC", "REMOTELINK");
        addMetadata();
    }

    public QRemotelink(String variable, String schema, String table) {
        super(QRemotelink.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRemotelink(Path<? extends QRemotelink> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "REMOTELINK");
        addMetadata();
    }

    public QRemotelink(PathMetadata<?> metadata) {
        super(QRemotelink.class, metadata, "PUBLIC", "REMOTELINK");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(applicationname, ColumnMetadata.named("APPLICATIONNAME").withIndex(19).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(applicationtype, ColumnMetadata.named("APPLICATIONTYPE").withIndex(18).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(globalid, ColumnMetadata.named("GLOBALID").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(icontitle, ColumnMetadata.named("ICONTITLE").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(iconurl, ColumnMetadata.named("ICONURL").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issueid, ColumnMetadata.named("ISSUEID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(relationship, ColumnMetadata.named("RELATIONSHIP").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(resolved, ColumnMetadata.named("RESOLVED").withIndex(10).ofType(Types.CHAR).withSize(2147483647));
        addMetadata(statuscategorycolorname, ColumnMetadata.named("STATUSCATEGORYCOLORNAME").withIndex(17).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(statuscategorykey, ColumnMetadata.named("STATUSCATEGORYKEY").withIndex(16).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(statusdescription, ColumnMetadata.named("STATUSDESCRIPTION").withIndex(12).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(statusiconlink, ColumnMetadata.named("STATUSICONLINK").withIndex(15).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(statusicontitle, ColumnMetadata.named("STATUSICONTITLE").withIndex(14).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(statusiconurl, ColumnMetadata.named("STATUSICONURL").withIndex(13).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(statusname, ColumnMetadata.named("STATUSNAME").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(summary, ColumnMetadata.named("SUMMARY").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(title, ColumnMetadata.named("TITLE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(url, ColumnMetadata.named("URL").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

