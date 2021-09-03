package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objects.GooglePage;
import objects.GoogleSearchDemoQaPage;
import resource.DemoQaMainPageConstants;
import resource.GooglePageConstants;

public class TestGoogleSearchDeniQaPage {
	private static WebDriver driver;

	@BeforeAll
	static public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MrCajic\\workspaceJobProject\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	// It is tested to see if we are on the right page
	@Test
	public void testSearchInput() {
		GooglePage.clickOnSearchAndInput(driver, "demoqa.com");

		String actual = driver.getTitle().substring(0, 10);
		String expected = "demoqa.com";
		assertEquals(actual, expected);

	}

}