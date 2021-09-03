package selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MrCajic\\workspaceJobProject\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.rs");
		
		
		
	}
	@Test
	private static void testTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.rs");
		String title = driver.getTitle();
		String expectedTitle = "Google";
		
	}

	

	

}
