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
 * QMembershipbase is a Querydsl query type for QMembershipbase
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QMembershipbase extends com.mysema.query.sql.RelationalPathBase<QMembershipbase> {

    private static final long serialVersionUID = -1937312665;

    public static final QMembershipbase membershipbase = new QMembershipbase("MEMBERSHIPBASE");

    public final StringPath groupName = createString("groupName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath userName = createString("userName");

    public final com.mysema.query.sql.PrimaryKey<QMembershipbase> membershipbasePk = createPrimaryKey(id);

    public QMembershipbase(String variable) {
        super(QMembershipbase.class, forVariable(variable), "PUBLIC", "MEMBERSHIPBASE");
        addMetadata();
    }

    public QMembershipbase(String variable, String schema, String table) {
        super(QMembershipbase.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMembershipbase(Path<? extends QMembershipbase> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "MEMBERSHIPBASE");
        addMetadata();
    }

    public QMembershipbase(PathMetadata<?> metadata) {
        super(QMembershipbase.class, metadata, "PUBLIC", "MEMBERSHIPBASE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupName, ColumnMetadata.named("GROUP_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(userName, ColumnMetadata.named("USER_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

