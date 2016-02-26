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
 * QMailserver is a Querydsl query type for QMailserver
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QMailserver extends com.mysema.query.sql.RelationalPathBase<QMailserver> {

    private static final long serialVersionUID = 1971286138;

    public static final QMailserver mailserver = new QMailserver("MAILSERVER");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath istlsrequired = createString("istlsrequired");

    public final StringPath jndilocation = createString("jndilocation");

    public final StringPath mailfrom = createString("mailfrom");

    public final StringPath mailpassword = createString("mailpassword");

    public final StringPath mailusername = createString("mailusername");

    public final StringPath name = createString("name");

    public final StringPath prefix = createString("prefix");

    public final StringPath protocol = createString("protocol");

    public final StringPath servername = createString("servername");

    public final StringPath serverType = createString("serverType");

    public final StringPath smtpPort = createString("smtpPort");

    public final StringPath socksHost = createString("socksHost");

    public final StringPath socksPort = createString("socksPort");

    public final NumberPath<Long> timeout = createNumber("timeout", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QMailserver> mailserverPk = createPrimaryKey(id);

    public QMailserver(String variable) {
        super(QMailserver.class, forVariable(variable), "PUBLIC", "MAILSERVER");
        addMetadata();
    }

    public QMailserver(String variable, String schema, String table) {
        super(QMailserver.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMailserver(Path<? extends QMailserver> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "MAILSERVER");
        addMetadata();
    }

    public QMailserver(PathMetadata<?> metadata) {
        super(QMailserver.class, metadata, "PUBLIC", "MAILSERVER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(istlsrequired, ColumnMetadata.named("ISTLSREQUIRED").withIndex(13).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(jndilocation, ColumnMetadata.named("JNDILOCATION").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(mailfrom, ColumnMetadata.named("MAILFROM").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(mailpassword, ColumnMetadata.named("MAILPASSWORD").withIndex(12).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(mailusername, ColumnMetadata.named("MAILUSERNAME").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(prefix, ColumnMetadata.named("PREFIX").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(protocol, ColumnMetadata.named("PROTOCOL").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(servername, ColumnMetadata.named("SERVERNAME").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(serverType, ColumnMetadata.named("SERVER_TYPE").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(smtpPort, ColumnMetadata.named("SMTP_PORT").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(socksHost, ColumnMetadata.named("SOCKS_HOST").withIndex(16).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(socksPort, ColumnMetadata.named("SOCKS_PORT").withIndex(15).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(timeout, ColumnMetadata.named("TIMEOUT").withIndex(14).ofType(Types.BIGINT).withSize(19));
    }

}

