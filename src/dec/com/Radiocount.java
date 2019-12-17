package dec.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiocount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		int nor=0;
		List<WebElement>radio=driver.findElements(By.tagName("input"));
		System.out.println("the number of input types are:: "+radio.size());
		for(int i=0;i<radio.size();i++)
		{
			String x = radio.get(i).getAttribute("type");
			if(x.equalsIgnoreCase("radio"))
			{
				nor+=1;
			}
			}
System.out.println("the number of radio buttons are?:"+nor);
driver.close();
	}

}
