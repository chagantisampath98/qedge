package dec.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.cssSelector("#login")).click();
		Thread.sleep(5000);
		String text =driver.switchTo().alert().getText();
		System.out.println("the message is:" +"\n"+text);
		driver.switchTo().alert().accept();
		driver.close();

	}

}
