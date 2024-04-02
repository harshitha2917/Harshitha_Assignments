package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement postman=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
			
		Actions a1=new Actions(driver);
		a1.dragAndDrop(postman, drop).perform();
		Thread.sleep(4000);
		
		//Actions a1=new Actions(driver);
		a1.dragAndDrop(drop, postman).perform();
		Thread.sleep(4000);
	}

}