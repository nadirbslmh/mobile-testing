package org.example.app.properties;

import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class PropertiesReader {

    public AppiumConfiguration readProperties(){
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("configuration.yaml");
        Map<String, Object> configuration = yaml.load(inputStream);

        Map<String, Object> appiumProperties = (Map<String, Object>) configuration.get("appiumProperties");

        AppiumConfiguration appiumConfig = new AppiumConfiguration();
        appiumConfig.setPlatformName((String) appiumProperties.get("platformName"));
        appiumConfig.setDeviceName((String) appiumProperties.get("deviceName"));
        appiumConfig.setApp((String) appiumProperties.get("app"));
        appiumConfig.setAutomationName((String) appiumProperties.get("automationName"));
        appiumConfig.setAutoGrantPermissions((boolean) appiumProperties.get("autoGrantPermissions"));

        return appiumConfig;
    }

}
