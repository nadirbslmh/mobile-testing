package org.example.app.pages;

import io.appium.java_client.AppiumBy;
import org.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class NavigationMenu extends BasePageObject {

    public void clickHamburgerBtn(){
        click(AppiumBy.accessibilityId("Open navigation drawer"));
    }

    public void clickListMenu(){
        click(AppiumBy.id("nav_list"));
    }
}