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
 * QCwdMembership is a Querydsl query type for QCwdMembership
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCwdMembership extends com.mysema.query.sql.RelationalPathBase<QCwdMembership> {

    private static final long serialVersionUID = -324386394;

    public static final QCwdMembership cwdMembership = new QCwdMembership("CWD_MEMBERSHIP");

    public final NumberPath<Long> childId = createNumber("childId", Long.class);

    public final StringPath childName = createString("childName");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final StringPath groupType = createString("groupType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lowerChildName = createString("lowerChildName");

    public final StringPath lowerParentName = createString("lowerParentName");

    public final StringPath membershipType = createString("membershipType");

    public final NumberPath<Long> parentId = createNumber("parentId", Long.class);

    public final StringPath parentName = createString("parentName");

    public final com.mysema.query.sql.PrimaryKey<QCwdMembership> cwdMembershipPk = createPrimaryKey(id);

    public QCwdMembership(String variable) {
        super(QCwdMembership.class, forVariable(variable), "PUBLIC", "CWD_MEMBERSHIP");
        addMetadata();
    }

    public QCwdMembership(String variable, String schema, String table) {
        super(QCwdMembership.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdMembership(Path<? extends QCwdMembership> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_MEMBERSHIP");
        addMetadata();
    }

    public QCwdMembership(PathMetadata<?> metadata) {
        super(QCwdMembership.class, metadata, "PUBLIC", "CWD_MEMBERSHIP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(childId, ColumnMetadata.named("CHILD_ID").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(childName, ColumnMetadata.named("CHILD_NAME").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(directoryId, ColumnMetadata.named("DIRECTORY_ID").withIndex(10).ofType(Types.BIGINT).withSize(19));
        addMetadata(groupType, ColumnMetadata.named("GROUP_TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lowerChildName, ColumnMetadata.named("LOWER_CHILD_NAME").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(lowerParentName, ColumnMetadata.named("LOWER_PARENT_NAME").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(membershipType, ColumnMetadata.named("MEMBERSHIP_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(parentId, ColumnMetadata.named("PARENT_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(parentName, ColumnMetadata.named("PARENT_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

