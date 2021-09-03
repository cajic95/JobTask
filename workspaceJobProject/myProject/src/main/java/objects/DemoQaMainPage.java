package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resource.DemoQaMainPageConstants;
//Here are all the methods for the page in the class name
public class DemoQaMainPage {
	
	public static void clickOnInteractionBtn(WebDriver driver) {
		driver.findElement(By.xpath(DemoQaMainPageConstants.BTN_INTERACTIONS_XPATH)).click();
	}

}
