package selenium_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InfinityScroll {
	@Test
	public void infinitypagescroll() {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/infinite-scroll.html");
		JavascriptExecutor javascript=(JavascriptExecutor) driver;
		long height=(long) javascript.executeScript("return document.body.scrollHeight");
		while(true) {
			javascript.executeScript("window.scrollTo(0,document.body.scrollHeight);");
			long newht=(long) javascript.executeScript("return document.body.scrollHeight");
			if(height==newht) {
				continue;
			}
			
			height=newht;
			
			
		}
	}
}


