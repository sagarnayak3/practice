package modify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lifeTest {
	
	@Test
	public void lifeTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/search?q=lucky+ali+songs");
		String j=driver.getTitle();
		System.out.println(j);
		
	}

}
