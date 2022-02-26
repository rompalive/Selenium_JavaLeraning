package Demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ChromeTest {

	@Test
	public void Chrometest()
	{
		WebDriver driver = ChromeExecution.initialize();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println("The title is "+driver.getTitle());
		driver.quit();
	}
}
