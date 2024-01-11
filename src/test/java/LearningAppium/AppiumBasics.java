package LearningAppium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import java.net.MalformedURLException;
import java.time.Duration;


public class AppiumBasics extends BaseTest {

	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException {
		
		// Actual Automation
		// XPath, ID, Accessibility ID, ClassName, AndroidUIAutomator
		
		
//		driver.findElement(AppiumBy.accessibilityId("Log in to YPay")).click();
//		driver.findElement(AppiumBy.accessibilityId("phoneInput")).sendKeys("3472911682");
//		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		
////		WebElement pin = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		By elementLocator = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
////	By elementLocator = AppiumBy.className("android.widget.EditText");
//		WebElement pinField = wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
////		new Actions(driver).sendKeys("1234").perform();
//		pinField.sendKeys("1234");
//		Thread.sleep(2000);
		
//		driver.findElement(AppiumBy.accessibilityId("Redeem")).click();
//		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"AMIM Cash Fund, 2023-10-11\"])[1]")).click();
//		driver.findElement(AppiumBy.accessibilityId("Redeem Rs. 1,995")).click();
//		driver.findElement(AppiumBy.accessibilityId("Just testing the feature")).click();
//		driver.findElement(AppiumBy.accessibilityId("Redeem")).click();
//		driver.findElement(AppiumBy.accessibilityId("Close")).click();
		
//		WebElement pin = driver.findElement(AppiumBy.className("android.widget.EditText"));
//		pin.sendKeys("1234");
		
		
		Thread.sleep(2000);

	} 
}
