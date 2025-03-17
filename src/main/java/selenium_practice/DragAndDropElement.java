package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropElement {
	@Test
	public void draganddropElement() {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/drag-and-drop.html");
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement destination=driver.findElement(By.id("target"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();	
		driver.quit();
		
		
	}

}
