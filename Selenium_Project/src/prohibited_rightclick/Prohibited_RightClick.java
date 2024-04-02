package prohibited_rightclick;
//Assignment-114
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prohibited_RightClick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement login_link = driver.findElement(By.xpath("(//a[@class='login_button'] )[1]"));
		Thread.sleep(2000);
		login_link.click();

		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("harshithaashwath98gmail.com");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456t");
		Thread.sleep(1000);
		WebElement captcha = driver.findElement(By.name("loginCaptchaValue"));
		captcha.sendKeys("1234567");

		WebElement login = driver.findElement(By.xpath("//input[@id='Button2']"));
		login.click();

		String title = driver.getTitle();
		System.out.println(title);

	}

}
