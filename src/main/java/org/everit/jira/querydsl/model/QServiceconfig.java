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
 * QServiceconfig is a Querydsl query type for QServiceconfig
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QServiceconfig extends com.mysema.query.sql.RelationalPathBase<QServiceconfig> {

    private static final long serialVersionUID = 1812223351;

    public static final QServiceconfig serviceconfig = new QServiceconfig("SERVICECONFIG");

    public final StringPath clazz = createString("clazz");

    public final StringPath cronExpression = createString("cronExpression");

    public final NumberPath<Long> delaytime = createNumber("delaytime", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath servicename = createString("servicename");

    public final com.mysema.query.sql.PrimaryKey<QServiceconfig> serviceconfigPk = createPrimaryKey(id);

    public QServiceconfig(String variable) {
        super(QServiceconfig.class, forVariable(variable), "PUBLIC", "SERVICECONFIG");
        addMetadata();
    }

    public QServiceconfig(String variable, String schema, String table) {
        super(QServiceconfig.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServiceconfig(Path<? extends QServiceconfig> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SERVICECONFIG");
        addMetadata();
    }

    public QServiceconfig(PathMetadata<?> metadata) {
        super(QServiceconfig.class, metadata, "PUBLIC", "SERVICECONFIG");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(clazz, ColumnMetadata.named("CLAZZ").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(cronExpression, ColumnMetadata.named("CRON_EXPRESSION").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(delaytime, ColumnMetadata.named("DELAYTIME").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(servicename, ColumnMetadata.named("SERVICENAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

