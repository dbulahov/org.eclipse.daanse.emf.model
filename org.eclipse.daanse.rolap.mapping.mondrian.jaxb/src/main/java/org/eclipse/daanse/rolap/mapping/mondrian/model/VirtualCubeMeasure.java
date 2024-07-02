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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
public class VirtualCubeMeasure extends AbstractMainElement {

    @XmlAttribute(name = "cubeName", required = true)
    protected String cubeName;

    @XmlAttribute(name = "visible")
    protected Boolean visible;

    public String cubeName() {
        return cubeName;
    }

    public void setCubeName(String value) {
        this.cubeName = value;
    }

    public void setVisible(Boolean value) {
        this.visible = value;
    }

    public Boolean visible() {
        if (visible == null) {
            return Boolean.TRUE;
        } else {
            return visible;
        }
    }

}
