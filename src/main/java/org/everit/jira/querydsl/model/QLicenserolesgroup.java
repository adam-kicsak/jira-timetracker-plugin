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
 * QLicenserolesgroup is a Querydsl query type for QLicenserolesgroup
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QLicenserolesgroup extends com.mysema.query.sql.RelationalPathBase<QLicenserolesgroup> {

    private static final long serialVersionUID = 218104867;

    public static final QLicenserolesgroup licenserolesgroup = new QLicenserolesgroup("LICENSEROLESGROUP");

    public final StringPath groupId = createString("groupId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath licenseRoleName = createString("licenseRoleName");

    public final StringPath primaryGroup = createString("primaryGroup");

    public final com.mysema.query.sql.PrimaryKey<QLicenserolesgroup> licenserolesgroupPk = createPrimaryKey(id);

    public QLicenserolesgroup(String variable) {
        super(QLicenserolesgroup.class, forVariable(variable), "PUBLIC", "LICENSEROLESGROUP");
        addMetadata();
    }

    public QLicenserolesgroup(String variable, String schema, String table) {
        super(QLicenserolesgroup.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLicenserolesgroup(Path<? extends QLicenserolesgroup> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "LICENSEROLESGROUP");
        addMetadata();
    }

    public QLicenserolesgroup(PathMetadata<?> metadata) {
        super(QLicenserolesgroup.class, metadata, "PUBLIC", "LICENSEROLESGROUP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupId, ColumnMetadata.named("GROUP_ID").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(licenseRoleName, ColumnMetadata.named("LICENSE_ROLE_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(primaryGroup, ColumnMetadata.named("PRIMARY_GROUP").withIndex(4).ofType(Types.CHAR).withSize(2147483647));
    }

}

