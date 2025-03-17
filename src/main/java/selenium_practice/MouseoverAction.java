package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseoverAction {

	@Test
	public void mouseactions() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/mouse-over.html");
		WebElement compass = driver.findElement(By.xpath("//img[@class=\"img-fluid\"][@src=\"img/hands-on-icon.png\"]"));
		WebElement calender = driver.findElement(By.xpath("//img[@class=\"img-fluid\"][@src=\"img/calendar.png\"]"));
		WebElement award = driver.findElement(By.xpath("//img[@class=\"img-fluid\"][@src=\"img/award.png\"]"));
		WebElement landscape = driver.findElement(By.xpath("//img[@class=\"img-fluid\"][@src=\"img/landscape.png\"]"));

		Actions action = new Actions(driver);

		action.moveToElement(compass).build().perform();
		action.moveToElement(calender).build().perform();

		action.moveToElement(award).build().perform();

		action.moveToElement(landscape).build().perform();
		
		driver.quit();

	}
}
