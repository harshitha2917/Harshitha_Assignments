package synchronization;
//Assignment-116
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement text_field=driver.findElement(By.name("q"));
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		//w1.until(ExpectedConditions.titleIs("Google"));//application is fully loaded
		//w1.until(ExpectedConditions.titleIs("Manish"));//TimeOutException
		w1.until(ExpectedConditions.titleContains("Goo"));
		//w1.until(ExpectedConditions.alertIsPresent());
		
		text_field.sendKeys("India");
		text_field.sendKeys(Keys.ENTER);

	}

}
