package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertProgram {

	@Test
	public void alertDialongBox() {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
		WebElement simplealert = driver.findElement(By.id("my-alert"));
		simplealert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement dismissAlert = driver.findElement(By.id("my-confirm"));
		dismissAlert.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();

		WebElement typemsg = driver.findElement(By.id("my-prompt"));
		typemsg.click();
		Alert prompalert = driver.switchTo().alert();
		prompalert.sendKeys("Priya123");
		prompalert.accept();
		
		//Alert2

	}

}
	

