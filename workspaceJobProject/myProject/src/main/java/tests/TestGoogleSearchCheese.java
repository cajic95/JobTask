package tests;






import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects.GooglePage;
import objects.GoogleSearchCheese;

public class TestGoogleSearchCheese {
	private static WebDriver driver;
	
	@BeforeAll
	static	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MrCajic\\workspaceJobProject\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}

	@Test
	public void testResult() {
		String cheese = "cheese";
		GooglePage.clickOnSearchAndInput(driver, cheese);
		String numCheese = "777";
		String actual = GoogleSearchCheese.resultOfCheese(driver).substring(4, 11);
		String message = "There is too much cheese on the internet";
		
		assertEquals(numCheese, actual, message);
		
	}
}
