package cssselector;
//Assignment-112
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//7.TAGNAME,CLASSNAME,ATTRIBUTE NAME AND ATTRIBUTE VALUE syntax-> TN.CN[AN='AV']
public class Css_7{
	public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	WebElement ele=driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
	ele.sendKeys("India");
	ele.sendKeys(Keys.ENTER);

}
}