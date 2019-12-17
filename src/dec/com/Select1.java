package dec.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Select day = new Select(driver.findElement(By.id("day")));
		boolean value = day.isMultiple();
		System.out.println("is day a multiple select?"+"\n"+value);
		day.selectByIndex(12);
		Thread.sleep(5000);
		day.selectByValue("15");
		Thread.sleep(5000);
		day.selectByVisibleText("20");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
