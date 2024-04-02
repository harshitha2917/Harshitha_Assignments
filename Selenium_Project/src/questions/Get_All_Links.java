package questions;
//Assignment-123 How to Get all the links on web page? 
//Out of all the links i need the actual links of all 438 links
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_Links {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int Total_no_of_links = links.size();
		System.out.println(Total_no_of_links);

		for (int i = 0; i < Total_no_of_links; i++)
		{
			WebElement single_link = links.get(i);
			String message = single_link.getAttribute("href");//return type of link is String
			System.out.println(message);
		}
	}

}
