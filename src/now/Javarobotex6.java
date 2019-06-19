package now;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Javarobotex6 
{
	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		String x=System.getProperty("os.name");
		System.out.println(x);
		//Launch notepad
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		//Send data to clipboard and then paste in notepad
		StringSelection s1=new StringSelection("mother and father");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		Robot r=new Robot();
		if(System.getProperty("os.name").contains("Windows"))
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
		}
		else if(System.getProperty("os.name").contains("Mac"))
		{
			r.keyPress(KeyEvent.VK_META);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_META);
			Thread.sleep(5000);
		}
		else if(System.getProperty("os.name").contains("Linux"))
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
		}
		else
		{
			System.out.println("Unknown platform");
			System.exit(0);
		}
		//Choose save option
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		//Save file
		StringSelection s2=new StringSelection("D:\\batch229\\myself1.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2, null);
		if(System.getProperty("os.name").contains("Windows"))
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
		}
		else if(System.getProperty("os.name").contains("Mac"))
		{
			r.keyPress(KeyEvent.VK_META);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_META);
			Thread.sleep(5000);
		}
		else if(System.getProperty("os.name").contains("Linux"))
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
		}
		else
		{
			System.out.println("Unknown platform");
			System.exit(0);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//Close window
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
	}
}
