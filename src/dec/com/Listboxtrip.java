package dec.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listboxtrip {

	public static void main(String[] args) throws Throwable {
		
		    String expectedcity = "bangalore";
		    boolean items = false;
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		   driver.get("https://www.cleartrip.com");
		   Thread.sleep(3000);
		   driver.findElement(By.id("FromTag")).sendKeys("Ban");
		    Thread.sleep(6000);
		    List<WebElement>cities=driver.findElements(By.xpath("html/body/ul[1]/li/a"));
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
		    if(items=true)
		    {
		    	System.out.println("the city is :"+expectedcity);
		    }
		    else 
		    {
		    	System.out.println("the city is not found :"+expectedcity);
		    }
		    Thread.sleep(3000);
		    driver.quit();

	}

}
