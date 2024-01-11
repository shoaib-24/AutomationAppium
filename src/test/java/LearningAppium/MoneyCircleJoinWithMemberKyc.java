package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

		//Having member kyc but no organizer kyc
public class MoneyCircleJoinWithMemberKyc extends BaseTest {

	@Test
	public void MemberKycTest() throws MalformedURLException , InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Know More")).click();
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("YvAJ64ZO");;
		driver.findElement(AppiumBy.accessibilityId("Go")).click();
		
		
		Thread.sleep(2000);
	}

}
