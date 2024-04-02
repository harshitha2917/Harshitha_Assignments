package cssselector;
//Assignment-110
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//5.ATTRIBUTENAME AND ATTRIBUTE VALUE syntax-> [attribute_name='attribute_value']
public class AttributeSelector {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.cssSelector("[name='q']"));
		ele.sendKeys("India");
		ele.sendKeys(Keys.ENTER);
	}

}
