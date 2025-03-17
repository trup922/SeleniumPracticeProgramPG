package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesSecondProgram {
	
	@Test
	public void secondFrameProgram() {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		System.out.println("i am in left frame");
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		System.out.println("i am in middle frame");
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-right");
		System.out.println("i am in right frame");
		driver.switchTo().parentFrame();
		
		
		
		
		
		
	}

}
