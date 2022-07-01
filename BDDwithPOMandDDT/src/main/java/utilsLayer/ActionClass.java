package utilsLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClasssys;

public class ActionClass extends BaseClasssys {
	
	public static void main(String[] args) {
		
		BaseClasssys.initialization();
		
		WebElement wb=driver.findElement(By.name("company_name"));
		
		Actions act = new Actions(driver);
		
		act.click(wb).sendKeys(wb, "tcs");
		
		act.sendKeys(Keys.TAB,"tcs@gmail.com");
		act.sendKeys(Keys.TAB,"12345678");
		act.sendKeys(Keys.TAB,"12345678");
		act.sendKeys(Keys.TAB,Keys.ENTER);
		act.build().perform();
		
		
		
	}

}
