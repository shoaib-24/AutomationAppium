package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

// Investment in Low Risk Fund

public class InvestmentLowRiskHavingNoKyc extends BaseTest{

	@Test
	public void InvestmentTest() throws MalformedURLException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("AMC, tab, 2 of 4")).click();		
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Alfalah GHP Cash Fund\"));"));
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Alfalah GHP Cash Fund\"))"));
		driver.findElement(AppiumBy.accessibilityId("Alfalah GHP Cash Fund, Conventional, Low Risk, Return P.A, 20.84 %, NAV, 522.5729")).click();  // testing
//		driver.findElement(AppiumBy.accessibilityId("Alfalah GHP Cash Fund, Conventional, High Risk, Return P.A, 15 %, NAV, 504.6678")).click();    // preprod
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Invest Now\"))"));
		driver.findElement(AppiumBy.accessibilityId("Invest Now")).click();
		
		MainKyc();
		
		driver.findElement(AppiumBy.accessibilityId("Make an investment")).click();
		driver.findElement(AppiumBy.accessibilityId("I'm new to investing in Alfalah Ghp Investment Management Ltd (IC). Let's proceed with the investment.")).click();
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		
//		driver.findElement(AppiumBy.accessibilityId("Funds")).click();
//		driver.findElement(AppiumBy.accessibilityId("Funds_InvestNow")).click();
//		
//		
//		// New Invester
//		driver.findElement(AppiumBy.accessibilityId("NewInvester_Text")).click(); //or
//		driver.findElement(AppiumBy.accessibilityId("NewInvester_Checkbox")).click();
//		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
//		
//		// Old Invester
//		driver.findElement(AppiumBy.accessibilityId("Investment_Amount")).click();
//		driver.findElement(AppiumBy.accessibilityId("Investment_Amount")).sendKeys("1000");
//		driver.findElement(AppiumBy.accessibilityId("SalesLoad_Checkbox")).click();
//		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
//		driver.findElement(AppiumBy.accessibilityId("Copy")).click();     // copy account no
//		
//		driver.findElement(AppiumBy.accessibilityId("UploadImage")).click();
//		driver.findElement(AppiumBy.accessibilityId("Cancel")).click();
//		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
//		driver.findElement(AppiumBy.accessibilityId("Camera")).click();
//		
//		// For Permission
//		driver.findElement(AppiumBy.accessibilityId("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
//		driver.findElement(AppiumBy.accessibilityId("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
//		driver.findElement(AppiumBy.accessibilityId("com.android.permissioncontroller:id/permission_deny_button")).click();
//		
//		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
//		driver.findElement(AppiumBy.accessibilityId("Done")).click();
//		driver.findElement(AppiumBy.accessibilityId("Retake")).click();
//		driver.findElement(AppiumBy.accessibilityId("Cancel")).click();
//		
//		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
//		driver.findElement(AppiumBy.accessibilityId("Close")).click();
	
//		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("AMC, tab, 2 of 4")).click();		
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Alfalah GHP Cash Fund\"))"));
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Alfalah GHP Cash Fund\"))"));
		driver.findElement(AppiumBy.accessibilityId("Alfalah GHP Cash Fund, Conventional, High Risk, Return P.A, 15 %, NAV, 504.6678")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Invest Now\"))"));
		driver.findElement(AppiumBy.accessibilityId("Invest Now")).click();
		
		// for first time - modal
		driver.findElement(AppiumBy.accessibilityId("I'm new to investing in Alfalah Ghp Investment Management Ltd (IC). Let's proceed with the investment.")).click();
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		
		WebElement amount = driver.findElement(AppiumBy.className("android.widget.EditText"));
		amount.click();
		amount.sendKeys("5000");
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Payment Receipt")).click();
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Close")).click();
		
		Thread.sleep(2000);
	
	}
}