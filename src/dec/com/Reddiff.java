package dec.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiff {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		WebElement checkbox =driver.findElement(By.name("remember"));
		boolean value = checkbox.isSelected();
		if(!value)
		{
			checkbox.click();
			System.out.println("if");
		}
		else {
			checkbox.click();
			System.out.println("else");
		}
		

	}

}
