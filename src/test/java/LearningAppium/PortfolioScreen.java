package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class PortfolioScreen extends BaseTest {

	@Test
	public void Transaction() throws MalformedURLException , InterruptedException {
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup")).click();    //required
		
		driver.findElement(AppiumBy.accessibilityId("Unit Statement")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(AppiumBy.accessibilityId("Portfolio")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("AMC")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Risk Type")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Funds")).click();
		Thread.sleep(2000);
		
				
	
	}

}
