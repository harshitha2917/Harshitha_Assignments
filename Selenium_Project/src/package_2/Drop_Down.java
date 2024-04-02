package package_2;
//Assignment-91
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("(//select)[1]"));
		
		Select s1=new Select(dropdown);//passing argument
		//s1.selectByIndex(10);
		s1.selectByVisibleText("Books");
		//s1.selectByValue("search-alias=stripbooks");
		
		WebElement search_tf=driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("World");
		search_tf.sendKeys(Keys.ENTER);
		
		WebElement first = driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
		first.click();

	}

}
