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
 * QCwdDirectoryOperation is a Querydsl query type for QCwdDirectoryOperation
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCwdDirectoryOperation extends com.mysema.query.sql.RelationalPathBase<QCwdDirectoryOperation> {

    private static final long serialVersionUID = 47295306;

    public static final QCwdDirectoryOperation cwdDirectoryOperation = new QCwdDirectoryOperation("CWD_DIRECTORY_OPERATION");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final StringPath operationType = createString("operationType");

    public final com.mysema.query.sql.PrimaryKey<QCwdDirectoryOperation> cwdDirectoryOperationPk = createPrimaryKey(directoryId, operationType);

    public QCwdDirectoryOperation(String variable) {
        super(QCwdDirectoryOperation.class, forVariable(variable), "PUBLIC", "CWD_DIRECTORY_OPERATION");
        addMetadata();
    }

    public QCwdDirectoryOperation(String variable, String schema, String table) {
        super(QCwdDirectoryOperation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdDirectoryOperation(Path<? extends QCwdDirectoryOperation> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_DIRECTORY_OPERATION");
        addMetadata();
    }

    public QCwdDirectoryOperation(PathMetadata<?> metadata) {
        super(QCwdDirectoryOperation.class, metadata, "PUBLIC", "CWD_DIRECTORY_OPERATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(directoryId, ColumnMetadata.named("DIRECTORY_ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(operationType, ColumnMetadata.named("OPERATION_TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647).notNull());
    }

}

