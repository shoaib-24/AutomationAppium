package LearningAppium;

import java.net.MalformedURLException;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

@Test
public class MoneyCircleScreenCondition extends BaseTest {

	public void MoneyCircleTest() throws MalformedURLException , InterruptedException {
		
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
//			System.out.println(textName + " " + i);
				
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
		System.out.println(_count);
		
		if(_count == 1) {
			driver.findElement(AppiumBy.accessibilityId("Dashboard")).click();
		}
		else {
			driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"Dashboard\"])[2]")).click();
		}
		
		Thread.sleep(2000);
		int count = driver.findElements(AppiumBy.className("android.widget.TextView")).size();
		System.out.println(count);
				
		
		for(int i = 0 ; i < count; i++) {
			
			String textName = driver.findElements(AppiumBy.className("android.widget.TextView")).get(i).getText();
			System.out.println(textName + " " + i);
//			try {
//				System.out.println("test");
//				if(textName.contains("Welcome to"));
//			    // Your code here if the assertion passes
//			    System.out.println("success1");
//			    driver.findElement(AppiumBy.accessibilityId("Edit Circle")).click();
//			    System.out.println("success2");
//			    break;
//			} catch (AssertionError e) {
//			    // Your code here if the assertion fails
//				 System.out.println(e);
//			}
			if(textName.contains("Chat With Support")) {
				System.out.println("Profile Pending");
				EditCircle();
				break;
			}
			if(textName.contains("Create Your Profile")) {
				System.out.println("Profile Required");
				MoneyCircleKycMethod();
				break;
			}
			if(textName.contains("View Circle Detail")) {
				System.out.println("Profile Approved");
				EditCircle();
				break;
			}
			if(textName.contains("Kickstart Your Circle")){
				System.out.println("Kickstart the circle");
				StartCircle();
				break;
			}
		
		}
				
		Thread.sleep(2000);
	}

}

