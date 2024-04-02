package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchJsam
{
public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
driver.get("file:///C:/hrs/learningHTML1.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("IamMKT");
}
}
