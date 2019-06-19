package now;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Launch way2sms site
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com");
		Thread.sleep(5000);
		//Maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Get size browser window
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		System.out.println(w+" "+h);
		Thread.sleep(5000);
		//Change size of browser window
		Dimension d=new Dimension(500, 100);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		//Get position of browser window
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x+" "+y);
		Thread.sleep(5000);
		//Change position of browser window
		Point p=new Point(100, 100);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		//Close site
		driver.close();
	}
}
