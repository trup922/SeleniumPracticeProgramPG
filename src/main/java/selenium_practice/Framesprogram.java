package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Framesprogram {
	@Test
	public void frame() {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/frames.html");
		driver.switchTo().frame("frame-header");
		WebElement frameheader= driver.findElement(By.xpath("(//h1)[1]"));
		System.out.println(frameheader.getText());
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-body");
		WebElement framebody= driver.findElement(By.xpath("(//div//p)[1]"));
		System.out.println(framebody.getText());
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-footer");
		WebElement framefooter= driver.findElement(By.xpath("//a[text()='Boni García']"));
		System.out.println(framefooter.getText());
		driver.switchTo().parentFrame();
		
		
		
	}}
	


