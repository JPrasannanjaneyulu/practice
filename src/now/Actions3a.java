package now;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions3a 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement e=driver.findElement(By.id("nav-link-shopall"));
		Actions a=new Actions(driver);
		a.contextClick(e).build().perform();
		Thread.sleep(5000);
		driver.close();
	}
}
