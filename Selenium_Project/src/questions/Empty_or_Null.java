package questions;
//Assignment-122 How to get the link text of all the links present on a web page? 
//Out of all links how many links have link text as null or empty?
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Empty_or_Null {

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
			String message = single_link.getText();
			System.out.println(message);
			message.isEmpty();
			
	}

}
}