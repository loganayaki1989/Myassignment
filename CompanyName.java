package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CompanyName {
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(3000);
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("Democsr");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("Decosubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("leads")).click();
	driver.findElement(By.id("Create Lead")).click();
	driver.findElement(By.id("Companyname")).sendKeys("TestLeaf.org");
	driver.findElement(By.id("Firstname")).sendKeys("Sai");
	driver.findElement(By.id("Lastname")).sendKeys("Sharvesh.R");
	driver.findElement(By.id("Emai-id")).sendKeys("loganayaki.msc@gmail.com");
    driver.findElement(By.id("Phoneno")).sendKeys("8939797330");
	driver.findElement(By.name("submitbutton")).click();
    }
	}
	