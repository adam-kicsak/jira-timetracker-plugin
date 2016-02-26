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
 * QProjectroleactor is a Querydsl query type for QProjectroleactor
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QProjectroleactor extends com.mysema.query.sql.RelationalPathBase<QProjectroleactor> {

    private static final long serialVersionUID = -1717684986;

    public static final QProjectroleactor projectroleactor = new QProjectroleactor("PROJECTROLEACTOR");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> pid = createNumber("pid", Long.class);

    public final NumberPath<Long> projectroleid = createNumber("projectroleid", Long.class);

    public final StringPath roletype = createString("roletype");

    public final StringPath roletypeparameter = createString("roletypeparameter");

    public final com.mysema.query.sql.PrimaryKey<QProjectroleactor> projectroleactorPk = createPrimaryKey(id);

    public QProjectroleactor(String variable) {
        super(QProjectroleactor.class, forVariable(variable), "PUBLIC", "PROJECTROLEACTOR");
        addMetadata();
    }

    public QProjectroleactor(String variable, String schema, String table) {
        super(QProjectroleactor.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectroleactor(Path<? extends QProjectroleactor> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROJECTROLEACTOR");
        addMetadata();
    }

    public QProjectroleactor(PathMetadata<?> metadata) {
        super(QProjectroleactor.class, metadata, "PUBLIC", "PROJECTROLEACTOR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(pid, ColumnMetadata.named("PID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(projectroleid, ColumnMetadata.named("PROJECTROLEID").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(roletype, ColumnMetadata.named("ROLETYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(roletypeparameter, ColumnMetadata.named("ROLETYPEPARAMETER").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

