package Week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class createContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
      
        driver.findElement(By.id("firstNameField")).sendKeys("Sai");
		driver.findElement(By.id("LalastNameFieldstname")).sendKeys("Sharvesh.R");
		driver.findElement(By.id("Department")).sendKeys("computer science");
		driver.findElement(By.id("state")).sendKeys("Tamilnadu");
        driver.findElement(By.id("Create contacts")).click();
        driver.findElement(By.id("Edit")).click();
        
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateContactForm_generalProfTitle")).sendKeys("i am Automation Tester");
        driver.close();

	}

}


