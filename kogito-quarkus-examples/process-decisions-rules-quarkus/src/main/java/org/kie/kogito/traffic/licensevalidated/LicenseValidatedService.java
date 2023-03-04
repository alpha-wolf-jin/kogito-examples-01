/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito.traffic.licensevalidated;

import java.util.Date;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.RuleUnitData;
import org.drools.ruleunits.api.SingletonStore;

public class LicenseValidatedService implements RuleUnitData {
    private SingletonStore<Validated> validated;

    public LicenseValidatedService() {
        this(DataSource.createSingleton());
    }

    public LicenseValidatedService(SingletonStore<Validated> validated) {
        this.validated = validated;
    }

    public void setValidated(SingletonStore<Validated> validated) {
        this.validated = validated;
    }

    public SingletonStore<Validated> getValidated() {
        return validated;
    }

    public Date getCurrentTime() {
        return new Date();
    }
}
