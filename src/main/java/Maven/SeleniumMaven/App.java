package Maven.SeleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class App 
{
	
    public static void main( String[] args ) throws InterruptedException
    {
    WebDriver driver =null;
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.get("https://www.google.com");
     Thread.sleep(5000);
     driver.close();
    }
}
