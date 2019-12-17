package dec.com;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Listbox3 {
public static void main(String[] args) throws Throwable {
		String expcity="hyderabad";
		boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();	
driver.findElement(By.id("FromTag")).sendKeys("Hyd");
Thread.sleep(7000);
//get collection of item with given keyword
List<WebElement>cities=driver.findElements(By.xpath("html/body/ul[1]/li/a"));
System.out.println(cities.size());
for(int i=0;i<cities.size();i++)
{
	String itemname=cities.get(i).getText();
	Thread.sleep(1000);
	System.out.println(itemname);
	if(expcity.toUpperCase().contains(itemname.toUpperCase()))
	{
	itemexist=true;
	break;
		}
}
if(itemexist)
{
	System.out.println("Item found in textbox::"+expcity);
}
else
{
	System.out.println("Item not found in textbox::"+expcity);
}
Thread.sleep(5000);
//driver.close();	
	}

}
