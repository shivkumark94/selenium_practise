package selenium_important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args)
	{
		String GECKO_KEY = "webdriver.gecko.driver";
		String GECKO_VALUE = "/home/tyss/Desktop/Softwares/geckodriver";
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dst).perform();
	}
}
