package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resource.DemoQaInteractionPageConstatns;
//Here are all the methods for the page in the class name
public class DemoQaInteractionPage {
	
	public static void clickOnWidgets(WebDriver driver) {
		driver.findElement(By.xpath(DemoQaInteractionPageConstatns.BTN_WIDGETS_XPATH)).click();
	}
	public static void goToTooltips(WebDriver driver) {
		driver.navigate().to(DemoQaInteractionPageConstatns.URL_TOOLTIPS);
	}

}
