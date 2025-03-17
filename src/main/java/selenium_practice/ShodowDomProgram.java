package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.annotations.Test;

public class ShodowDomProgram {
	@Test
   public void shodowDom()	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html");
		WebElement ele=driver.findElement(By.id("content"));
		SearchContext shodowroot=ele.getShadowRoot();
		WebElement showdow=shodowroot.findElement(By.cssSelector("p"));
		System.out.println(showdow.getText());
		
		
	   
   }

}
