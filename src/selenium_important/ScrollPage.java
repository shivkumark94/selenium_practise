package selenium_important;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.unix.X11.Window;

public class ScrollPage 
{
	static
	{
	String GECKO_KEY="webdriver.gecko.driver";
	String GECKO_VALUE="/home/tyss/Desktop/Softwares/geckodriver";
	
	System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0,500)", "");	//this can also be used
		
		jse.executeScript("scroll(0, 500)"); //another way of scroll
		Thread.sleep(2000);
		jse.executeScript("scroll(0, -250)"); //scroll up
		//driver.close();
		driver.quit();
	}
}
