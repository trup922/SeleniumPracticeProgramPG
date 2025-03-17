package selenium_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LongPageScroll {
	
	@Test
	public void pageScroll() {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/long-page.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		long height=(long) js.executeScript("return document.body.scrollHeight");
		while(true) {
			js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
			long newheight=(long) js.executeScript("return document.body.scrollHeight");
			System.out.println(newheight );
			if(height==newheight) {
				break;
			}
			
			height=newheight;
		}
		
		
		
	}

}
