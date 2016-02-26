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
 * QPluginstate is a Querydsl query type for QPluginstate
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPluginstate extends com.mysema.query.sql.RelationalPathBase<QPluginstate> {

    private static final long serialVersionUID = 1652446334;

    public static final QPluginstate pluginstate = new QPluginstate("PLUGINSTATE");

    public final StringPath pluginenabled = createString("pluginenabled");

    public final StringPath pluginkey = createString("pluginkey");

    public final com.mysema.query.sql.PrimaryKey<QPluginstate> pluginstatePk = createPrimaryKey(pluginkey);

    public QPluginstate(String variable) {
        super(QPluginstate.class, forVariable(variable), "PUBLIC", "PLUGINSTATE");
        addMetadata();
    }

    public QPluginstate(String variable, String schema, String table) {
        super(QPluginstate.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPluginstate(Path<? extends QPluginstate> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PLUGINSTATE");
        addMetadata();
    }

    public QPluginstate(PathMetadata<?> metadata) {
        super(QPluginstate.class, metadata, "PUBLIC", "PLUGINSTATE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pluginenabled, ColumnMetadata.named("PLUGINENABLED").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(pluginkey, ColumnMetadata.named("PLUGINKEY").withIndex(1).ofType(Types.VARCHAR).withSize(2147483647).notNull());
    }

}

