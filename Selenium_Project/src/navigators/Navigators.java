package navigators;
//Assignment-100
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigators {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.co.in"); //other way to open url
		
		Thread.sleep(2000);
		driver.navigate().back();//it'll go again to empty browser
		
		Thread.sleep(2000);
		driver.navigate().forward();//google page
		
		Thread.sleep(2000);
		driver.navigate().refresh();//refresh the page

	}

}