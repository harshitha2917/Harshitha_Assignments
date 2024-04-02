package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath1 {

public static void main(String[] args) throws InterruptedException
{
ChromeDriver driver = new ChromeDriver();
driver.get("file:///C:/hrs/learningHTML1.html");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a)[1]")).click();

}

}
