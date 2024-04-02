package package_2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_HoverOver {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}

}
