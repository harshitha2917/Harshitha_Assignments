package webelement_methods;
//Assignment-97
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
		//search
		WebElement search_Btn=driver.findElement(By.name("btnK"));
	
		/*if(search_Btn.isDisplayed()==false && search_Btn.isEnabled()==true) {
			search_Btn.click();
		}*/
		if(search_Btn.isDisplayed()==false || search_Btn.isEnabled()==true) {
			search_Btn.click();
		}
	}

}
