package now;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Delete all existing cookies
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		//Open site
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//Cookies testing
		if(driver.manage().getCookies().size()!=0)
		{
			System.out.println("Cookies were loaded");
		}
		else
		{
			System.out.println("No cookies");
		}
		//close site
		driver.close();
	}
}
