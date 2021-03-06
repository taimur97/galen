/*******************************************************************************
* Copyright 2015 Ivan Shubin http://mindengine.net
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*   http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
******************************************************************************/
package net.mindengine.galen.specs.reader.page;

import java.util.List;

public class SectionFilter {
    
    private List<String> includedTags;
    private List<String> excludedTags;
    public SectionFilter(List<String> includedTags, List<String> excludedTags) {
        this.setIncludedTags(includedTags);
        this.setExcludedTags(excludedTags);
    }
    public List<String> getIncludedTags() {
        return includedTags;
    }
    public void setIncludedTags(List<String> includedTags) {
        this.includedTags = includedTags;
    }
    public List<String> getExcludedTags() {
        return excludedTags;
    }
    public void setExcludedTags(List<String> excludedTags) {
        this.excludedTags = excludedTags;
    }

}
