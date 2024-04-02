package locators;
//Assignment-84
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// partialLinkText
		driver.findElement(By.partialLinkText("Customer")).click();
	}

}
