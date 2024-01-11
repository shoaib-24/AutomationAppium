package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Calendar;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;


public class KycUSCitizenOtherResident extends BaseTest {

	@Test
	public void KycUSCitizenTest() throws MalformedURLException , InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("AMC, tab, 2 of 4")).click();		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Alfalah GHP Cash Fund\"));"));
//		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Alfalah GHP Cash Fund\"))"));
		driver.findElement(AppiumBy.accessibilityId("Alfalah GHP Cash Fund, Conventional, Low Risk, Return P.A, 20.84 %, NAV, 522.5729")).click();  // testing
//		driver.findElement(AppiumBy.accessibilityId("Alfalah GHP Cash Fund, Conventional, High Risk, Return P.A, 15 %, NAV, 504.6678")).click();    // preprod
//		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Invest Now\"))"));
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Invest Now\"));"));
		driver.findElement(AppiumBy.accessibilityId("Invest Now")).click();
		
		// create profile
		driver.findElement(AppiumBy.accessibilityId("Create profile")).click();
		
		driver.findElement(AppiumBy.accessibilityId("CNIC Front Image")).click();		
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();       // in emulator in Android Studio
//		driver.findElement(By.id("com.transsion.camera:id/shutter_button")).click();   // in mobile
		driver.findElement(AppiumBy.accessibilityId("Done")).click();          // emulator
//		driver.findElement(By.id("com.transsion.camera:id/shutter_panel_layout_root")).click(); // mobile
		
		driver.findElement(AppiumBy.accessibilityId("CNIC Back Image")).click();
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
//		driver.findElement(By.id("com.transsion.camera:id/shutter_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
//		driver.findElement(By.id("com.transsion.camera:id/shutter_panel_layout_root")).click();
		
		// Citizen
		driver.findElement(AppiumBy.accessibilityId("Citizenship Status")).click();
		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"Pakistani only\"])[2]")).click();
		
		// Residence
		driver.findElement(AppiumBy.accessibilityId("Country of Residence")).click();
		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"Pakistan\"])[3]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Gender")).click();
		driver.findElement(AppiumBy.accessibilityId("Male")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		Thread.sleep(1000);
		
		// DOB
		WebElement DOB = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Date of Birth\"]"));
		DOB.click();
		
		WebElement birthYear = driver.findElement(By.id("android:id/date_picker_header_year"));
		birthYear.click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).flingBackward().scrollIntoView(new UiSelector().text(\"2002\"))")).click();
		driver.findElement(AppiumBy.accessibilityId("14 December 2002")).click();
		driver.findElement(By.id("android:id/button1")).click();
		
		driver.findElement(AppiumBy.accessibilityId("CNIC")).sendKeys("4210109746969");
		
		// Issue date - CNIC
		WebElement issueDate = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"CNIC Issue Date\"]"));
		issueDate.click();
		
		WebElement issueYear = driver.findElement(By.id("android:id/date_picker_header_year"));
		issueYear.click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"2017\"))")).click();
		driver.findElement(AppiumBy.accessibilityId("20 December 2017")).click();
		driver.findElement(By.id("android:id/button1")).click();
		
		// Expiry date - CNIC
		WebElement expiryDate = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"CNIC Expiry Date\"]"));
		expiryDate.click();
		
		WebElement expiryYear = driver.findElement(By.id("android:id/date_picker_header_year"));
		expiryYear.click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"2027\"))")).click();
		driver.findElement(AppiumBy.accessibilityId("20 December 2027")).click();
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		// Parents Information
		driver.findElement(AppiumBy.accessibilityId("Mother's Name")).sendKeys("testing");
		driver.findElement(AppiumBy.accessibilityId("Father's Name")).sendKeys("Testing");
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		// Address Information
		driver.findElement(AppiumBy.accessibilityId("Current Address")).sendKeys("address123");
		driver.findElement(AppiumBy.accessibilityId("Province")).click();
		driver.findElement(AppiumBy.accessibilityId("Sindh")).click();
		driver.findElement(AppiumBy.accessibilityId("City")).click();
		driver.findElement(AppiumBy.accessibilityId("Karachi")).click();
		
		// Tax Residency Outside Pakistan
		driver.findElement(AppiumBy.accessibilityId("Do you have tax residency outside of Pakistan?")).click();
		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"Yes\"])[1]")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();

		
		// Prove of income
		driver.findElement(AppiumBy.accessibilityId("Source of Income")).click();
		driver.findElement(AppiumBy.accessibilityId("Salary/Wages")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Occupation")).click();
		driver.findElement(AppiumBy.accessibilityId("Private Service")).click();
		
		// Salary slip - optional
//		driver.findElement(AppiumBy.accessibilityId("Proof of Income/Salary Slip")).click();
//		driver.findElement(By.id("android:id/button2")).click();
//		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
//		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		// Zakat - Yes
		driver.findElement(AppiumBy.accessibilityId("Yes")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		// No - AddForm
//		driver.findElement(AppiumBy.accessibilityId("No")).click();
//		driver.findElement(AppiumBy.accessibilityId("Zakat Declaration Form")).click();
//		driver.findElement(By.id("android:id/button1")).click();
		
		// Nominee 
		driver.findElement(AppiumBy.accessibilityId("Nominee Name")).sendKeys("test");
		driver.findElement(AppiumBy.accessibilityId("CNIC_Nominee")).sendKeys("4210102648989");
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		//Facta CRS
		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"No_0\"])[1]")).click();
		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"No_1\"])[1]")).click();
		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"No_2\"])[1]")).click();
		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"No_3\"])[1]")).click();
		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"No_4\"])[1]")).click();
		
		// TIN No
		driver.findElement(AppiumBy.accessibilityId("Taxpayer Identification Number (TIN)")).sendKeys("993501234");
		driver.findElement(AppiumBy.accessibilityId("Passport Number")).sendKeys("100200300400");
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		// Banking Details
		driver.findElement(AppiumBy.accessibilityId("Bank Name")).click();
		driver.findElement(AppiumBy.accessibilityId("ASKARI BANK LIMITED")).click();
		driver.findElement(AppiumBy.accessibilityId("Branch Name")).sendKeys("Zamzama");
		driver.findElement(AppiumBy.accessibilityId("Account Number")).sendKeys("200200200");
		driver.findElement(AppiumBy.accessibilityId("IBAN_KYC")).sendKeys("pk12abcd2000300040005000");
		driver.findElement(AppiumBy.accessibilityId("Finish")).click();
		
		// Alert for Tax Residency
		driver.findElement(By.id("android:id/button1")).click();
		
		// Review Kyc
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"I have read and agreed to the\"))"));
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Agreed_Terms\"]/android.widget.ImageView")).click();
//		driver.findElement(AppiumBy.accessibilityId("Submit profile")).click();
		
		// After Kyc
//		driver.findElement(AppiumBy.accessibilityId("Make an investment")).click();
//		driver.findElement(AppiumBy.accessibilityId("I'm new to investing in Alfalah Ghp Investment Management Ltd (IC). Let's proceed with the investment.")).click();
//		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		
		
		Thread.sleep(5000);
	}
}
