package dml;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {

    public static AndroidDriver driver;
    public static AppiumDriverLocalService service;

    @SuppressWarnings("deprecation")
    public static void ConfigureAppium() throws MalformedURLException{
        service = new AppiumServiceBuilder()
        .withAppiumJS(new File("//usr/local//lib//node_modules//appium//build//lib//main.js"))
        .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();



        UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Appium Testing");
        options.setApp("/Users/asifkarim/Desktop/Appium Testing/appium/src/main/java/Recourecs/ApiDemos-debug.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void longPressAction(WebElement ele) { 
       ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
            "elementId", ((RemoteWebElement) ele).getId(),"duration",2000
        ));
    }

    public static void Close() { 
        driver.quit();
        service.stop();
    }

}
