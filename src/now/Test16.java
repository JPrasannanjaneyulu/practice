package now;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> l=driver.findElements(By.tagName("input"));
		int c=0;
		for(int i=0; i<l.size(); i++)
		{
			String x=l.get(i).getAttribute("type");
			if(x.equals("radio"))
			{
				c=c+1;
				System.out.println("Radio button tag:    "+x);
			}
		}
		driver.close();
	}
}
