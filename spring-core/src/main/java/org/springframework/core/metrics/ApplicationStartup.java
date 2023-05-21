/*
 * Copyright 2002-2020 the original author or authors.
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

package org.springframework.core.metrics;

/**
 * Instruments the application startup phase using {@link StartupStep steps}.
 * <p>The core container and its infrastructure components can use the {@code ApplicationStartup}
 * to mark steps during the application startup and collect data about the execution context
 * or their processing time.
 *
 * @author Brian Clozel
 * @since 5.3
 */
public interface ApplicationStartup {

	/**
	 * Default "no op" {@code ApplicationStartup} implementation.
	 * <p>This variant is designed for minimal overhead and does not record data.
	 */
	ApplicationStartup DEFAULT = new DefaultApplicationStartup();

	/**
	 * 创建新步骤并标记其开始
	 * 步骤名称描述当前操作或阶段
	 *
	 * 名称应为 "." 命名空间，并且可以重用以描述的其他实例
	 * 应用程序启动过程中的相同步骤
	 *
	 * Create a new step and marks its beginning.
	 * <p>A step name describes the current action or phase. This technical
	 * name should be "." namespaced and can be reused to describe other instances of
	 * the same step during application startup.
	 * @param name the step name 步骤名称
	 */
	StartupStep start(String name);

}
