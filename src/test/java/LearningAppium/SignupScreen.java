package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SignupScreen extends BaseTest {

	@Test
	public void ConversionTest() throws MalformedURLException , InterruptedException {
		

		driver.findElement(AppiumBy.accessibilityId("Log in to YPay")).click();
		
		
		Thread.sleep(2000);
	}

}
