package dec.com;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#terms-link")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#privacy-link")).click();
		Thread.sleep(3000);
		ArrayList<String>windows=new ArrayList<String>(driver.getWindowHandles());
		String pagettl1=driver.switchTo().window(windows.get(1)).getTitle();
		Thread.sleep(3000);
		System.out.println("the 1st title is : "+pagettl1);
		
		
		driver.close();
		String pagettl2=driver.switchTo().window(windows.get(2)).getTitle();
		System.out.println("the 2nd title is : "+pagettl2);
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(windows.get(0));
		Thread.sleep(3000);
		
		driver.findElement(By.name("lastname")).sendKeys("this is");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("Testing!");
		Thread.sleep(3000);
		driver.close();

	}

}
