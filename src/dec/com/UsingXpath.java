package dec.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {

	public static void main(String[] args) {
		ChromeDriver chro = new ChromeDriver();
		chro.navigate().to("http://orangehrm.qedgetech.com");
		chro.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Adminn");
		chro.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")).sendKeys("sdgaee");
		chro.findElement(By.cssSelector("#btnLogin")).click();
		if(chro.getCurrentUrl().contains("dash"))
		{
			System.out.println("login succesfull");
		}
		else
		{
			System.out.println("login unsuccesfull");
			String message = chro.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.err.println("the eroor message is ::"+message);
		}

	}

}
