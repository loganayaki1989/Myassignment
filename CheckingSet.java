package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.id("login")).click();
	    driver.findElement(By.className("Decosubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("leads")).click();
		driver.findElement(By.id("Create Lead")).click();
		driver.findElement(By.id("Companyname")).sendKeys("TestLeaf.org");
		driver.findElement(By.id("Firstname")).sendKeys("Sai");
		driver.findElement(By.id("Lastname")).sendKeys("Sharvesh.R");
		WebElement Source=driver.findElement(By.id("leads from _Sourceid"));
		Select optins=new Select(Source);
		optins.selectByIndex(3);
		WebElement Automobile=driver.findElement(By.id("Marketing Campaign"));
		Select optins1=new Select(Automobile);
        optins1.selectByVisibleText("Automobile");
        WebElement Corporation=driver.findElement(By.id("OwnershipEnumid"));
		Select optins2=new Select(Corporation);
		optins2.selectByValue("OWN_CORP");
	    driver.findElement(By.name("submitbutton")).click();
        driver.close();

	}

}
