/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package org.apache.hc.client5.testing.async;

import org.apache.hc.core5.http.HttpVersion;
import org.apache.hc.core5.http.URIScheme;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

class HttpIntegrationTests {

    @Nested
    @DisplayName("Fundamentals (HTTP/1.1)")
    class Http1 extends TestHttp1Async {

        public Http1() {
            super(URIScheme.HTTP);
        }

    }

    @Nested
    @DisplayName("Fundamentals (HTTP/1.1, TLS)")
    class Http1Tls extends TestHttp1Async {

        public Http1Tls() {
            super(URIScheme.HTTPS);
        }

    }

    @Nested
    @DisplayName("Fundamentals (HTTP/2)")
    class H2 extends TestH2Async {

        public H2() {
            super(URIScheme.HTTP);
        }

    }

    @Nested
    @DisplayName("Fundamentals (HTTP/2, TLS)")
    class H2Tls extends TestH2Async {

        public H2Tls() {
            super(URIScheme.HTTPS);
        }

    }

    @Nested
    @DisplayName("Request re-execution (HTTP/1.1)")
    class Http1RequestReExecution extends TestHttp1RequestReExecution {

        public Http1RequestReExecution() {
            super(URIScheme.HTTP);
        }

    }

    @Nested
    @DisplayName("Request re-execution (HTTP/1.1, TLS)")
    class Http1RequestReExecutionTls extends TestHttp1RequestReExecution {

        public Http1RequestReExecutionTls() {
            super(URIScheme.HTTPS);
        }

    }

    @Nested
    @DisplayName("HTTP protocol policy (HTTP/1.1)")
    class Http1ProtocolPolicy extends TestHttpAsyncProtocolPolicy {

        public Http1ProtocolPolicy() {
            super(URIScheme.HTTP, HttpVersion.HTTP_1_1);
        }

    }

    @Nested
    @DisplayName("HTTP protocol policy (HTTP/1.1, TLS)")
    class Http1ProtocolPolicyTls extends TestHttpAsyncProtocolPolicy {

        public Http1ProtocolPolicyTls() {
            super(URIScheme.HTTPS, HttpVersion.HTTP_1_1);
        }

    }

    @Nested
    @DisplayName("HTTP protocol policy (HTTP/2)")
    class H2ProtocolPolicy extends TestHttpAsyncProtocolPolicy {

        public H2ProtocolPolicy() {
            super(URIScheme.HTTP, HttpVersion.HTTP_2);
        }

    }

    @Nested
    @DisplayName("HTTP protocol policy (HTTP/2, TLS)")
    class H2ProtocolPolicyTls extends TestHttpAsyncProtocolPolicy {

        public H2ProtocolPolicyTls() {
            super(URIScheme.HTTPS, HttpVersion.HTTP_2);
        }

    }

    @Nested
    @DisplayName("Redirects (HTTP/1.1)")
    class RedirectsHttp1 extends TestHttp1AsyncRedirects {

        public RedirectsHttp1() {
            super(URIScheme.HTTP);
        }

    }

    @Nested
    @DisplayName("Redirects (HTTP/1.1, TLS)")
    class RedirectsHttp1Tls extends TestHttp1AsyncRedirects {

        public RedirectsHttp1Tls() {
            super(URIScheme.HTTPS);
        }

    }

    @Nested
    @DisplayName("Redirects (HTTP/2)")
    class RedirectsH2 extends TestH2AsyncRedirect {

        public RedirectsH2() {
            super(URIScheme.HTTP);
        }

    }

    @Nested
    @DisplayName("Redirects (HTTP/2, TLS)")
    class RedirectsH2Tls extends TestH2AsyncRedirect {

        public RedirectsH2Tls() {
            super(URIScheme.HTTPS);
        }

    }

    @Nested
    @DisplayName("Client authentication (HTTP/1.1)")
    class AuthenticationHttp1 extends TestHttp1ClientAuthentication {

        public AuthenticationHttp1() throws Exception {
            super(URIScheme.HTTP);
        }

    }

    @Nested
    @DisplayName("Client authentication (HTTP/1.1, TLS)")
    class AuthenticationHttp1Tls extends TestHttp1ClientAuthentication {

        public AuthenticationHttp1Tls() throws Exception {
            super(URIScheme.HTTPS);
        }

    }

    @Nested
    @DisplayName("Client authentication (HTTP/2)")
    class AuthenticationH2 extends TestH2ClientAuthentication {

        public AuthenticationH2() throws Exception {
            super(URIScheme.HTTP);
        }

    }

    @Nested
    @DisplayName("Client authentication (HTTP/2, TLS)")
    class AuthenticationH2Tls extends TestH2ClientAuthentication {

        public AuthenticationH2Tls() throws Exception {
            super(URIScheme.HTTPS);
        }

    }

    @Nested
    @DisplayName("HTTP message multiplexing (HTTP/2)")
    class RequestMultiplexing extends TestHttpAsyncRequestMultiplexing {

        public RequestMultiplexing() {
            super(URIScheme.HTTP);
        }

    }

    @Nested
    @DisplayName("HTTP message multiplexing (HTTP/2, TLS)")
    class RequestMultiplexingTls extends TestHttpAsyncRequestMultiplexing {

        public RequestMultiplexingTls() {
            super(URIScheme.HTTPS);
        }

    }

}