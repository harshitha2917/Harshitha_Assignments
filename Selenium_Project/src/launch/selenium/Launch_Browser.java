package launch.selenium;
//Assignment-75
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser//Concrete class
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
