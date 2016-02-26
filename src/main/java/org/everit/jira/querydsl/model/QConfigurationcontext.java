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
 * QConfigurationcontext is a Querydsl query type for QConfigurationcontext
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QConfigurationcontext extends com.mysema.query.sql.RelationalPathBase<QConfigurationcontext> {

    private static final long serialVersionUID = 1034293433;

    public static final QConfigurationcontext configurationcontext = new QConfigurationcontext("CONFIGURATIONCONTEXT");

    public final StringPath customfield = createString("customfield");

    public final NumberPath<Long> fieldconfigscheme = createNumber("fieldconfigscheme", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final NumberPath<Long> projectcategory = createNumber("projectcategory", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QConfigurationcontext> configurationcontextPk = createPrimaryKey(id);

    public QConfigurationcontext(String variable) {
        super(QConfigurationcontext.class, forVariable(variable), "PUBLIC", "CONFIGURATIONCONTEXT");
        addMetadata();
    }

    public QConfigurationcontext(String variable, String schema, String table) {
        super(QConfigurationcontext.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QConfigurationcontext(Path<? extends QConfigurationcontext> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CONFIGURATIONCONTEXT");
        addMetadata();
    }

    public QConfigurationcontext(PathMetadata<?> metadata) {
        super(QConfigurationcontext.class, metadata, "PUBLIC", "CONFIGURATIONCONTEXT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(customfield, ColumnMetadata.named("CUSTOMFIELD").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldconfigscheme, ColumnMetadata.named("FIELDCONFIGSCHEME").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(project, ColumnMetadata.named("PROJECT").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(projectcategory, ColumnMetadata.named("PROJECTCATEGORY").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

