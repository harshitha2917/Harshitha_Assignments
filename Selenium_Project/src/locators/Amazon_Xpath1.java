package locators;
//Assignment-90
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Xpath1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement search_tf = driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']"));
		search_tf.sendKeys("Shoes");

		WebElement search = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]"));
		search.click();

		WebElement first = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		first.click();
	}

}
