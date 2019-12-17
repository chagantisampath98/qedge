package dec.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Count {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=f63f985a58df027376f0c76aa09f7c48");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.name("country")));
		List<WebElement>lists=listbox.getOptions();
		System.out.println("the number of lists are: " +lists.size());
		for(int i=0;i<lists.size();i++)
		{
			String links1 = lists.get(i).getText();
			System.out.println(links1);
			Thread.sleep(1000);
		}
driver.close();
	}

}
