package cssselector;
//Assignment-111
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//6.TAGNAME,ATTRIBUTE NAME AND ATTRIBUTE VALUE syntax-> TN[AN='AV']
public class TagnameAtrributeNameandValue {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.cssSelector("textarea[name='q']"));
		ele.sendKeys("India");
		ele.sendKeys(Keys.ENTER);
	}

}
