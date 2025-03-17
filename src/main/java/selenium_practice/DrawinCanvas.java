package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DrawinCanvas {
	
	@Test
	public void drawlineOnCanvas() {
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/draw-in-canvas.html");
		WebElement canvas=driver.findElement(By.id("my-canvas"));
		
		int x=15;
		
		Actions action=new Actions(driver);
		action.moveToElement(canvas).clickAndHold();
		
		for(int i=0;i<=x;i++) {
			
		
		action.moveByOffset(i, 0);
		}
		action.release().build().perform();
		
		
		
	}

}
