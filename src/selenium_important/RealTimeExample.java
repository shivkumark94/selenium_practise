package selenium_important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RealTimeExample
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
		driver.get("https://www.caratlane.com/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='JEWELLERY']")).click();
		//driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Engagement Rings']")).click();
		//driver.navigate().refresh();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//img[@class='responsively-lazy hover__img']|//img[@alt='Captive Coronet Ring'])[1]")).click();
		
	}
}
