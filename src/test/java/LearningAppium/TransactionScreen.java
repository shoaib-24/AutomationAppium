package LearningAppium;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class TransactionScreen extends BaseTest {

	@Test
	public void Transaction() throws MalformedURLException , InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Transaction")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Investment")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Redemption")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Conversion")).click();
		
		
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("All")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("Successful")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("Pending")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Rejection")).click();
		
		Thread.sleep(2000);
		
	
	}

}
