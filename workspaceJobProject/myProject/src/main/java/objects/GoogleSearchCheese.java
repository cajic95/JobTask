package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resource.GooglePageConstants;

public class GoogleSearchCheese {
	
	public static String resultOfCheese(WebDriver driver) {
		return driver.findElement(By.xpath(GooglePageConstants.RESULT_OF_SEARCH_XPATH)).getText();
		 
	
	}

}
