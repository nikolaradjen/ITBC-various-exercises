package domaci5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Pomocu jave i selenijuma
//1) otici na sajt youtube
//2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up

public class Zadatak_1_0327 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/rara/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.youtube.com/");

		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("rick astley");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']"))
				.click();
		driver.findElement(
				By.xpath("//yt-formatted-string[contains(text(),'Rick Astley - Never Gonna Give You Up (Video)')]"))
				.click();

	}

}
