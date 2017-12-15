package selenium_important;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakesScreenShot
{
	
	
		static
		{
		String GECKO_KEY="webdriver.gecko.driver";
		String GECKO_VALUE="/home/tyss/Desktop/Softwares/geckodriver";
		
		 System.setProperty(GECKO_KEY,GECKO_VALUE);
		
	 //WebDriver driver = new FirefoxDriver();
    // driver.get("https:\\www.google.com");
		}
	public static void main(String[] args) throws Exception 
	{
		//String CHROME_KEY="webdriver.chrome.driver";
		//String CHROME_VALUE="/home/tyss/Desktop/Softwares/chromedriver";
	 // System.setProperty(CHROME_KEY,CHROME_VALUE);
		 //WebDriver driver = new ChromeDriver();
		 WebDriver driver = new FirefoxDriver();
	      driver.get("https:\\www.google.com");
      TakesScreenshot t = (TakesScreenshot) driver;
      File src=t.getScreenshotAs(OutputType.FILE);
      File dst=new File("./abc.png");
     
      org.apache.commons.io.FileUtils.copyFile(src, dst);
     
      Thread.sleep(2000);
      System.out.println("================before close=============");
      driver.close();
      System.out.println("================after close=============");
	}
	
}
