package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

// Investment in High Risk Fund - already created low risk kyc

public class InvestmentHighRiskFromDashboard extends BaseTest{

	@Test
	public void InvestmentHighTest() throws MalformedURLException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("AMC, tab, 2 of 4")).click();		
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Alfalah GHP Cash Fund\"))"));
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"AKD Opportunity Fund\"))"));
		driver.findElement(AppiumBy.accessibilityId("AKD Opportunity Fund, Conventional, High Risk, Return P.A, 3.74 %, NAV, 92.1543")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Invest Now\"))"));
		driver.findElement(AppiumBy.accessibilityId("Invest Now")).click();
		
		driver.findElement(AppiumBy.accessibilityId("I'm new to investing in AKD Opportunity Fund. Let's proceed with the investment.")).click();
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		
//		driver.findElement(AppiumBy.accessibilityId("Investment_Amount")).click();
		driver.findElement(AppiumBy.accessibilityId("Investment_Amount")).sendKeys("1000");
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"sales_load_btn\"]/android.widget.ImageView")).click();
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
//		driver.findElement(AppiumBy.accessibilityId("Copy")).click();     // copy account no
			
		driver.findElement(AppiumBy.accessibilityId("Payment Receipt")).click();
//		driver.findElement(AppiumBy.accessibilityId("Cancel")).click();
//		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(By.id("android:id/button2")).click();
//		
//		// For Permission
//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button")).click();

//		driver.findElement(AppiumBy.accessibilityId("Retake")).click();
//		driver.findElement(AppiumBy.accessibilityId("Cancel")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		driver.findElement(AppiumBy.accessibilityId("Done")).click();

		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		driver.findElement(AppiumBy.accessibilityId("Close")).click();
	
		Thread.sleep(2000);	
	}
}
