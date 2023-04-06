package Week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.id("Firstname")).sendKeys("Sai");
		driver.findElement(By.id("Lastname")).sendKeys("Sharvesh.R");
		driver.findElement(By.id("mobileneo")).sendKeys("123456789");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement Female=driver.findElement(By.id("leads from _Femaleid"));
		Select optins=new Select(Female);
		optins.selectByIndex(3);
		WebElement ratio=driver.findElement(By.id("Marketing Campaign"));
		Select optins1=new Select(ratio);
        optins1.selectByVisibleText("ratio");
        WebElement Female1=driver.findElement(By.id("OwnershipEnumid"));
		Select optins2=new Select(Female1);
		optins2.selectByValue("OWN_CORP");
	    driver.findElement(By.name("submitbutton")).click();
        driver.close();
	}
	

}
