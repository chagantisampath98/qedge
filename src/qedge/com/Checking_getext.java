package qedge.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_getext {

	public static void main(String[] args) {
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.com");
		String exptext = "Gmail";
		String acttext = chrome.findElement(By.partialLinkText("gm")).getText();
		if (acttext.equalsIgnoreCase(exptext))
		{
			System.out.println("yay! its matching!!!!");
		}
		else
		{
			System.out.println("noooo!! its not matching! :(");
		}
		chrome.quit();
	}

}
