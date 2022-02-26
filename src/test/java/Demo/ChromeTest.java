package Demo;

import org.openqa.selenium.WebDriver;

public class ChromeTest {

	public static void main(String... ar)
	{
		WebDriver driver = ChromeExecution.initialize();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println("The title is "+driver.getTitle());
		driver.quit();
	}
}
