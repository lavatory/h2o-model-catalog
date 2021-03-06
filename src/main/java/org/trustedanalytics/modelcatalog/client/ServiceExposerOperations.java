/**
 * Copyright (c) 2015 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.trustedanalytics.modelcatalog.client;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

import org.trustedanalytics.modelcatalog.data.H2oInstanceCredentials;

import java.util.Collection;
import java.util.UUID;

public interface ServiceExposerOperations {

    @RequestLine("GET /rest/credentials/organizations/{org}?service={service}")
    @Headers({"Authorization: {token}", "Content-Type: application/json"})
    Collection<H2oInstanceCredentials> getAllCredentials(@Param("token") String token, @Param("org") UUID org, @Param("service") String service);
}
