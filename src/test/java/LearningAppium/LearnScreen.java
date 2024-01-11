package LearningAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LearnScreen extends BaseTest {
	
	@Test
	public void LearnTest() throws MalformedURLException, InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("LandingPage, tab, 3 of 4")).click();
		driver.findElement(AppiumBy.accessibilityId("YPay Academy, Get money smart. Learn the basics of financial planning, including how to read fund details before investing.")).click();
		
		// Master your money
		driver.findElement(AppiumBy.accessibilityId("Master Your Money")).click();
		
//		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 1st slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 2nd slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 3rd slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 3rd slide
		
		driver.findElement(AppiumBy.accessibilityId("Start")).click(); 
		
		// Q/A
		driver.findElement(AppiumBy.accessibilityId("B")).click();      // correct answer
		driver.findElement(AppiumBy.accessibilityId("Let's go")).click();
		driver.findElement(AppiumBy.accessibilityId("Next up")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("C")).click();      // wrong answer
		driver.findElement(AppiumBy.accessibilityId("Let's go")).click();
		driver.findElement(AppiumBy.accessibilityId("Next up")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("A")).click();      // wrong answer
		driver.findElement(AppiumBy.accessibilityId("Let's go")).click();
		driver.findElement(AppiumBy.accessibilityId("Next up")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("A")).click();      // correct answer
		driver.findElement(AppiumBy.accessibilityId("Let's go")).click();
		driver.findElement(AppiumBy.accessibilityId("Next up")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("A")).click();      // wrong answer
		driver.findElement(AppiumBy.accessibilityId("Let's go")).click();
		driver.findElement(AppiumBy.accessibilityId("Next up")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("Back to Main")).click();
		
		// Investment Vehicles
		driver.findElement(AppiumBy.accessibilityId("Investment Vehicles")).click();
		
//		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 1st slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 2nd slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 3rd slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 4th slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 5th slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 6th slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 7th slide
		
		driver.findElement(AppiumBy.accessibilityId("Start")).click();
		
		// Q/A
		driver.findElement(AppiumBy.accessibilityId("B")).click();      // wrong answer
		driver.findElement(AppiumBy.accessibilityId("Let's go")).click();
		driver.findElement(AppiumBy.accessibilityId("Next up")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("A")).click();      // correct answer
		driver.findElement(AppiumBy.accessibilityId("Let's go")).click();
		driver.findElement(AppiumBy.accessibilityId("Next up")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("B")).click();      // correct answer
		driver.findElement(AppiumBy.accessibilityId("Let's go")).click();
		driver.findElement(AppiumBy.accessibilityId("Next up")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("Back to Main")).click();
		
		// Acing Fund Details
		driver.findElement(AppiumBy.accessibilityId("Acing Fund Details")).click();
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 1st slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 2nd slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 3rd slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 4th slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 5th slide
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Next")).click();   // 6th slide
		
		driver.findElement(AppiumBy.accessibilityId("Start")).click();
		
		// Q/A
		driver.findElement(AppiumBy.accessibilityId("A")).click();      // wrong answer
		driver.findElement(AppiumBy.accessibilityId("Let's go")).click();
		driver.findElement(AppiumBy.accessibilityId("Next up")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("C")).click();      // correct answer
		driver.findElement(AppiumBy.accessibilityId("Let's go")).click();
		driver.findElement(AppiumBy.accessibilityId("Next up")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("Back to Main")).click();
		
		Thread.sleep(2000);
	
	}
}
