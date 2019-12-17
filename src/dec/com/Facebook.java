package dec.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		List<WebElement>listtype=driver.findElements(By.xpath("//div/div/span/span/select"));
		
		for(int i=0;i<listtype.size();i++)
		{
			String x=listtype.get(i).getAttribute("aria-label");
			if(x.equalsIgnoreCase("day"))
			{
			String dayslist = listtype.get(i).getText();
			System.out.println("the list boxes and its elements are: "+dayslist);
			
			}
		}
		for(int i=0;i<listtype.size();i++)
			{
				String y=listtype.get(i).getAttribute("aria-label");
				if(y.equalsIgnoreCase("month"))
				{
				String monthlist = listtype.get(i).getText();
				System.out.println("the list boxes and its elements are: "+monthlist);
				
				}
		}
		for(int i=0;i<listtype.size();i++)
		{
			String y=listtype.get(i).getAttribute("aria-label");
			if(y.equalsIgnoreCase("year"))
			{
			String yearlist = listtype.get(i).getText();
			System.out.println("the list boxes and its elements are: "+yearlist);
			
			}
	}
		

driver.close();
	}

}
