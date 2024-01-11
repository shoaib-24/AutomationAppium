package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ConversionLowToHigh extends BaseTest {

	@Test
	public void ConversionTest() throws MalformedURLException , InterruptedException {
		

		driver.findElement(AppiumBy.accessibilityId("Convert_Inv")).click();
		driver.findElement(AppiumBy.accessibilityId("Fund Alfalah GHP Cash Fund")).click();
		driver.findElement(AppiumBy.accessibilityId("Convert Rs. 500,00")).click();
	 	driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"Convert Now\"])[1]")).click();
		
//		String fundDetail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")).getText();
//		Assert.assertEquals(fundDetail, "Fund detail");
		Thread.sleep(2000);
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Convert Now\"));"));
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Convert Now\"));"));
		
//		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Convert")).click();
		
		// High Risk Kyc
		MainKyc_HighRisk();
		
		driver.findElement(AppiumBy.accessibilityId("Convert Now")).click();
		driver.findElement(AppiumBy.accessibilityId("Convert")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Convert_Radio")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("Convert")).click();
		driver.findElement(AppiumBy.accessibilityId("Close")).click();
		Thread.sleep(2000);
	}

}
