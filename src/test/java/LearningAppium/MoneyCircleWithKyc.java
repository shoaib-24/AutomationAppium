package LearningAppium;

import java.net.MalformedURLException;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

@Test
public class MoneyCircleWithKyc extends BaseTest {

	public void MoneyCircleTest() throws MalformedURLException , InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Know More\").instance(0))"));
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Know More")).click();
		driver.findElement(AppiumBy.accessibilityId("Create Now")).click();
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(AppiumBy.accessibilityId("Name Your Circle"));
		name.click();
		name.sendKeys("My Circle");
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("I'll be a member as well")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		WebElement amount = driver.findElement(AppiumBy.className("android.widget.EditText")); // required ID
		amount.click();
		amount.sendKeys("50000");
		
		driver.hideKeyboard();
		driver.findElement(AppiumBy.accessibilityId("Calculate Monthly Installment")).click();
//		driver.findElement(AppiumBy.accessibilityId("Calculate Monthly Installment")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("Custom Method: You will personally manage the payout schedule based on your chosen criteria")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		WebElement dueDate = driver.findElement(AppiumBy.accessibilityId("Decide Due Date"));
		dueDate.click();
		dueDate.sendKeys("02");
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Profile_Picture_MC\"]/android.view.ViewGroup/android.widget.ImageView")).click();
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		driver.findElement(AppiumBy.accessibilityId("I have read and agreed to the Terms & Conditons")).click();
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		Thread.sleep(5000);
		
		driver.findElement(AppiumBy.accessibilityId("Create Profile Now")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("CNIC Front Image")).click();
		driver.findElement(By.id("android:id/button2")).click();
//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();       // in emulator in Android Studio
		driver.findElement(AppiumBy.accessibilityId("Done")).click();          // emulator
		
		driver.findElement(AppiumBy.accessibilityId("CNIC Back Image")).click();
		driver.findElement(By.id("android:id/button2")).click();
//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();       // in emulator in Android Studio
		driver.findElement(AppiumBy.accessibilityId("Done")).click();          // emulator
		
		driver.findElement(AppiumBy.accessibilityId("CNIC Issue Date")).click();
		driver.findElement(AppiumBy.accessibilityId("02 November 2023")).click();
		driver.findElement(By.id("android:id/button1")).click();
		
		WebElement address = driver.findElement(AppiumBy.accessibilityId("Address"));
		address.click();
		address.sendKeys("Scheme33");
		driver.hideKeyboard();
		
		driver.findElement(AppiumBy.accessibilityId("Proof of Address (utility bill etc.)")).click();
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("Occupation")).click();
		driver.findElement(AppiumBy.accessibilityId("Wholesaler")).click();
		driver.findElement(AppiumBy.accessibilityId("Graduate and above")).click();
		WebElement institution = driver.findElement(AppiumBy.accessibilityId("Name of Institution (optional)"));
		institution.click();
		institution.sendKeys("Karachi University");
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		// Committees managed count -------> temporarily ignore
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		WebElement member_01 = driver.findElement(AppiumBy.accessibilityId("Enter Name (Member 01)*"));
//		member_01.click();
		member_01.sendKeys("Ali");
		
		WebElement phone_member_01 = driver.findElement(By.xpath("(//android.widget.EditText[@content-desc=\"phoneInput\"])[1]"));
//		phone_member_01.click();
		phone_member_01.sendKeys("3002002002");
		
		// Issue in 2nd member phone number
		WebElement member_02 = driver.findElement(AppiumBy.accessibilityId("Enter Name (Member 02)*"));
//		member_02.click();
		member_02.sendKeys("Anas");
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Enter Name (Member 03)\"));"));
		
		WebElement phone_member_02 = driver.findElement(By.xpath("(//android.widget.EditText[@content-desc=\"phoneInput\"])[2]"));
//		phone_member_02.click();
		phone_member_02.sendKeys("3003003003");
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("Bank Name")).click();
		driver.findElement(AppiumBy.accessibilityId("ASKARI BANK LIMITED")).click();
		WebElement branchName = driver.findElement(AppiumBy.accessibilityId("Branch Name"));
		branchName.click();
		branchName.sendKeys("Zamzama");
		
		WebElement IBAN_No = driver.findElement(AppiumBy.accessibilityId("IBAN"));
		IBAN_No.click();
		IBAN_No.sendKeys("PK12ABCD2000300040005000");
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		driver.findElement(AppiumBy.accessibilityId("Dashboard")).click();
		
		Thread.sleep(2000);
		
	}

}
