/**
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.appcloud.core.dto;

import java.sql.Timestamp;
import java.util.List;

public class Version {

    private String versionName;
    private String hashId;
    private int runtimeId;
    private String runtimeName;
    private String status;
    private List<RuntimeProperty> runtimeProperties;
    private List<Tag> tags;
    private int tenantId;
    private Timestamp createdTimestamp;
    private String conSpecCpu;
    private String conSpecMemory;
    private int isWhiteListed;

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public int getRuntimeId() {
        return runtimeId;
    }

    public void setRuntimeId(int runtimeId) {
        this.runtimeId = runtimeId;
    }

    public String getRuntimeName() {
        return runtimeName;
    }

    public void setRuntimeName(String runtimeName) {
        this.runtimeName = runtimeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<RuntimeProperty> getRuntimeProperties() {
        return runtimeProperties;
    }

    public void setRuntimeProperties(List<RuntimeProperty> runtimeProperties) {
        this.runtimeProperties = runtimeProperties;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public Timestamp getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Timestamp createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public void setConSpecCpu(String conSpecCpu) {
        this.conSpecCpu = conSpecCpu;
    }

    public String getConSpecCpu() {
        return conSpecCpu;
    }

    public void setConSpecMemory(String conSpecMemory) {
        this.conSpecMemory = conSpecMemory;
    }

    public String getConSpecMemory() {
        return conSpecMemory;
    }

    public int getIsWhiteListed() {
        return isWhiteListed;
    }

    public void setIsWhiteListed(int isWhiteListed) {
        this.isWhiteListed = isWhiteListed;
    }
}
