package selenium_important;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestngSampleTest {
  @Test
  public void testTitle()
  {
	  String GECKO_KEY="webdriver.gecko.driver";
		String GECKO_VALUE="/home/tyss/Desktop/Softwares/geckodriver";
		System.setProperty(GECKO_KEY, GECKO_VALUE);   
		
		
		WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.co.in");
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  String etitle="Google";
	  String atitle=driver.getTitle();
	  assertEquals(atitle, etitle);
	  driver.quit();
  }
}
