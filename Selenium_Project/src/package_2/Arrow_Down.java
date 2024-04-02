package package_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrow_Down {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement search_tf=driver.findElement(By.xpath("(//textarea)[1]"));
		search_tf.sendKeys("India");
		search_tf.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		search_tf.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		search_tf.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		search_tf.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		search_tf.sendKeys(Keys.ENTER);
		
	}

}
