package org.example.app.drivers;

import org.example.app.properties.PropertiesReader;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidDriverInit {

    public static AndroidDriver driver;

    public static void initialize() {
        DesiredCapabilities caps = new DesiredCapabilities();
        PropertiesReader reader = new PropertiesReader();
        HashMap<String,String> data = reader.readProperties().getAppiumProperties();

        data.forEach(caps::setCapability);

        String url = "http://127.0.0.1:4723/";
        try {
            driver = new AndroidDriver(new URL(url), caps);
            //implicit wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void quit() {
        driver.quit();
    }

}