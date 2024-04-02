package autosuggestion;
//Assignment-99
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//search textfield
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Shoe");
		Thread.sleep(2000);
		//Auto-Suggestion
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='_3NorZ0 _3jeYYh']//ul//li"));//GrandP Tagname/P TN/Child TN 
		int count=auto.size();//gives number of auto-suggestion and this line is applicable for only list of webelements
		System.out.println(count);
		Thread.sleep(2000);
		//auto.get(count-10).click();
		auto.get(count-7).click();
		
	}

}
