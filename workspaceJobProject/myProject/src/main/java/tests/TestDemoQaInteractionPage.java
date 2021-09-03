package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objects.DemoQaInteractionPage;
import objects.DemoQaMainPage;
import objects.GooglePage;
import objects.GoogleSearchDemoQaPage;
import resource.DemoQaInteractionPageConstatns;
import resource.DemoQaMainPageConstants;

public class TestDemoQaInteractionPage {
private static WebDriver driver;
	
	@BeforeAll
	static	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MrCajic\\workspaceJobProject\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(DemoQaMainPageConstants.URL_DEMO_QA);
		}
	Actions act = new Actions(driver);
	//It is tested to see if we are on the right page
	@Test
	public void testIfWeOnDemoQaInteractionPage() {
		driver.manage().window().maximize();
		DemoQaMainPage.clickOnInteractionBtn(driver);
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = DemoQaInteractionPageConstatns.URL_INTERACTION_PAGE;
		assertEquals(actualUrl, expectedUrl);
		
		System.out.println("testIfWeOnDemoQaInteractionPage() is pass");
	}
	//In this test we will test whether the text from the box is equal to the expected text and if so we will take pictures
	@Test
	public void testTextFromDrophere() throws IOException {
		String dropped = "Dropped!";
		driver.navigate().to(DemoQaInteractionPageConstatns.URL_DROPPABLE);
		WebElement src = driver.findElement(By.xpath(DemoQaInteractionPageConstatns.DRAG_ME_XPATH));
		WebElement dest = driver.findElement(By.xpath(DemoQaInteractionPageConstatns.DROP_HERE_XPATH));
		act.clickAndHold(src).moveToElement(dest).release().build().perform();
		String text = driver.findElement(By.xpath("//*[@id=\"droppable\"]")).getText();
		System.out.println(text);
		assertEquals(text, dropped);
		
		if(text.equalsIgnoreCase(dropped)) {
		File fileScreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fileScreen, new File("C:\\Users\\MrCajic\\workspaceJobProject\\myProject\\screenshot\\screen.png"));
		System.out.println("testTextFromDrophere() is pass");
	}	
		}
	//In this test, we will test whether the text from the tooltip matches the expected text
	@Test
	public void testHoveredText() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		DemoQaInteractionPage.clickOnWidgets(driver);
		DemoQaInteractionPage.goToTooltips(driver);
		By bt1 = By.xpath("//[@aria-describedby = \"buttonToolTip\"]");
		By btn2 = By.id("toolTipButton");
		By textpopap = By.xpath("//[@class = \"tooltip-inner\"]");
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(btn2);
		action.moveToElement(we).moveToElement(driver.findElement(btn2)).click().build().perform();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(bt1)));
		System.out.print(driver.findElement(textpopap).getText().toString());
		String text = "You hovered over the Button";
		assertEquals(driver.findElement(textpopap).getText().toString(), text);
		
	}
}
