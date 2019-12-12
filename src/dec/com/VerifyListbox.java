package dec.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyListbox {

	public static void main(String[] args) {
		String expected = "baby";
		boolean items = false;
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		Select element = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>lists=element.getOptions();
		System.out.println("the number of links are:"+lists.size());
		for(int i=0;i<lists.size();i++)
		{
			String itemlists= lists.get(i).getText();
			System.out.println(itemlists);
			if(expected.equalsIgnoreCase(itemlists))
			{
		      items = true;
		      break;
			}
		}
		if(items)
		{
			System.out.println("item that is required exists:"+expected);
		}
		else {
			System.out.println("item that is required doesnot exists! ::"+expected);
		}
	}

}
