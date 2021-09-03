package tests;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objects.OrangehrmLoginPage;
import objects.OrangehrmMainPage;
import resource.OrangehrmLoginPageConstants;
import resource.OrangehrmMainPageConstants;

public class TestOrangehrmLoginPage {

	private static WebDriver driver;

	@BeforeAll
	static public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MrCajic\\workspaceJobProject\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void TestOrangePage() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		driver.get(OrangehrmLoginPageConstants.URL_ORANGEHR);
		driver.manage().window().maximize();
		OrangehrmLoginPage.clickOnLoginBtn(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement c3ivent = driver.findElement(By.xpath(OrangehrmMainPageConstants.WEBELEMENT_XPATH));
		wait.until(ExpectedConditions.elementToBeClickable(c3ivent));
		OrangehrmMainPage.clickRecruitment(driver);
		OrangehrmMainPage.clickCandidates(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String candidates = driver.findElement(By.xpath("//*[@id=\"fromToOf\"]/div")).getText();
		System.out.println("Number of candidates is: "+ candidates);
	}
}
