package modify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class lifeTest {
	
	@Test
	public void lifeTest() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/search?q=lucky+ali+songs");
		String j=driver.getTitle();
		System.out.println(j);
		
	}
	
	@Test
	public void practiceTest()
	{
		WebDriver driver=null;
		String Url=System.getProperty("url");
		String browser= System.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			System.out.println("Chrome Launched");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			System.out.println("Firefox Launched");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();	
			System.out.println("Edge Launched");
		}
		else
		{
			driver=new ChromeDriver();
			System.out.println("Chrome Launched");
		}
		driver.get(Url);
		String gh=driver.getTitle();
		System.out.println(gh);
		
	}

}
