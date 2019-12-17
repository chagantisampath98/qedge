package dec.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Checking_Text {
public static void main(String[] args) throws Throwable   {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.id("gsr")).click();
	}
}