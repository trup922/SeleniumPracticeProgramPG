package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LodingImagesWaitProgram {

	@Test
	public void lodigImage() {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
		WebElement loadimage =driver.findElement(By.id("spinner"));
		WebElement text=driver.findElement(By.id("text"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(loadimage));
		String str=text.getText();
		System.out.println(str);
		
		
		
		
		
		
		
		
	}
	
	
}
