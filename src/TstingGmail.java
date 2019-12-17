import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TstingGmail {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Terms")).click();
		Thread.sleep(3000);
		ArrayList<String>google=new ArrayList<String>(driver.getWindowHandles());
		
		String pg1 = driver.switchTo().window(google.get(3)).getTitle();
		Thread.sleep(5000);
		System.out.println("omg! 1st page is: "+pg1);
		driver.findElement(By.cssSelector("body.mobile.promoted-search-body:nth-child(2) div.hcfe:nth-child(2) header:nth-child(1) div.promoted-search__container:nth-child(7) form.promoted-search__form > input.promoted-search__input:nth-child(1)")).sendKeys("im just testing mannnn! realxx!!");
		Thread.sleep(5000);
		driver.close();
		
        String pg2 = driver.switchTo().window(google.get(2)).getTitle();
    	Thread.sleep(5000);
		System.out.println("omg! 2nd page is: "+pg2);
		driver.findElement(By.cssSelector("body.tQj5Y.ghyPEc.IqBfM.ecJEib.EWZcud.qvoRwc.EIlDfe.cjGgHb.d8Etdd.LcUz9d:nth-child(2) c-wiz.SSPGKf:nth-child(6) div.T4LgNb:nth-child(1) div.kFwPee c-wiz:nth-child(1) div.nma0Wb:nth-child(1) ul.Z4Hs8c li.tTz8Oe:nth-child(1) > a.A8xHzb")).click();
		Thread.sleep(5000);
		driver.close();
		
        String pg3 = driver.switchTo().window(google.get(1)).getTitle();
    	Thread.sleep(5000);
		System.out.println("omg! 3rd page is: "+pg3);
		driver.findElement(By.cssSelector("body.tQj5Y.ghyPEc.IqBfM.ecJEib.EWZcud.qvoRwc.LcUz9d.EIlDfe.cjGgHb.d8Etdd:nth-child(2) c-wiz.SSPGKf:nth-child(6) div.T4LgNb:nth-child(1) div.kFwPee c-wiz:nth-child(1) div.nma0Wb:nth-child(1) ul.Z4Hs8c li.tTz8Oe:nth-child(4) > a.A8xHzb")).click();
		Thread.sleep(5000);
		driver.close();
		
        driver.switchTo().window(google.get(0));
    	Thread.sleep(3000);
        String myhome=driver.getTitle();
        System.out.println("finally!! :"+myhome);
        driver.close();
        
	}

}
