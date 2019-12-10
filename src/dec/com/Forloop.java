package dec.com;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forloop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("the number of links are: "+links.size());
		for(int i=0;i<links.size();i++)
		{
			String strlinks = links.get(i).getText();
			String strurl = links.get(i).getAttribute("href");
			System.out.println(strlinks+"\n"+strurl);
		}
	driver.close();

	}

}
