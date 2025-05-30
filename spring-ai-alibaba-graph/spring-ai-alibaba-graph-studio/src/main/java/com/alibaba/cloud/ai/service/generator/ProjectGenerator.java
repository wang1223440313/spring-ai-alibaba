/*
 * Copyright 2024-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.cloud.ai.service.generator;

import com.alibaba.cloud.ai.model.workflow.Workflow;
import com.alibaba.cloud.ai.model.chatbot.ChatBot;
import com.alibaba.cloud.ai.model.AppModeEnum;

import java.nio.file.Path;

/**
 * ProjectGenerator abstracts the project generation of a specific app type, e.g.
 * {@link Workflow}, {@link ChatBot}
 *
 * @author robocanic
 * @since 2025/05/18
 */
public interface ProjectGenerator {

	/**
	 * Whether the generator supports the given app mode
	 * @param appModeEnum see {@link AppModeEnum}
	 * @return true if supported
	 */
	Boolean supportAppMode(AppModeEnum appModeEnum);

	/**
	 * Generate the project, save into a local directory
	 * @param projectDescription see {@link GraphProjectDescription}
	 * @param projectRoot the path root which your file should generate
	 */
	void generate(GraphProjectDescription projectDescription, Path projectRoot);

}
