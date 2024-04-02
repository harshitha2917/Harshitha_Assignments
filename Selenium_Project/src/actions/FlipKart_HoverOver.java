package actions;
//Assignment-102
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart_HoverOver {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		//driver.get("https://www.flipkart.com/");
		
		WebElement login=driver.findElement(By.xpath("//span[.='Login']"));
		
		//creating object for action class with parameterised
		Actions a1=new Actions(driver);
		a1.moveToElement(login).perform();
		
		WebElement signup=driver.findElement(By.xpath("//span[.='Sign Up']"));
		signup.click();
		
		WebElement mobileNum=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		mobileNum.sendKeys("9844771595");
		
		driver.findElement(By.xpath("//span[.='CONTINUE']")).click();
		
	}

}