package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/hrs/learningHTML1.html");
		driver.manage().window().maximize();	
		
		WebElement ele=driver.findElement(By.tagName("a"));
		Thread.sleep(2000);
		ele.click();
		
	}//[name='q'] 
	//textarea.gLFyf[name='q']

}
