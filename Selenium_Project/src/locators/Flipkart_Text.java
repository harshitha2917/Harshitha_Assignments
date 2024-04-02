package locators;
//Assignment-89
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Text {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement text = driver.findElement(By.xpath("(//span[.='Mobiles'])[1]"));
		text.click();

	}

}
