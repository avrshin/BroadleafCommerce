/*
 * Copyright 2008-2009 the original author or authors.
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
package org.broadleafcommerce.openadmin.client;

import java.util.LinkedHashMap;

/**
 * 
 * @author jfischer
 *
 */
public interface Module {

	public String getModuleTitle();
	
	public String getModuleKey();
	
	public LinkedHashMap<String, String[]> getPages();
	
	public void preDraw();
	
	public void postDraw();

	public String getCurrentSandBox();

	public void setCurrentSandBox(String currentSandBox);
	
}
