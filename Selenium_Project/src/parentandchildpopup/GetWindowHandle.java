package parentandchildpopup;
//Assignment-117a
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement text_field=driver.findElement(By.name("q"));
		text_field.sendKeys("India");
		text_field.sendKeys(Keys.ENTER);
		String s1=driver.getWindowHandle();//gives parent browserId whicj contains alphanumeric values so, RT is String
		System.out.println("This is the result of GWH "+s1);
		Set <String> s2=driver.getWindowHandles();//to get child browser Id
		System.out.println("This is the result of GWHs "+s2);
	}

}
