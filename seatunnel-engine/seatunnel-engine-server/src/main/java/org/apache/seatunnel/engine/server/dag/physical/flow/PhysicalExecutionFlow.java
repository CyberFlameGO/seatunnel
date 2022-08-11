/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.engine.server.dag.physical.flow;

import org.apache.seatunnel.engine.core.dag.actions.Action;

import java.util.Collections;
import java.util.List;

public class PhysicalExecutionFlow extends Flow {

    private final Action action;

    public PhysicalExecutionFlow(Action action, List<Flow> next) {
        super(next);
        this.action = action;
    }

    public PhysicalExecutionFlow(Action action) {
        super(Collections.emptyList());
        this.action = action;
    }

    public Action getAction() {
        return action;
    }
}