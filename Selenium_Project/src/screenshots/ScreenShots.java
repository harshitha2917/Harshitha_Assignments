package screenshots;
//Assignment-124->How to take screenshot of any program in selenium?
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();

		WebElement choice1 = driver.findElement(By.xpath("(//select[@id='Choice1'])[1]"));
		Select dd1 = new Select(choice1);
		dd1.selectByIndex(1);

		WebElement choice2 = driver.findElement(By.xpath("(//select[@id='Choice2'])[1]"));
		Select dd2 = new Select(choice2);
		dd2.selectByIndex(1);

		WebElement choice3 = driver.findElement(By.xpath("(//select[@id='Choice3'])[1]"));
		Select dd3 = new Select(choice3);
		dd3.selectByIndex(1);

		WebElement choice4 = driver.findElement(By.xpath("(//select[@id='Choice4'])[1]"));
		Select dd4 = new Select(choice4);
		dd1.selectByIndex(1);

		WebElement choice5 = driver.findElement(By.xpath("(//select[@id='Choice5'])[1]"));
		Select dd5 = new Select(choice5);
		dd5.selectByIndex(1);

		WebElement choice6 = driver.findElement(By.xpath("(//select[@id='Choice6'])[1]"));
		Select dd6 = new Select(choice6);
		dd6.selectByIndex(1);

		WebElement choice7 = driver.findElement(By.xpath("(//select[@id='Choice7'])[1]"));
		Select dd7 = new Select(choice7);
		dd7.selectByIndex(1);

		WebElement choice8 = driver.findElement(By.xpath("(//select[@id='Choice8'])[1]"));
		Select dd8 = new Select(choice8);
		dd8.selectByIndex(1);

		WebElement choice9 = driver.findElement(By.xpath("(//select[@id='Choice9'])[1]"));
		Select dd9 = new Select(choice9);
		dd9.selectByIndex(1);

		WebElement choice10 = driver.findElement(By.xpath("(//select[@id='Choice10'])[1]"));
		Select dd10 = new Select(choice10);
		dd10.selectByIndex(1);

		TakesScreenshot tss = driver;// TakesScreenshot is interface
		File source = tss.getScreenshotAs(OutputType.FILE);// getScreenshotAs->abstract method ,OutputType is a
															// interface
		File destination = new File("C:\\hrs\\Selenium training\\Selenium_Project\\Screenshots\\One.png");
		FileHandler.copy(source, destination);

	}

}
