package selenium_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SlowCalculator {

	@Test
	public void calculator() {
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");

		driver.findElement(By.xpath("//span[text()='5']")).click();

		driver.findElement(By.xpath("//span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		WebElement ele = driver.findElement(By.id("spinner"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));
		WebElement disply = driver.findElement(By.xpath("//div[@class='screen']"));
		String str = disply.getText();
		System.out.println(str);
		driver.quit();

	}

}
