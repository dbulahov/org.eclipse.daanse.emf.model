/*
 * Copyright (c) 2024 Contributors to the Eclipse Foundation.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   SmartCity Jena, Stefan Bischof - initial
 *
 */
package org.eclipse.daanse.rolap.mapping.mondrian.model;

import jakarta.xml.bind.annotation.XmlAttribute;

public class WritebackMeasure implements WritebackColumn {

    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "column")
    private String column;

    @Override
    public String column() {
        return column;
    }

    public String name() {
        return name;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public void setName(String name) {
        this.name = name;
    }

}
