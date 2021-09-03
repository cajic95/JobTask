package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.GooglePageConstants;
import resource.GoogleSearchDemoQaPageConstatnts;
//Here are all the methods for the page in the class name
public class GoogleSearchDemoQaPage {
	
	public static String readInputField(WebDriver driver,String text) {
		WebElement field = driver.findElement(By.xpath(GoogleSearchDemoQaPageConstatnts.INPUT_FIELD_XPATH));
		return field.getAttribute(text);
	}
	public static void clickOnDemoQa(WebDriver driver) {
		driver.findElement(By.xpath(GooglePageConstants.DEMO_QA_XPATH)).click();
	}
	

}
