package locators;
//Assignment-86
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//Assignment-86
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Xpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Shoes");
		
		WebElement submit=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		submit.click();
		
		//WebElement first=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		//first.click();
		
	}

}

//input[@id='twotabsearchtextbox']
//input[@id='nav-search-submit-button']
//(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]