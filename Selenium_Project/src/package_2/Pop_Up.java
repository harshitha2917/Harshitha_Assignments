package package_2;
//Assignment-96
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//javaScript Pop-Up
public class Pop_Up {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/hrs/learningHTML1.html");
		
		driver.switchTo().alert().accept();//yes
		//driver.switchTo().alert().dismiss();//no
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//username
		WebElement un = driver.findElement(By.xpath("//input[@id='1']"));
		un.sendKeys("MKT");
		Thread.sleep(2000);
		//hint
		WebElement hint = driver.findElement(By.xpath("//input[@id='2']"));
		hint.sendKeys("stbyMKT");
		Thread.sleep(2000);
		//password
		WebElement pass = driver.findElement(By.xpath("//input[@id='3']"));
		pass.sendKeys("2345");
		Thread.sleep(2000);
		//firstname
		WebElement fn = driver.findElement(By.xpath("//input[@name='fname']"));
		fn.sendKeys("Manish");
		Thread.sleep(2000);
		//lastname
		WebElement ln = driver.findElement(By.xpath("//input[@id='121']"));
		ln.sendKeys("Tiwari");
		Thread.sleep(2000);
		//submit
		WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click();

	}

}
