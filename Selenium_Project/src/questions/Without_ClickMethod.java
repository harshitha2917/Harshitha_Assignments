package questions;
//Assignment-119 How to perform click on the link without using Click Method?
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_ClickMethod {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		gmail.sendKeys(Keys.ENTER);	

	}

}
