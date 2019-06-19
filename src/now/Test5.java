package now;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://en.wikipedia.org/wiki/Main_Page");
		//Thread.sleep(5000);
		//String x=driver.findElement(By.id("mp-topbanner")).getAttribute("mp-topbanner");
		//System.out.println(x);
		//driver.get("https://www.facebook.com/");
		//Thread.sleep(5000);
		//String x=driver.findElement(By.name("websubmit")).getCssValue("font-family");
		//System.out.print(x);
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		Thread.sleep(5000);
		String x=driver.findElement(By.id("mp-tfa")).getText();
		System.out.print(x);
		Thread.sleep(5000);
		driver.close();
	}
}
