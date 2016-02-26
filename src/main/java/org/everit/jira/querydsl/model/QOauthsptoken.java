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
 * QOauthsptoken is a Querydsl query type for QOauthsptoken
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QOauthsptoken extends com.mysema.query.sql.RelationalPathBase<QOauthsptoken> {

    private static final long serialVersionUID = -1564067835;

    public static final QOauthsptoken oauthsptoken = new QOauthsptoken("OAUTHSPTOKEN");

    public final StringPath callback = createString("callback");

    public final StringPath consumerKey = createString("consumerKey");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> sessionCreationTime = createDateTime("sessionCreationTime", java.sql.Timestamp.class);

    public final StringPath sessionHandle = createString("sessionHandle");

    public final DateTimePath<java.sql.Timestamp> sessionLastRenewalTime = createDateTime("sessionLastRenewalTime", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> sessionTimeToLive = createDateTime("sessionTimeToLive", java.sql.Timestamp.class);

    public final StringPath spauth = createString("spauth");

    public final StringPath spverifier = createString("spverifier");

    public final StringPath spversion = createString("spversion");

    public final StringPath token = createString("token");

    public final StringPath tokenSecret = createString("tokenSecret");

    public final StringPath tokenType = createString("tokenType");

    public final NumberPath<Long> ttl = createNumber("ttl", Long.class);

    public final StringPath username = createString("username");

    public final com.mysema.query.sql.PrimaryKey<QOauthsptoken> oauthsptokenPk = createPrimaryKey(id);

    public QOauthsptoken(String variable) {
        super(QOauthsptoken.class, forVariable(variable), "PUBLIC", "OAUTHSPTOKEN");
        addMetadata();
    }

    public QOauthsptoken(String variable, String schema, String table) {
        super(QOauthsptoken.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOauthsptoken(Path<? extends QOauthsptoken> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OAUTHSPTOKEN");
        addMetadata();
    }

    public QOauthsptoken(PathMetadata<?> metadata) {
        super(QOauthsptoken.class, metadata, "PUBLIC", "OAUTHSPTOKEN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(callback, ColumnMetadata.named("CALLBACK").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(consumerKey, ColumnMetadata.named("CONSUMER_KEY").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(sessionCreationTime, ColumnMetadata.named("SESSION_CREATION_TIME").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(sessionHandle, ColumnMetadata.named("SESSION_HANDLE").withIndex(13).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sessionLastRenewalTime, ColumnMetadata.named("SESSION_LAST_RENEWAL_TIME").withIndex(15).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(sessionTimeToLive, ColumnMetadata.named("SESSION_TIME_TO_LIVE").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(spauth, ColumnMetadata.named("SPAUTH").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(spverifier, ColumnMetadata.named("SPVERIFIER").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(spversion, ColumnMetadata.named("SPVERSION").withIndex(12).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(token, ColumnMetadata.named("TOKEN").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(tokenSecret, ColumnMetadata.named("TOKEN_SECRET").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(tokenType, ColumnMetadata.named("TOKEN_TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(ttl, ColumnMetadata.named("TTL").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(username, ColumnMetadata.named("USERNAME").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

