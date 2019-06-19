package now;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.co.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("Link tag:       "+l.size());
		System.out.println("Link tag:       "+l);
		List<WebElement> m=driver.findElements(By.tagName("b"));
		System.out.println("Bold tag:       "+m.size());
		System.out.println("Bold tag:       "+m);
		List<WebElement> n=driver.findElements(By.tagName("tr"));
		System.out.println("Row tag:        "+n.size());
		System.out.println("Row tag:        "+n);
		List<WebElement> o=driver.findElements(By.tagName("td"));
		System.out.println("Column tag:     "+o.size());
		System.out.println("Column tag:     "+o);
		List<WebElement> p=driver.findElements(By.tagName("table"));
		System.out.println("Table tag:      "+p.size());
		System.out.println("Table tag:      "+p);
		List<WebElement> q=driver.findElements(By.tagName("select"));
		System.out.println("Drop-down tag:  "+q.size());
		System.out.println("Drop-down tag:  "+q);
		List<WebElement> r=driver.findElements(By.tagName("button"));
		System.out.println("Button tag:     "+r.size());
		System.out.println("Button tag:     "+r);
		List<WebElement> s=driver.findElements(By.tagName("span"));
		System.out.println("Plain text tag: "+s.size());
		System.out.println("Plain text tag: "+s);
		List<WebElement> t=driver.findElements(By.tagName("input"));
		System.out.println("Input tag:      "+t.size());
		System.out.println("Input tag:      "+t);
		List<WebElement> w=driver.findElements(By.tagName("img"));
		System.out.println("Image tag:      "+w.size());
		System.out.println("Image tag:      "+w);
		List<WebElement> v=driver.findElements(By.tagName("i"));
		System.out.println("Italic tag      "+v.size());
		System.out .println("Italic tag:    "+v);
		List<WebElement> x=driver.findElements(By.tagName("iframe"));
		System.out.println("Frame tag       "+x.size());
		System.out.println("Frame tag:      "+x);
		List<WebElement> y=driver.findElements(By.tagName("div"));
		System.out.println("Ajax controls tag:   "+y.size());
		System.out.println("Ajax controls tag:   "+y);
		List<WebElement> z=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Radio button tag:    "+z.size());
		System.out.println("Radio button tag:    "+z);
		List<WebElement> cb=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Check box tag:       "+cb.size());
		System.out.println("Check box tag:       "+cb);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}
}
