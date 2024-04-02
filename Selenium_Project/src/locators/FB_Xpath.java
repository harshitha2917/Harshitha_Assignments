package locators;
//Assignment-87
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Xpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("harshithaashwath98mail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("1234");
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
	}

}
//input[@id='email']
//input[@id='pass']
//button[@name='login']
//a[.='Mobiles']