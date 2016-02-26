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
 * QNotificationscheme is a Querydsl query type for QNotificationscheme
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QNotificationscheme extends com.mysema.query.sql.RelationalPathBase<QNotificationscheme> {

    private static final long serialVersionUID = 841941776;

    public static final QNotificationscheme notificationscheme = new QNotificationscheme("NOTIFICATIONSCHEME");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QNotificationscheme> notificationschemePk = createPrimaryKey(id);

    public QNotificationscheme(String variable) {
        super(QNotificationscheme.class, forVariable(variable), "PUBLIC", "NOTIFICATIONSCHEME");
        addMetadata();
    }

    public QNotificationscheme(String variable, String schema, String table) {
        super(QNotificationscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNotificationscheme(Path<? extends QNotificationscheme> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "NOTIFICATIONSCHEME");
        addMetadata();
    }

    public QNotificationscheme(PathMetadata<?> metadata) {
        super(QNotificationscheme.class, metadata, "PUBLIC", "NOTIFICATIONSCHEME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

