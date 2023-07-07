package org.example.app.pages;

import io.appium.java_client.AppiumBy;
import org.example.app.base.BasePageObject;
import org.openqa.selenium.WebElement;

public class ListPage extends BasePageObject {

    public void swipeList() {
        WebElement element = find(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"List ke-60\"))"));
    }

}
