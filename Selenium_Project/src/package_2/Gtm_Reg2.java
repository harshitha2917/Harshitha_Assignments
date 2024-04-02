package package_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gtm_Reg2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// firstname and lastname
		driver.findElement(By.name("firstName")).sendKeys("Harshitha");
		driver.findElement(By.name("lastName")).sendKeys("B A");
		
		//Email
		driver.findElement(By.id("email")).sendKeys("harshithaashwath98@gmail.com");
		
		//phone number
		driver.findElement(By.id("phone")).sendKeys("9844771234");
		
		//gender
		WebElement gender = driver.findElement(By.xpath("//select[@id='gender']"));
		Select g = new Select(gender);
		g.selectByVisibleText("Female");
		
		//state
		WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
		Select s = new Select(state);
		s.selectByVisibleText("Karnataka");
		
		//aadhaar number
		driver.findElement(By.id("aadhaar")).sendKeys("234344771234");
		
		//pancard
		driver.findElement(By.id("pan")).sendKeys("ASDFG6788H");
		
		//checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='terms']"));
		checkbox.click();
		
		//Register
		WebElement register = driver.findElement(By.xpath("//button[@name='Submit']"));
		register.click();

		
		



	}

}
