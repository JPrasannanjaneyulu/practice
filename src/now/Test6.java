package now;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.Google.com");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("abdul kalam");
		Thread.sleep(5000);
		driver.switchTo().activeElement().clear();
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("kalam");
		driver.findElement(By.name("btnK")).click();
		driver.close();
	}
}
