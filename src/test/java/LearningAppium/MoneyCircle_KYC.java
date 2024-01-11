package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class MoneyCircle_KYC extends BaseTest {

	@Test
	public void MoneyCircleKycMethod() throws MalformedURLException , InterruptedException {
		
		Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		By elementLocator = By.xpath("(//android.view.ViewGroup[@content-desc=\"Dashboard\"])[2]");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
//		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Dashboard\").instance(0))"));
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Create saving committees with friends & family to pool funds together\"));"));
		Thread.sleep(2000);
		
		int textCount = driver.findElements(AppiumBy.className("android.widget.TextView")).size();
		System.out.println(textCount);
		
		int _count = 0;
		
		for(int i = 0 ; i < textCount; i++) {
			
			String textName = driver.findElements(AppiumBy.className("android.widget.TextView")).get(i).getText();
			System.out.println(textName + " " + i);
				
		if(textName.contains("Know More")) {
			System.out.println("Circle Required");
			CreateCircle();
			break;
		}
		if(textName.contains("Dashboard")) {
			System.out.println("Circle Created");
			_count++;
		}
		
	}
		
		if(_count == 1) {
			driver.findElement(AppiumBy.accessibilityId("Dashboard")).click();
		}
		else {
			driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"Dashboard\"])[2]")).click();
		}
		
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
