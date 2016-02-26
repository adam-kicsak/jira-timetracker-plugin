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
 * QProject is a Querydsl query type for QProject
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QProject extends com.mysema.query.sql.RelationalPathBase<QProject> {

    private static final long serialVersionUID = -1814797735;

    public static final QProject project = new QProject("PROJECT");

    public final NumberPath<Long> assigneetype = createNumber("assigneetype", Long.class);

    public final NumberPath<Long> avatar = createNumber("avatar", Long.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lead = createString("lead");

    public final StringPath originalkey = createString("originalkey");

    public final NumberPath<Long> pcounter = createNumber("pcounter", Long.class);

    public final StringPath pkey = createString("pkey");

    public final StringPath pname = createString("pname");

    public final StringPath projecttype = createString("projecttype");

    public final StringPath url = createString("url");

    public final com.mysema.query.sql.PrimaryKey<QProject> projectPk = createPrimaryKey(id);

    public QProject(String variable) {
        super(QProject.class, forVariable(variable), "PUBLIC", "PROJECT");
        addMetadata();
    }

    public QProject(String variable, String schema, String table) {
        super(QProject.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProject(Path<? extends QProject> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROJECT");
        addMetadata();
    }

    public QProject(PathMetadata<?> metadata) {
        super(QProject.class, metadata, "PUBLIC", "PROJECT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assigneetype, ColumnMetadata.named("ASSIGNEETYPE").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(avatar, ColumnMetadata.named("AVATAR").withIndex(9).ofType(Types.BIGINT).withSize(19));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lead, ColumnMetadata.named("LEAD").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(originalkey, ColumnMetadata.named("ORIGINALKEY").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(pcounter, ColumnMetadata.named("PCOUNTER").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(pkey, ColumnMetadata.named("PKEY").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(pname, ColumnMetadata.named("PNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(projecttype, ColumnMetadata.named("PROJECTTYPE").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(url, ColumnMetadata.named("URL").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

