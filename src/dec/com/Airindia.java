package dec.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airindia {

	public static void main(String[] args) throws Throwable {
		String expectedcity = "bangkok";
	    boolean items = false;
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   driver.get("http://www.airindia.in/");
	   Thread.sleep(3000);
	   driver.findElement(By.linkText("Book Flight")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.name("from")).sendKeys("ban");
	    List<WebElement>cities=driver.findElements(By.xpath("html/body/ul/li/a"));
	    System.out.println(cities.size());
	    for(int i=0;i<cities.size();i++)
	    {
	    	String citiesnames = cities.get(i).getText();
	    	Thread.sleep(1000);
	    	System.out.println(citiesnames);
	    	
	    	if(expectedcity.toUpperCase().contains(citiesnames.toUpperCase()))
	    	{
	    		items =true;
	    		break;
	    	}
	    }
	    if(items)
	    {
	    	System.out.println("the city is :"+expectedcity);
	    }
	    else 
	    {
	    	System.out.println("the city is not found ");
	    }
	    driver.quit();
	    Thread.sleep(3000);

	}

}
