package dml;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;


public class App extends BaseTest{
    public static void AppiumTest() throws MalformedURLException{
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
        String text = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='Example preference dependency']")).getText();
        System.out.println(text);
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        driver.findElement(By.className("android.widget.EditText")).sendKeys("Asif wifi");
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'android:id/button1\']")).click();

    
    }


    public static void main(String[] args) throws MalformedURLException {
        ConfigureAppium();
        AppiumTest();
        Close();
    }
}


