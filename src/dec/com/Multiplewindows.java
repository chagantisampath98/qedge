package dec.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) throws Throwable {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(3000);
	String parentid = driver.getWindowHandle();
	System.out.println("my current parent id is: "+parentid);
	driver.findElement(By.cssSelector("#terms-link")).click();
	Set<String>allwind=driver.getWindowHandles();
	for(String each:allwind)
	{
		System.out.println(each);
		if(!parentid.equals(each))
		{
			driver.switchTo().window(each);
			driver.findElement(By.linkText("Facebook Products")).click();
			Thread.sleep(3000);
			driver.switchTo().window(parentid);
			driver.findElement(By.name("firstname")).sendKeys("heya");
			Thread.sleep(3000);
			driver.findElement(By.name("lastname")).sendKeys("this is");
			Thread.sleep(3000);
			driver.findElement(By.name("reg_email__")).sendKeys("Testing!");
			Thread.sleep(3000);
		}
		
	}
driver.quit();
	}

}
