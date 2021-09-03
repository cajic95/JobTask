package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resource.OrangehrmMainPageConstants;

public class OrangehrmMainPage {
	
	public static void clickRecruitment(WebDriver driver) {
		driver.findElement(By.xpath(OrangehrmMainPageConstants.BTN_RECRUITMENT_XPATH)).click();
	}
	public static void clickCandidates(WebDriver driver) {
		driver.findElement(By.xpath(OrangehrmMainPageConstants.BTN_CANDIDATES_XPATH)).click();
	}
}
