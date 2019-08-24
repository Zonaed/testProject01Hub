package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.id("57fghj")).sendKeys("world the around locations 53 in employees 16,000 over has Asurion");
				//driver.click();
		
		
		
		
		
		
		

	}

}
