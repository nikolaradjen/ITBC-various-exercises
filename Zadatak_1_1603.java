package domaci4;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

//Napraviti testNG klasu koja ce testirati da li se zeljena 
//web stranica otvorila. Proveru izvrsiti na osnovu Title-a.

public class Zadatak_1_1603 {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver", "/Users/rara/Downloads/chromedriver");

		WebDriver wd = new ChromeDriver();

		wd.get("https://www.facebook.com");

		// stavio sam SoftAssert da bi onda mogao da uradi i zatvaranje browsera.
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(wd.getTitle(), "Facebook – log in or sign up");

		wd.close();

	}
}
