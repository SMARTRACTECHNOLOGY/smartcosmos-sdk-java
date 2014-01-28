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

package com.snapbundle.model.integration;

import com.snapbundle.model.base.INamedObject;
import com.snapbundle.model.base.IReferentialObject;
import com.snapbundle.model.context.IAccount;

public interface INotificationEndpoint extends INamedObject<INotificationEndpoint>, IReferentialObject
{
    IAccount getAccount();

    void setAccount(IAccount account);

    IAccount getReferenceAccount();

    void setReferenceAccount(IAccount account);

    String getEncodedPublicKey();

    String getEncodedPrivateKey();

    String getTopicArn();

    void setTopicArn(String topicArn);

    String getSubscriptionArn();

    void setSubscriptionArn(String subscriptionArn);

    String getNotificationEndpointUrl();

    void setNotificationEndpointUrl(String endpointUrl);

    boolean isPendingConfirmation();

    void setPendingConfirmation(boolean pendingConfirmation);
}
