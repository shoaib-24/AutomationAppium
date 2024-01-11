package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class MoneyCircleJoinWithNoKyc extends BaseTest {

	@Test
	public void MemberKycTest() throws MalformedURLException , InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Know More\").instance(0))"));
//		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward().scrollIntoView(new UiSelector().text(\"Dashboard\"))"));
		Thread.sleep(2000);
//		driver.findElement(AppiumBy.accessibilityId("Dashboard")).click();
		
		
		MemberKyc();
		
		
//		driver.findElement(AppiumBy.accessibilityId("View Circle Detail")).click();
		
		
		Thread.sleep(2000);
	}

}
