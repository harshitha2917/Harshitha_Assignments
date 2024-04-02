package webelement_methods;
//Assignment-98
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedOrNotSelected {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();

		// selected_notselected
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='vehicle2']"));

		boolean answer = checkbox1.isSelected();
		System.out.println(answer);
		if (answer == false) {
			checkbox1.click();
		}

	}

}
