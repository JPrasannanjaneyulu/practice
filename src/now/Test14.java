package now;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 
{
	public static void main(String[] args) 
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Maximize browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Open google site
		driver.get("https://www.Google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//navigate to gmail site
		driver.navigate().to("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//back to google
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//forward to gmail
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//reload gmail
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//close site
		driver.close();
	}
}
