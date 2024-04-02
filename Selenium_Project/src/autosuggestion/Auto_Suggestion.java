package autosuggestion;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("Bangalore");
		Thread.sleep(2000);
		//Auto-Suggestion
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));//GrandP Tagname/P TN/Child TN 
		int count=auto.size();//gives number of auto-suggestion
		System.out.println(count);//output is 10
		Thread.sleep(4000);
		//auto.get(3).click();
		//auto.get(count-7).click();//3th index 10-7=3
		auto.get(count-10).click();//0th index 10-10=0
	}

}