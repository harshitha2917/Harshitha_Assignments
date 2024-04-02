package locators;
//Assignment-81
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg_Page {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("harshithaashwath98mail.com");
		driver.findElement(By.name("password")).sendKeys("123456t");
		
		//driver.findElement(by.id("Female")).c
		driver.findElement(By.id("Present-Address")).sendKeys("Bengaluru.Karnataka");
		driver.findElement(By.id("Permanent-Address")).sendKeys("Bengaluru,Karnataka");
		driver.findElement(By.id("Pincode")).sendKeys("560053");
	}

}
