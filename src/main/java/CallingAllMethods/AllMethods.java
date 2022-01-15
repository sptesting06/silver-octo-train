package CallingAllMethods;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AllMethods {
WebDriver driver;
@Test	
public void practiceall() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.objectspy.space/");
	
		//SELECT FROM DROPDOWN
		
		WebElement continent = driver.findElement(By.xpath("//select[@id='continents']"));
		Select drop = new Select(continent);
		drop.selectByVisibleText("Australia");
		
		//FIND ALL LINKS ON WEBPAGE

		
		
		List<WebElement> containfind = driver.findElements(By.xpath("//h5[contains(text(),'you')]"));
		Iterator<WebElement> itr = containfind.iterator();
		while (itr.hasNext()) {
			System.out.println("This"+itr.next().getText());
			System.out.println("hi");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Link totals "+links.size());
		

		
		}

}

	
}
