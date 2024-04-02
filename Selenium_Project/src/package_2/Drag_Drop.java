package package_2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

}
