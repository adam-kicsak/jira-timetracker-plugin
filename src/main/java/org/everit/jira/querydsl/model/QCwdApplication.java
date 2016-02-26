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
 * QCwdApplication is a Querydsl query type for QCwdApplication
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCwdApplication extends com.mysema.query.sql.RelationalPathBase<QCwdApplication> {

    private static final long serialVersionUID = -1313962624;

    public static final QCwdApplication cwdApplication = new QCwdApplication("CWD_APPLICATION");

    public final NumberPath<Integer> active = createNumber("active", Integer.class);

    public final StringPath applicationName = createString("applicationName");

    public final StringPath applicationType = createString("applicationType");

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final StringPath credential = createString("credential");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lowerApplicationName = createString("lowerApplicationName");

    public final DateTimePath<java.sql.Timestamp> updatedDate = createDateTime("updatedDate", java.sql.Timestamp.class);

    public final com.mysema.query.sql.PrimaryKey<QCwdApplication> cwdApplicationPk = createPrimaryKey(id);

    public QCwdApplication(String variable) {
        super(QCwdApplication.class, forVariable(variable), "PUBLIC", "CWD_APPLICATION");
        addMetadata();
    }

    public QCwdApplication(String variable, String schema, String table) {
        super(QCwdApplication.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdApplication(Path<? extends QCwdApplication> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_APPLICATION");
        addMetadata();
    }

    public QCwdApplication(PathMetadata<?> metadata) {
        super(QCwdApplication.class, metadata, "PUBLIC", "CWD_APPLICATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("ACTIVE").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(applicationName, ColumnMetadata.named("APPLICATION_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(applicationType, ColumnMetadata.named("APPLICATION_TYPE").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(createdDate, ColumnMetadata.named("CREATED_DATE").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(credential, ColumnMetadata.named("CREDENTIAL").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lowerApplicationName, ColumnMetadata.named("LOWER_APPLICATION_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updatedDate, ColumnMetadata.named("UPDATED_DATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
    }

}

