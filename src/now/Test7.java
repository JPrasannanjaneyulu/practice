package now;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://framesites.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='nav']/div/div[2]/a/button")).click();
		Thread.sleep(5000);
		String win=driver.getWindowHandle();
		System.out.println(win);
		ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
		for(int i=0; i<wins.size(); i++)
		{
			System.out.println(wins.get(i));
		}
		Thread.sleep(5000);
		ArrayList<String> wi=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wi.get(1));
		driver.close();
		driver.switchTo().window(wi.get(0));
		Thread.sleep(5000);
		driver.close();
	}
}
