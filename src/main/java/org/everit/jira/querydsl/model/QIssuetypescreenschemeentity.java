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
 * QIssuetypescreenschemeentity is a Querydsl query type for QIssuetypescreenschemeentity
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QIssuetypescreenschemeentity extends com.mysema.query.sql.RelationalPathBase<QIssuetypescreenschemeentity> {

    private static final long serialVersionUID = -532052921;

    public static final QIssuetypescreenschemeentity issuetypescreenschemeentity = new QIssuetypescreenschemeentity("ISSUETYPESCREENSCHEMEENTITY");

    public final NumberPath<Long> fieldscreenscheme = createNumber("fieldscreenscheme", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QIssuetypescreenschemeentity> issuetypescreenschemeentityPk = createPrimaryKey(id);

    public QIssuetypescreenschemeentity(String variable) {
        super(QIssuetypescreenschemeentity.class, forVariable(variable), "PUBLIC", "ISSUETYPESCREENSCHEMEENTITY");
        addMetadata();
    }

    public QIssuetypescreenschemeentity(String variable, String schema, String table) {
        super(QIssuetypescreenschemeentity.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssuetypescreenschemeentity(Path<? extends QIssuetypescreenschemeentity> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "ISSUETYPESCREENSCHEMEENTITY");
        addMetadata();
    }

    public QIssuetypescreenschemeentity(PathMetadata<?> metadata) {
        super(QIssuetypescreenschemeentity.class, metadata, "PUBLIC", "ISSUETYPESCREENSCHEMEENTITY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldscreenscheme, ColumnMetadata.named("FIELDSCREENSCHEME").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issuetype, ColumnMetadata.named("ISSUETYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(3).ofType(Types.BIGINT).withSize(19));
    }

}

