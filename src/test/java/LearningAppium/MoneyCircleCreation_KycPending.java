
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
public class MoneyCircleCreation_KycPending extends BaseTest {

	public void MoneyCircleWithoutKyc() throws MalformedURLException , InterruptedException {
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Know More\").instance(0))"));
		CreateCircle();
		
		Thread.sleep(2000);
		
		int count = driver.findElements(AppiumBy.className("android.widget.TextView")).size();
		System.out.println(count);

		for(int i = 10 ; i < count; i++) {
			
			String textName = driver.findElements(AppiumBy.className("android.widget.TextView")).get(i).getText();
			System.out.println(textName + " " + i);
		
			if(textName.contains("Chat With Support")) {
				System.out.println("Successfully Circle Created");
				System.out.println("Profile Pending");
				break;
			}
			else {
				System.out.println("Not Found");
			}
		}
		
		Thread.sleep(2000);
	}
}



