package package_2;
//Assignment-92
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GTM_Reg {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// username and password
		driver.findElement(By.name("email")).sendKeys("harshithaashwath98@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456t");

		// gender
		WebElement gender = driver.findElement(By.xpath("//input[@id='Female']"));
		gender.click();

		// skills
		WebElement skills = driver.findElement(By.xpath("//select[@name='Skills']"));
		Select sk = new Select(skills);
		sk.selectByVisibleText("Technical Skills");

		// technical skills
		WebElement ts = driver.findElement(By.xpath("//select[@name='technicalskills c-s']"));
		Select s1 = new Select(ts);
		s1.selectByVisibleText("Core Java");

		// country
		WebElement country = driver.findElement(By.xpath("//select[@name='Country']"));
		Select c = new Select(country);
		c.selectByVisibleText("India");

		// Address
		driver.findElement(By.id("Present-Address")).sendKeys("Bengaluru.Karnataka");
		driver.findElement(By.id("Permanent-Address")).sendKeys("Bengaluru,Karnataka");
		driver.findElement(By.id("Pincode")).sendKeys("560053");

		// Relegion
		WebElement relegion = driver.findElement(By.xpath("//select[@name='Relegion']"));
		Select re = new Select(relegion);
		re.selectByIndex(1);

		// relocate
		WebElement relocate = driver.findElement(By.xpath("//input[@id='relocate']"));
		relocate.click();

		// submit
		WebElement submit = driver.findElement(By.xpath("//button[@name='Submit']"));
		submit.click();

	}

}
