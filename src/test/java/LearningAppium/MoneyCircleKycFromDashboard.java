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
public class MoneyCircleKycFromDashboard extends BaseTest {

	public void MoneyCircleTest() throws MalformedURLException , InterruptedException {
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Create saving committees with friends & family to pool funds together\"));"));
		Thread.sleep(2000);
		
		int textCount = driver.findElements(AppiumBy.className("android.widget.TextView")).size();
		System.out.println(textCount);
		
		int _count = 0;
		
		for(int i = 0 ; i < textCount; i++) {
			
			String textName = driver.findElements(AppiumBy.className("android.widget.TextView")).get(i).getText();
//			System.out.println(textName + " " + i);
				
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

		MoneyCircleKycMethod();
				
		Thread.sleep(2000);
		
	}

}
