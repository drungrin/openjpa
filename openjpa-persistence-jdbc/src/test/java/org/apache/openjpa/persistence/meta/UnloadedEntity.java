/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.    
 */
package org.apache.openjpa.persistence.meta;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UnloadedEntity {
    // This block calls back to the testcase so we can detect if it was loaded.
    static { 
        TestMetaDataRepository.UnloadedEntityLoaded = true;
    }
    @Basic
    private String implClassAName;
    
    @Id 
    @GeneratedValue
    private int id;
    
    @Basic
    private int intFieldSup;
    
    public void setImplClassAName(String implClassAName) {
        this.implClassAName = implClassAName;
    }

    public String getImplClassAName() {
        return implClassAName;
    }
    
    public String toString() {
        return super.toString() + ";implClassAName=" + implClassAName + 
            ";intFieldSup=" + intFieldSup+ ";id="+id;
    }

    public int getId() {
        return this.id;
    }

    public int getIntFieldSup() {
        return intFieldSup;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIntFieldSup(int i) {
        this.intFieldSup = i;
    }
}

