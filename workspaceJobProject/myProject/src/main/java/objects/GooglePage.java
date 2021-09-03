package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.GooglePageConstants;
//Here are all the methods for the page in the class name
public class GooglePage {
	
	public static void clickOnSearchAndInput(WebDriver driver, String searchItem) {
		driver.get(GooglePageConstants.URL_GOOGLE);
		driver.manage().window().maximize();
		WebElement input = driver.findElement(By.xpath(GooglePageConstants.XPATH_SEARCH_INPUT));
		input.click();
		input.sendKeys(searchItem);
		input.findElement(By.xpath(GooglePageConstants.BTN_GOOGLE)).click();
	}
	
	

}
