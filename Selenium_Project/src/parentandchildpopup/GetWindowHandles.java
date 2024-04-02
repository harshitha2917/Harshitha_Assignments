package parentandchildpopup;
//Assignment-117b
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		
		WebElement google_link=driver.findElement(By.xpath("//span[.='Google']"));
		google_link.click();
		Set<String> g1=driver.getWindowHandles();//set doesn't follow indexing
		System.out.println(g1);
		Iterator<String> g2=g1.iterator();
		String s1=g2.next();//1st time->parent ID
		String s2=g2.next();//2nd time->child ID
		driver.switchTo().window(s2);//close child window
		Thread.sleep(2000);
		driver.close();
	}

}
