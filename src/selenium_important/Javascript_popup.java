package selenium_important;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascript_popup 

{
	
	
	public static void main(String[] args) throws Exception 
	{
		String GECKO_KEY = "webdriver.gecko.driver";
		String GECKO_VALUE = "/home/tyss/Desktop/Softwares/geckodriver";
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("loginbutton")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(1000);
		//driver.close(); // This is not working for firefox browser due to version issues 
		driver.quit();
	}
}
