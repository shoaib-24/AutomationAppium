package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ManifestScreen extends BaseTest {

	@Test
	public void ManifestTest() throws MalformedURLException , InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Learn More\").instance(0))"));
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Learn More")).click();
		driver.findElement(AppiumBy.accessibilityId("Let's start")).click();
		driver.findElement(AppiumBy.accessibilityId("Car")).click();
		WebElement name = driver.findElement(AppiumBy.accessibilityId("Give it a name"));
		name.click();
		name.sendKeys("Mercedes");
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
//		WebElement amount = driver.findElement(AppiumBy.className("android.widget.EditText"));
		WebElement amount = driver.findElement(AppiumBy.accessibilityId("What is your target amount?"));
		amount.click();
		Thread.sleep(1000);
		amount.sendKeys("30000");
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Select your target date")).click();
		
		// Date Picker
		// Scrolling for year not implemented, only months
		driver.findElement(AppiumBy.accessibilityId("Next month")).click();
		driver.findElement(AppiumBy.accessibilityId("Next month")).click();
		driver.findElement(AppiumBy.accessibilityId("Next month")).click();
		driver.findElement(AppiumBy.accessibilityId("Next month")).click();
		driver.findElement(AppiumBy.accessibilityId("02 March 2024")).click();
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(2000);
		
		// Savings
//		WebElement savings = driver.findElement(AppiumBy.accessibilityId("Enter your savings (if any)"));
//		savings.click();
//		savings.sendKeys("1000");
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		// Review my SIP not implemented because no ID
//		driver.findElement(AppiumBy.accessibilityId("Review My SIP")).click();
//		driver.findElement(AppiumBy.accessibilityId("Target Amount")).sendKeys("50000");
//		driver.findElement(AppiumBy.accessibilityId("Savings")).sendKeys("1000");
//		driver.findElement(AppiumBy.accessibilityId("Calculate my SIP")).click();
//		driver.findElement(AppiumBy.accessibilityId("Next")).click();
//		Thread.sleep(1000);
		
		// Proceed
		driver.findElement(AppiumBy.accessibilityId("Proceed")).click();
		driver.findElement(AppiumBy.accessibilityId("Make First Investment Now")).click();
//		driver.findElement(AppiumBy.accessibilityId("Alfalah GHP Cash Fund, Conventional, Low Risk, Return P.A, 20.84 %, NAV, 522.5729")).click(); // testing
		driver.findElement(AppiumBy.accessibilityId("Alfalah GHP Income Fund, Conventional, Low Risk, Return P.A, 15 %, NAV, 115.9759")).click();   // preproduction
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Invest Now\"));"));
		driver.findElement(AppiumBy.accessibilityId("Invest Now")).click();
		
		WebElement investAmount1 = driver.findElement(AppiumBy.accessibilityId("Investment Amount"));
		investAmount1.click();
		investAmount1.sendKeys("10000");
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"sales_load_btn\"]/android.widget.ImageView")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Payment Receipt")).click();
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		driver.findElement(AppiumBy.accessibilityId("Close")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Dashboard\"));"));
		driver.findElement(AppiumBy.accessibilityId("Dashboard")).click();
		
		// Pay another investment
		driver.findElement(AppiumBy.accessibilityId("Pay First SIP")).click(); // before approved
//		driver.findElement(AppiumBy.accessibilityId("Pay Next SIP")).click();  // after approved
		driver.findElement(AppiumBy.accessibilityId("Invest Now")).click();
		WebElement investAmount2 = driver.findElement(AppiumBy.accessibilityId("Investment Amount"));
		investAmount2.click();
		investAmount2.sendKeys("10000");
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"sales_load_btn\"]/android.widget.ImageView")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Payment Receipt")).click();
		driver.findElement(By.id("android:id/button2")).click();
//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		driver.findElement(AppiumBy.accessibilityId("Close")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Dashboard\"));"));
		driver.findElement(AppiumBy.accessibilityId("Dashboard")).click();
		
		Thread.sleep(2000);
		
			
	}

}
