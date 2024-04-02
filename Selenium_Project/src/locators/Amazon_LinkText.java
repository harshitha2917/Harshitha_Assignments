package locators;
//Assignment-83
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_LinkText {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//LinkText Locator
		driver.findElement(By.linkText("Mobiles")).click();
	}

}
