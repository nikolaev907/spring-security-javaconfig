/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.security.config.annotation.provisioning;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Configures an {@link org.springframework.security.config.annotation.authentication.AuthenticationManagerBuilder} to
 * have in memory authentication. It also allows easily adding users to the in memory authentication.
 *
 * @author Rob Winch
 * @since 3.2
 */

public class InMemoryUserDetailsManagerSecurityConfigurator extends
        UserDetailsManagerConfigurator<InMemoryUserDetailsManagerSecurityConfigurator> {

    /**
     * Creates a new instance
     */
    public InMemoryUserDetailsManagerSecurityConfigurator() {
        super(new InMemoryUserDetailsManager(new ArrayList<UserDetails>()));
    }
}
