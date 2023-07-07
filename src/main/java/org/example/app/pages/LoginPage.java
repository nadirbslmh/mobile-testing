package org.example.app.pages;

import org.example.app.base.BasePageObject;
import io.appium.java_client.AppiumBy;

public class LoginPage extends BasePageObject {

    public void inputUsername(String username) {
        type(AppiumBy.id("username"), username);
    }

    public void inputPassword(String password) {
        type(AppiumBy.id("password"), password);
    }

    public void clickLoginBtn() {
        click(AppiumBy.id("login"));
    }
}
