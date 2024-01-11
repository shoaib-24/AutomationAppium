package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Calendar;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;



public class CreateProfile_KYC_High_Risk extends BaseTest {

	@Test
	public void HighRiskKycTest() throws MalformedURLException , InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("AMC, tab, 2 of 4")).click();	
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"ABL\"))"));
		driver.findElement(AppiumBy.accessibilityId("ABL, Conventional, High Risk, Return P.A, 14.83 %, NAV, 99.0095")).click();
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Invest Now\"))"));
		driver.findElement(AppiumBy.accessibilityId("Invest Now")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		
		driver.findElement(AppiumBy.accessibilityId("A. Under 30")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("B. Single")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("A. 1-3")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("C. Graduate")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("C. Rented")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("A. Less than 1 year")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("B. I have a moderate level of knowledge of investments and financial markets.")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("D. I want to generate long-term growth from my investments.")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("D. 150,000 and more")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("A. Stable")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("A. Less than 25%")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("C. Some savings and some debt")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("C. Willing to accept a moderate level of risk and tolerate losses to achieve potentially higher return")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("D. -2,000 PKR (-20%)")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("C. Usually the possible gains")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("D. Buy more of the investment at lower prices")).click();
//		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		
		// After Kyc
//		driver.findElement(AppiumBy.accessibilityId("Make an investment")).click();
//		driver.findElement(AppiumBy.accessibilityId("I'm new to investing in ABL. Let's proceed with the investment.")).click();
//		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		
		Thread.sleep(5000);
	}
}
