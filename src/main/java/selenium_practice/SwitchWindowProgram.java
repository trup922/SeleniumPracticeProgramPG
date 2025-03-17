package selenium_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindowProgram {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windowshttps://the-internet.herokuapp.com/windows");
		
		
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Click Here']"));
		ele.click();
		String ParentWindow= driver.getWindowHandle();
		Set<String> Windows= driver.getWindowHandles();
		String ChildWindow=null;
		
		for(String Window:Windows) {
			if(Window!=ParentWindow) {
				driver.switchTo().window(ParentWindow);
				System.out.println("I am in parentWindow");
			}
			
			driver.switchTo().window(ChildWindow);
			System.out.println(driver.findElement(By.xpath("//h3")).getText());
			
		}
		
		
		
		
		
		
		

	}

}
