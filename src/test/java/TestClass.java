import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void testMethod() throws InterruptedException{
		System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver", "/Users/swetha/Documents/softwares/automation drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://goshopmatic.com/in/terms.html");
		Thread.sleep(10000);
		
		System.out.println("Test Over");
		driver.quit();
	}

}