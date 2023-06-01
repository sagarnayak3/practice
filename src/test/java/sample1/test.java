package sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement>rank=driver.findElements(By.xpath("//tbody/tr/td[1][text()>6]"));
		List<WebElement>countries=driver.findElements(By.xpath("//tbody/tr/td[1][text()>6]/following-sibling::td[1]/span[2]"));
		for (int i=0;i<rank.size();i++)
		{
			String r=rank.get(i).getText();
			String J=countries.get(i).getText();
			System.out.println(r+" "+J);
			
		}
		driver.close();
}
}
