package now;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(5000);
		ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wins.get(1));
		driver.findElement(By.name("emailid")).sendKeys("prasanna@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(wins.get(0));
		Thread.sleep(5000);
		driver.close();
	}
}
