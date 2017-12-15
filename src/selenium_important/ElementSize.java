package selenium_important;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ElementSize {

public static void main(String[] args) {
	

 String GECKO_KEY="webdriver.gecko.driver";
	String GECKO_VALUE="/home/tyss/Desktop/Softwares/geckodriver";
	System.setProperty(GECKO_KEY, GECKO_VALUE);   
	
	
	WebDriver driver = new FirefoxDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get("https://www.google.co.in");
 
 
  //Locate element for which you wants to get height and width.
       // WebElement Image = driver.findElement(By.name("btnK"));
         WebElement Image = driver.findElement(By.id("lst-ib"));
        
        System.out.println("Script is executing");
        
        org.openqa.selenium.Dimension d = Image.getSize();
        int widthofelement = d.getWidth();
        System.out.println("image width is "+widthofelement+"pixels");
        
        //Get width of element.
     //    int ImageWidth = Image.getSize().getWidth();
     //   System.out.println("Image width Is "+ImageWidth+" pixels");
        
        //Get height of element.
     //   int ImageHeight = Image.getSize().getHeight();        
      //  System.out.println("Image height Is "+ImageHeight+" pixels");
 }
}