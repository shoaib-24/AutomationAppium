package LearningAppium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException, InterruptedException {
		
		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\intel\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 6");
//		options.setApp("C:\\Users\\intel\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
//		options.setApp("C:\\Users\\intel\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ypay-testing.apk");
//		options.setApp("C:\\Users\\intel\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\testing-apk.apk");
//		options.setApp("C:\\Users\\intel\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\testing.apk");
//		options.setApp("C:\\Users\\intel\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ypay-app-testing.apk");
//		options.setApp("C:\\Users\\intel\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\testing-app.apk");
		options.setApp("C:\\Users\\intel\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\YPayTest-App.apk");
		
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Login
		// Actual Automation
		// XPath, ID, Accessibility ID, ClassName, AndroidUIAutomator
		
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Log in to YPay")).click();
//		driver.findElement(AppiumBy.accessibilityId("phoneInput")).sendKeys("3152008968");
		driver.findElement(AppiumBy.accessibilityId("phoneInput")).sendKeys("3442996761");
//		driver.findElement(AppiumBy.accessibilityId("phoneInput")).sendKeys("3202907524");
//		driver.findElement(AppiumBy.accessibilityId("phoneInput")).sendKeys("3112848034");
//		driver.findElement(AppiumBy.accessibilityId("phoneInput")).sendKeys("3472911682");
//		driver.findElement(AppiumBy.accessibilityId("phoneInput")).sendKeys("3312710052");
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		driver.findElement(AppiumBy.accessibilityId("code-input")).sendKeys("1234");
		Thread.sleep(2000);
	
//		WebElement pin = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		//By elementLocator = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
//		By elementLocator = AppiumBy.className("android.widget.EditText");
		//WebElement pinField = wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
//		new Actions(driver).sendKeys("1234").perform();
		//pinField.sendKeys("1234");
//		Thread.sleep(2000);
		
//		WebElement pin = driver.findElement(AppiumBy.className("android.widget.EditText"));
//		pin.sendKeys("1234");
		
	}
	
//	public void scrollToEndAction() {
//		boolean canScrollMore;
//		do
//		{
//		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//			    "left", 100, "top", 100, "width", 200, "height", 200,
//			    "direction", "down",
//			    "percent", 3.0
//			    
//			));
//		}while(canScrollMore);
//	}
	
	@AfterClass
	public void tearDown() {
		
		if(driver != null) {
			
		driver.quit();
		service.stop();
		}
	}
	
	
public void MoneyCircleKycMethod() throws MalformedURLException , InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Create Your Profile")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("CNIC Front Image")).click();
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
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
//		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
//		driver.findElement(AppiumBy.accessibilityId("Dashboard")).click();
		
		Thread.sleep(2000);
	}

public void EditCircle() throws MalformedURLException, InterruptedException{
	
	driver.findElement(AppiumBy.accessibilityId("Edit Circle")).click();
	WebElement awardAmount = driver.findElement(AppiumBy.accessibilityId("Award Amount"));
	awardAmount.click();
	awardAmount.clear();
	awardAmount.sendKeys("60000");
	WebElement totalParticipants = driver.findElement(AppiumBy.accessibilityId("Total Participants"));
	totalParticipants.click();
	totalParticipants.clear();
	totalParticipants.sendKeys("6");
	driver.findElement(AppiumBy.accessibilityId("Calculate Monthly Payment")).click();
	driver.hideKeyboard();
	driver.findElement(AppiumBy.accessibilityId("Payment Method")).click();
	driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"Custom Method\"])[1]")).click();
	WebElement dueDateEdit = driver.findElement(AppiumBy.accessibilityId("Decide Due Date"));
//	dueDateEdit.click();
//	driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).flingToEnd(2).scrollIntoView(new UiSelector().text(\"Decide Due Date\"))"));
//	dueDateEdit.clear();
	dueDateEdit.sendKeys("15");
	driver.findElement(AppiumBy.accessibilityId("Update")).click();
	Thread.sleep(3000);
	
	}


public void CreateCircle() throws MalformedURLException, InterruptedException{
	
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
//	driver.findElement(AppiumBy.accessibilityId("Calculate Monthly Installment")).click();
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
	Thread.sleep(2000);
	
	}

	public void StartCircle() throws MalformedURLException, InterruptedException{
	
		driver.findElement(AppiumBy.accessibilityId("Kickstart Your Circle")).click();
		String paymentMethod = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Payment Method\"]/android.widget.TextView")).getText();
		System.out.println(paymentMethod);
		
		if ("Lucky Draw".equals(paymentMethod)) {
		    driver.findElement(AppiumBy.accessibilityId("Start")).click();
		} 
		else if ("Custom Method".equals(paymentMethod)) {
		    driver.findElement(AppiumBy.accessibilityId("Next")).click();
		    driver.findElement(AppiumBy.accessibilityId("Start")).click();
		}
		
		Thread.sleep(1000);
		
		
		
		driver.findElement(AppiumBy.accessibilityId("Make Your Payment")).click();
		driver.findElement(AppiumBy.accessibilityId("Payment Receipt")).click(); 	
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		Thread.sleep(3000);
	}
	
	public void MemberKyc() throws MalformedURLException, InterruptedException{
		
		driver.findElement(AppiumBy.accessibilityId("Know More")).click();
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("YvAJ64ZO");;
		driver.findElement(AppiumBy.accessibilityId("Go")).click();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();  // ID required
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		driver.findElement(AppiumBy.accessibilityId("I have read and agreed to the Terms & Conditons")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		driver.findElement(AppiumBy.accessibilityId("CNIC Front Image")).click();
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		
		driver.findElement(AppiumBy.accessibilityId("CNIC Back Image")).click();
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Bank Name")).click();
		driver.findElement(AppiumBy.accessibilityId("ASKARI BANK LIMITED")).click();
		driver.findElement(AppiumBy.accessibilityId("Branch Name")).sendKeys("Zamzama");
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")).sendKeys("pk12abcd2000300040005000");
//		driver.findElement(AppiumBy.accessibilityId("IBAN_KYC")).sendKeys("pk12abcd2000300040005000"); // ID required
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		Thread.sleep(2000);
		
	}
	
	public void MainKyc() throws MalformedURLException, InterruptedException{
		
		// create profile
		driver.findElement(AppiumBy.accessibilityId("Create profile")).click();
		driver.findElement(AppiumBy.accessibilityId("CNIC Front Image")).click();
		
		
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();       // in emulator in Android Studio
//		driver.findElement(By.id("com.transsion.camera:id/shutter_button")).click();   // in mobile
		driver.findElement(AppiumBy.accessibilityId("Done")).click();          // emulator
//		driver.findElement(By.id("com.transsion.camera:id/shutter_panel_layout_root")).click(); // mobile
		
		
//		driver.findElement(AppiumBy.accessibilityId("Upload Image")).click();
		driver.findElement(AppiumBy.accessibilityId("CNIC Back Image")).click();
		driver.findElement(By.id("android:id/button2")).click();
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
//		driver.findElement(By.id("com.transsion.camera:id/shutter_button")).click();
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
//		driver.findElement(By.id("com.transsion.camera:id/shutter_panel_layout_root")).click();
		
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
		driver.findElement(AppiumBy.accessibilityId("14 November 2002")).click();
		driver.findElement(By.id("android:id/button1")).click();
		
		driver.findElement(AppiumBy.accessibilityId("CNIC")).sendKeys("4210109746969");
		
		// Issue date - CNIC
		WebElement issueDate = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"CNIC Issue Date\"]"));
		issueDate.click();
		
		WebElement issueYear = driver.findElement(By.id("android:id/date_picker_header_year"));
		issueYear.click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"2017\"))")).click();
		driver.findElement(AppiumBy.accessibilityId("20 November 2017")).click();
		driver.findElement(By.id("android:id/button1")).click();
		
		// Expiry date - CNIC
		WebElement expiryDate = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"CNIC Expiry Date\"]"));
		expiryDate.click();
		
		WebElement expiryYear = driver.findElement(By.id("android:id/date_picker_header_year"));
		expiryYear.click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"2027\"))")).click();
		driver.findElement(AppiumBy.accessibilityId("20 November 2027")).click();
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
		
		// Banking Details
		driver.findElement(AppiumBy.accessibilityId("Bank Name")).click();
		driver.findElement(AppiumBy.accessibilityId("ASKARI BANK LIMITED")).click();
		driver.findElement(AppiumBy.accessibilityId("Branch Name")).sendKeys("Zamzama");
		driver.findElement(AppiumBy.accessibilityId("Account Number")).sendKeys("200200200");
		driver.findElement(AppiumBy.accessibilityId("IBAN_KYC")).sendKeys("pk12abcd2000300040005000");
		driver.findElement(AppiumBy.accessibilityId("Finish")).click();
		
		// Review Kyc
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"I have read and agreed to the\"))"));
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Agreed_Terms\"]/android.widget.ImageView")).click();
//		driver.findElement(AppiumBy.accessibilityId("Submit profile")).click();
		
		Thread.sleep(2000);
		
	} 
	
	public void MainKyc_HighRisk() throws MalformedURLException, InterruptedException{
		
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

		Thread.sleep(2000);
	}
	
	
}