/*
Copyright 2011 Software Freedom Conservancy

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package org.seleniumhq.selenium.fluent;

import org.openqa.selenium.WebDriver;
import org.seleniumhq.selenium.fluent.internal.Context;

import java.util.List;

public abstract class BaseFluentWebElement extends BaseFluentWebDriver {

    public BaseFluentWebElement(WebDriver delegate, Context context) {
        super(delegate, context);
    }

    @Override
    protected FluentWebElements makeFluentWebElements(List<FluentWebElement> results, Context context) {
        return new FluentWebElements(super.delegate, results, context);
    }

    protected String charSeqArrayAsHumanString(CharSequence[] keysToSend) {
        String keys = "";
        for (CharSequence charSequence : keysToSend) {
            keys = keys + ", " + charSequence;
        }
        return keys.substring(2);  // delete comma-space prefix
    }


}
