package locators;
//Assignment-85
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search_tf=driver.findElement(By.xpath("(//textarea)[1]"));
		search_tf.sendKeys("India");
	}

}
