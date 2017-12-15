package selenium_important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass 
{
	public static void main(String[] args) throws Exception 
	{
		String GECKO_KEY = "webdriver.gecko.driver";
		String GECKO_VALUE = "/home/tyss/Desktop/Softwares/geckodriver";
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///home/tyss/Desktop/samplewebpage.html");
		WebElement hotel = driver.findElement(By.id("slv"));
		Select sel = new Select(hotel);
		//Thread.sleep(2000);
		//sel.selectByIndex(4);
		
		//Thread.sleep(2000);
		//sel.selectByValue("v");
		
		Thread.sleep(2000);
		sel.selectByVisibleText("poori");	
	}
}
