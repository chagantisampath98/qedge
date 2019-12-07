package qedge.com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) throws Throwable {
		WebDriver fire = new FirefoxDriver();
		fire.get("https://facebook.com");
		
		String exptitle = "https";
		String strtitle = fire.getCurrentUrl();
		if(strtitle.contains(exptitle))
		{
			System.out.println("url is secure :)");
		}
		else
		{
			System.out.println("url is not secure :(");
		}
		fire.close();
	}

}
