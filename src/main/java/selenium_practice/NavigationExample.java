package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationExample {

	
	@Test
	public void navigation() {
		
		WebDriver driver;
		 driver =new ChromeDriver();
		 driver.get("https://bonigarcia.dev/selenium-webdriver-java/navigation1.html");
		 driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/navigation2.html");
		// driver.findElement(By.xpath("//a[@class='page-link']")).click();
		 driver.navigate().forward();
		 driver.navigate().back();
		 driver.navigate().refresh();
		 driver.quit();
		 
		 
		
		
	}
	
	
	
	
}
