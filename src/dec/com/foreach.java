package dec.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class foreach {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search.com");
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("the number of links :"+links.size());
		for(WebElement each:links)
		{
			String linktext = each.getText();
			String linkurl = each.getAttribute("href");
			System.out.println(linktext+"\n"+linkurl);
		}
driver.quit();
	}

}
