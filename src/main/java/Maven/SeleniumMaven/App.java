package Maven.SeleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
	@Test
	public void testGoogle() throws InterruptedException
    {
    WebDriver driver =null;
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.get("https://www.google.com");
     driver.manage().window().maximize();
     Thread.sleep(5000);
     driver.close();
    }
}
