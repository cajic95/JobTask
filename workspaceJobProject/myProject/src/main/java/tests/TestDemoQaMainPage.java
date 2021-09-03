package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects.DemoQaMainPage;
import objects.GooglePage;
import objects.GoogleSearchDemoQaPage;
import resource.DemoQaMainPageConstants;

public class TestDemoQaMainPage {
	private static WebDriver driver;
	
	@BeforeAll
	static	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MrCajic\\workspaceJobProject\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		GooglePage.clickOnSearchAndInput(driver, "demoqa.com");
		GoogleSearchDemoQaPage.clickOnDemoQa(driver);
		}
	//It is tested to see if we are on the right page
	@Test
	public void testIfWeOnDemoQaPage() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = DemoQaMainPageConstants.URL_DEMO_QA;
		assertEquals(actualUrl, expectedUrl);
		System.out.println("Uspesno prosao test1");
		DemoQaMainPage.clickOnInteractionBtn(driver);
		
	}
	

}
