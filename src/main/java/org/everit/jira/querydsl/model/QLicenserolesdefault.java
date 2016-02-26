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
 * QLicenserolesdefault is a Querydsl query type for QLicenserolesdefault
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QLicenserolesdefault extends com.mysema.query.sql.RelationalPathBase<QLicenserolesdefault> {

    private static final long serialVersionUID = 396757733;

    public static final QLicenserolesdefault licenserolesdefault = new QLicenserolesdefault("LICENSEROLESDEFAULT");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath licenseRoleName = createString("licenseRoleName");

    public final com.mysema.query.sql.PrimaryKey<QLicenserolesdefault> licenserolesdefaultPk = createPrimaryKey(id);

    public QLicenserolesdefault(String variable) {
        super(QLicenserolesdefault.class, forVariable(variable), "PUBLIC", "LICENSEROLESDEFAULT");
        addMetadata();
    }

    public QLicenserolesdefault(String variable, String schema, String table) {
        super(QLicenserolesdefault.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLicenserolesdefault(Path<? extends QLicenserolesdefault> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "LICENSEROLESDEFAULT");
        addMetadata();
    }

    public QLicenserolesdefault(PathMetadata<?> metadata) {
        super(QLicenserolesdefault.class, metadata, "PUBLIC", "LICENSEROLESDEFAULT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(licenseRoleName, ColumnMetadata.named("LICENSE_ROLE_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

