package selenium_important;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicitly_wait 
{
	
	public static void main(String[] args) 
	{
		String GECKO_KEY = "webdriver.gecko.driver";
		String GECKO_VALUE = "/home/tyss/Desktop/Softwares/geckodriver";
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://webmail.testyantra.com/");
		driver.findElement(By.id("user")).sendKeys("abc");
		driver.findElement(By.id("pass")).sendKeys("pwd");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
}
