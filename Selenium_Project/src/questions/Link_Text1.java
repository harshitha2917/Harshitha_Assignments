package questions;
//Assignment-121 How to count total no. of links on a page using WebDriver?
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int Total_no_of_links = links.size();
		System.out.println(Total_no_of_links);

		for (int i = 0; i < Total_no_of_links; i++) {
			WebElement single_link = links.get(i);
			String message = single_link.getText();
			System.out.println(message);

		}
	}
}