package cssselector;
//Assignment-108
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//3. TAGNAME syntax-> tagname#id
public class TagNameSelector {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.cssSelector("textarea#APjFqb"));
		ele.sendKeys("India");
		ele.sendKeys(Keys.ENTER);

	}

}
