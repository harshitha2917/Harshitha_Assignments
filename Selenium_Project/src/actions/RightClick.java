package actions;
//Assignment-105 INCOGNITO MODE
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		//syntax for doubleclick
		Actions a1=new Actions(driver);
		a1.contextClick(gmail).perform();//on which element you want to rightclick 
		
		//creating robot class to select the options of the link
		Robot r1=new Robot();//throws AWTException
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
