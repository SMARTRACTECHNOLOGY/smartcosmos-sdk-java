/*
 * SnapBundle SDK
 * (C) Copyright 2013-2014 Tag Dynamics, LLC (http://tagdynamics.com/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.snapbundle.model.context;

import com.snapbundle.model.base.IAccountDomainResource;
import com.snapbundle.model.base.INamedObject;
import com.snapbundle.model.base.ITypedObject;

/**
 * Identifies a specific type of computation device and a means of uniquely
 * identifying a specific device. Devices are things like smartphones, laptops,
 * or custom hardware. The {@link #getIdentification()} in the case of a smartphone
 * might be the manufacturer's IMEI or the carrier-assigned phone number. For a
 * laptop the identification might be the MAC address of the NIC. In extreme cases,
 * the developer may choose to arbitrarily assign sequential numbers to uniquely
 * identify the various devices managed by the system.
 */
public interface IDevice extends IAccountDomainResource<IDevice>, INamedObject<IDevice>, ITypedObject
{
    String getIdentification();

    void setIdentification(String identification);
}
