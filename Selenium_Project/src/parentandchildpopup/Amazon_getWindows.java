package parentandchildpopup;
//Assignment-118
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_getWindows {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchtf = driver.findElement(By.id("twotabsearchtextbox"));
		searchtf.sendKeys("shoe");
		searchtf.sendKeys(Keys.ENTER);

		WebElement firstshoe = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		firstshoe.click();

		Set<String> pc = driver.getWindowHandles();// pc->parentchild
		Iterator<String> i1 = pc.iterator();

		String parent = i1.next();
		String child = i1.next();
		driver.switchTo().window(child);
		WebElement add_to_cart = driver.findElement(By.id("add-to-cart-button"));
		add_to_cart.click();
	}

}
