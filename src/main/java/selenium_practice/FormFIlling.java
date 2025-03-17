package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.opentelemetry.api.common.Value;

public class FormFIlling {

	@Test
	public void main() {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		driver.findElement(By.id("my-text-id")).sendKeys("Priyanka");
		driver.findElement(By.name("my-password")).sendKeys("Priyanka@123");
		driver.findElement(By.name("my-textarea")).sendKeys("Priyanka");

		WebElement dropdown = driver.findElement(By.name("my-select"));
		dropdown.click();
		Select sel = new Select(dropdown);
		sel.selectByIndex(2);
		// sel.deselectByIndex(2);
		// sel.selectByVisibleText("Two");

		WebElement datalist = driver.findElement(By.name("my-datalist"));
		datalist.click();

		List<WebElement> options = driver.findElements(By.xpath("//datalist/option"));
		for (WebElement option : options) {
			if (option.getAttribute("value").equals("New York")) {
				datalist.sendKeys("New York");
			}
		
		}
		
			
		
		WebElement fileupload = driver.findElement(By.xpath("//input[@type='file'][@name='my-file']"));
			String file = "D:\\newfile1.txt";
			fileupload.sendKeys(file);
			
			
		WebElement checkbox=driver.findElement(By.id("my-check-1"));
		//checkbox.click();
		WebElement defaultcheckbox=driver.findElement(By.id("my-check-2"));
		if(checkbox.isDisplayed()) {
			defaultcheckbox.click();
		}
		
		WebElement radiobtn=driver.findElement(By.name("my-radio"));
		
		radiobtn.click();
		WebElement defaultrediobtn=driver.findElement(By.id("my-radio-2"));
		if(radiobtn.isDisplayed()) {
			defaultcheckbox.click();
		}
		
	
	WebElement colur=driver.findElement(By.name("my-colors"));
	colur.click();
	colur.sendKeys("FF0000");
	
	
	WebElement datepicker=driver.findElement(By.name("my-date"));
	datepicker.click();
	
	String selectedyear = " February 1995  ";
driver.findElement(By.name("my-date")).click();
while (true) {
		WebElement monthyear = driver.findElement(By.className("datepicker-switch"));
	String month = monthyear.getText();
		//System.out.println(month);

		if (month.equals(selectedyear)) {

		

		}

	WebElement previousbtn = driver.findElement(By.className("prev"));
		previousbtn.click();
		break;
	}
	List<WebElement> days = driver.findElements(By.xpath("//tr/td[@class='day']"));
	for (WebElement date : days) {
		if (date.getText().equals("9")) {
			date.click();
			break;
		}
}
		
		driver.findElement(By.xpath("//button")).click();		
		

			driver.close();

		}
	}


