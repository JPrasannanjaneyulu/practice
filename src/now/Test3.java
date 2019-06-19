package now;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.Google.com");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("facebook");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Youtube");
		Thread.sleep(5000);
		driver.findElement(By.name("btnK")).click();
		driver.close();
	}
}
