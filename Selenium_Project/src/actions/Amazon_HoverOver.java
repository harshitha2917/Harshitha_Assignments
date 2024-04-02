package actions;
//Assignment-101
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HoverOver {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement account_link=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		
		//creating object for action class with parameterised
		Actions a1=new Actions(driver);
		a1.moveToElement(account_link).perform();
		
		WebElement signin=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		signin.click();
	}

}