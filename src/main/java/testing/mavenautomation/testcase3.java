package testing.mavenautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testcase3 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harsh\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.eazydiner.com/");
		driver.findElement(By.id("srchbar")).click();
		driver.findElement(By.id("search_city")).click();
		driver.findElement(By.xpath("//a[@data-city='Mumbai']")).click();


	}

}
