package hu.webler.weblerseleniumtestautomation;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static hu.webler.weblerseleniumtestautomation.util.Waiting.waitForSeconds;

@SpringBootTest
class WeblerSeleniumTestAutomationApplicationTests {

	@Autowired
	private WebDriver webDriver;

	@Autowired
	private WebDriverWait webDriverWait;

	@Test
	void contextLoads() {

		// Set the browser window size
		webDriver.manage().window().maximize();

		webDriver.get("https://csaba79coder.com/");
		webDriverWait.until(ExpectedConditions.titleContains("Csaba79-coder's portfolio"));
		waitForSeconds(6);

		// Wait for the "About Me" link to become visible and clickable.
		WebElement aboutMeLink = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/about-me']")));
		// Click on "About Me" link
		aboutMeLink.click();
		waitForSeconds(6);

		// Close the WebDriver instance
		webDriver.quit();
	}
}
