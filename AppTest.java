package Maven_selenium.Selenium_Java_Project;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void LaunchChrome()
    {
    	System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium_Java_Project\\Binary\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com");
    	driver.manage().window().maximize();
    	String ExpectedTitle = "Google";
    	String ActualTitle = driver.getTitle();
    	assertEquals(ExpectedTitle,ActualTitle);
    	driver.close();
    }
}
