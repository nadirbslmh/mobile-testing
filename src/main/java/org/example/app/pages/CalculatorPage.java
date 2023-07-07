package org.example.app.pages;

import static org.example.app.drivers.AndroidDriverInit.driver;

import io.appium.java_client.AppiumBy;
import org.example.app.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalculatorPage extends BasePageObject {

    public String getTitle() {
        return getText(AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
    }

    public boolean checkHamburgerBtnAppear() {
        //explicit wait
        By locator = AppiumBy.accessibilityId("Open navigation drawer");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10, 1000));
        WebElement hamburgerBtn = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return hamburgerBtn.isDisplayed();
    }

}
