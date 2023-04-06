package Week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class NewCreateContact {

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
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("ninju");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("kutty");
		driver.findElement(By.id("Department")).sendKeys("computer science");
		driver.findElement(By.name("description")).sendKeys("Automation project");
		Select state = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		driver.findElement(By.name("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("description")).sendKeys("Automation project");
        driver.findElement(By.name("updateContactForm_importantNote")).sendKeys("project is okay");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

        

		

		

		

		

		

		
		
		

		

		
		

	}

}
