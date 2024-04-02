package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoe");
		Thread.sleep(2000);
		//Auto-Suggestion
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));//GrandP Tagname/P TN/Child TN 
		int count=auto.size();//gives number of auto-suggestion and this line is applicable for only list of webelements
		System.out.println(count);
		Thread.sleep(4000);
		//auto.get(count-10).click();
		auto.get(count-7).click();
		

		
	}

}
