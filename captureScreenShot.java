import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class captureScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sharayu\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		System.out.println("Good Morning");
		System.out.println("Have a Nice day..!");

		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File (".\\ScreenShot\\"+timestamp()+".jpeg"));

		driver.get("https://www.facebook.com");
		File srcfile1 = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile1, new File (".\\ScreenShot\\"+timestamp()+".jpeg"));
	}
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
