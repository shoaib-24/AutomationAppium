package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class RedeemScreen extends BaseTest {
	
	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException {

	driver.findElement(AppiumBy.accessibilityId("Redeem_Inv")).click();
	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Fund AMIM Cash Fund\"]")).click();
	driver.findElement(AppiumBy.accessibilityId("Redeem Rs. 1,995")).click();
	driver.findElement(AppiumBy.accessibilityId("Just testing the feature")).click();
	
	
	driver.findElement(AppiumBy.accessibilityId("Redeem")).click();
	driver.findElement(AppiumBy.accessibilityId("Close")).click();
	Thread.sleep(2000);
	
	}
}
