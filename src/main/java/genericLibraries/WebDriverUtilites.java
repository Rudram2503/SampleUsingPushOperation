package genericLibraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilites {
	
	public void dropDown(WebElement dropdown,String text)
	{
		Select s = new Select(dropdown);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void rightClick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void doubleClick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void draganddrop(WebDriver driver, WebElement src , WebElement dest)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src,dest).perform();
	}
	
	public void switchFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	public void switchBackFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void alertpopupAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void alertpopupDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void scroll(WebDriver driver, WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	
	
	
	

}
