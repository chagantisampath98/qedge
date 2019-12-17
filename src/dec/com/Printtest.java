package dec.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printtest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		System.out.println("success!! the message is shown below::");
		String a = driver.findElement(By.xpath("//b[contains(text(),'Dear Chanakya Dusi,')]")).getText();
		String b = driver.findElement(By.xpath("//font[contains(text(),'Thank you for registering.')]")).getText();
	    String c = driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).getText();
	    String d = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[1]/p[2]/font[1]/a[2]")).getText();
		String e = driver.findElement(By.xpath("td:nth-child(1) p:nth-child(3) a:nth-child(1) font:nth-child(1) > b:nth-child(1)")).getText();
	    System.out.println(""+a +b +c +d +e);

	}

}
