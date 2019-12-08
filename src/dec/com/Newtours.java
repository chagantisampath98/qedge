package dec.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Chanakya");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Dusi");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("08333000625");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("chanakyasrinu01@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("D.No: 3-70/13; LIG-B-50 Mithlapuri Vuda Colony; Madhurawada;");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("sasd");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Visakhapatnam");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Andhra Pradesh");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("530017");
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("INDIA");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Chanakya");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Chanakya");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Chanakya");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		if(driver.getCurrentUrl().contains("success"))
		{
			System.out.println("success!! the message is shown below::");
			String b = driver.findElement(By.xpath("//font[contains(text(),'Thank you for registering.')]")).getText();
		    System.out.println("the message is::-- " +b);
		}
		else
		{
			System.out.println("registration unsuccesfull");
		}
		driver.quit();

	}

}
