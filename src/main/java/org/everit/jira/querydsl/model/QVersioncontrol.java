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
 * QVersioncontrol is a Querydsl query type for QVersioncontrol
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QVersioncontrol extends com.mysema.query.sql.RelationalPathBase<QVersioncontrol> {

    private static final long serialVersionUID = -1785207227;

    public static final QVersioncontrol versioncontrol = new QVersioncontrol("VERSIONCONTROL");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath vcsdescription = createString("vcsdescription");

    public final StringPath vcsname = createString("vcsname");

    public final StringPath vcstype = createString("vcstype");

    public final com.mysema.query.sql.PrimaryKey<QVersioncontrol> versioncontrolPk = createPrimaryKey(id);

    public QVersioncontrol(String variable) {
        super(QVersioncontrol.class, forVariable(variable), "PUBLIC", "VERSIONCONTROL");
        addMetadata();
    }

    public QVersioncontrol(String variable, String schema, String table) {
        super(QVersioncontrol.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVersioncontrol(Path<? extends QVersioncontrol> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "VERSIONCONTROL");
        addMetadata();
    }

    public QVersioncontrol(PathMetadata<?> metadata) {
        super(QVersioncontrol.class, metadata, "PUBLIC", "VERSIONCONTROL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(vcsdescription, ColumnMetadata.named("VCSDESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(vcsname, ColumnMetadata.named("VCSNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(vcstype, ColumnMetadata.named("VCSTYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

