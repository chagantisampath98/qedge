package dec.com;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		Dimension dim = driver.findElement(By.id("twotabsearchtextbox")).getSize();
		System.out.println("the height is : " +dim.getHeight());
		System.out.println("the width is : " +dim.getWidth());
		driver.quit();

	}

}
