package questions;
//Assignment-120 How to count the no. of options in a dropdown? clue->getOptions();
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop_Down1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("(//select)[1]"));
		
		Select s1=new Select(dropdown);//passing argument
		List<WebElement> ls=s1.getOptions();
		int count=ls.size();
		System.out.println(count);
	}

}
