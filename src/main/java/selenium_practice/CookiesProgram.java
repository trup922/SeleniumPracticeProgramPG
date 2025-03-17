package selenium_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CookiesProgram {
	@Test
	public void cookiePractice() {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/cookies.html");
		WebElement disply=driver.findElement(By.id("refresh-cookies"));
		disply.click();
		Set<Cookie> set=driver.manage().getCookies();
		for(Cookie cookies:set) {
			String name=cookies.getName();
			String value=cookies.getValue();
			System.out.println(name +","+ value);
			
		}
		
		Cookie cookie= new Cookie("Priya","1234");
		Cookie cookie1=new Cookie("Tushar","4567");
		System.out.println(cookie);
		driver.manage().addCookie(cookie);
		driver.manage().addCookie(cookie1);
		driver.manage().getCookies();
		
		for(Cookie cook:set) {
			System.out.println(cook.getName() + cook.getValue());
		}
		
		Cookie delete=driver.manage().getCookieNamed("Priya");
		driver.manage().deleteCookie(delete);
		driver.manage().getCookies();
		
		for(Cookie d:set) {
			System.out.println(d.getName()+d.getValue());
		}
		
		
		
		
		
		
		
		
	}
	
	

}
