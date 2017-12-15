package selenium_important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bigbasketpractise 
{
	public static void main(String[] args) throws Exception 
	{
		String GECKO_KEY = "webdriver.gecko.driver";
		String GECKO_VALUE = "/home/tyss/Desktop/Softwares/geckodriver";
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bigbasket.com");
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.className("bb-offers-link")).click();
		
	}

}
