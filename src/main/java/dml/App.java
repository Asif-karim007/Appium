package dml;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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


    public static void LongPressGesture() throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	    WebElement ele=	driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(ele);
        String menuText =	driver.findElement(By.id("android:id/title")).getText();
        System.out.println(menuText);
        System.out.println(driver.findElement(By.id("android:id/title")).isDisplayed());
	}


    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        ConfigureAppium();
        // AppiumTest();
        LongPressGesture();
        Close();
    }
}


