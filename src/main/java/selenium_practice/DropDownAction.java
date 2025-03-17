package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownAction {

	@Test
	public void leftclick() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");
		driver.manage().window().maximize();

		WebElement left = driver.findElement(By.id("my-dropdown-1"));
		left.click();

		WebElement right = driver.findElement(By.id("my-dropdown-2"));
		Actions action = new Actions(driver);
		action.contextClick(right).build().perform();
		
		
	    WebElement doubl = driver.findElement(By.id("my-dropdown-3"));
	    action.doubleClick(doubl).build().perform();
		
		driver.quit();		
		
	
	
	}
	}