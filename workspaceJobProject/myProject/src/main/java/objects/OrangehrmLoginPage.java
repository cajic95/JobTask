package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resource.OrangehrmLoginPageConstants;

public class OrangehrmLoginPage {
	
	public static void clickOnLoginBtn(WebDriver driver) {
		driver.findElement(By.xpath(OrangehrmLoginPageConstants.BTN_LOGIN_XPATH)).click();
	}
	
}
