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

    public static void Scroll() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView2\"))"));
    }





    public static void SwipeDemoTest() throws MalformedURLException, InterruptedException
	{

		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Photos']")).click();
		WebElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		System.out.println(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"));

		swipeAction(firstImage,"left");	
		System.out.println(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"));

	}


    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        ConfigureAppium();
        // Thread.sleep(2000);
        // AppiumTest();
        // LongPressGesture();
        // Scroll();
        SwipeDemoTest();

        Close();
    }
}


