package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Assignment2 {
@Test
	public void Assignment(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-Notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		//String windowHandle = driver.getWindowHandle();
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[name() = 'svg'][contains(@class, 'slds-icon slds-icon-text-default slds-icon_xx-small')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[name() = 'svg'][contains(@class, 'slds-icon slds-icon-text-default slds-icon_x-small')]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@title='Select a date for Close Date']/lightning-primitive-icon//*[name() = 'svg'][contains(@class, 'slds-button__icon')]")).click();
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']")).click();
		driver.findElement(By.xpath("//span[text()='20']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(3000);
//		Alert act=driver.switchTo().alert();
//		act.accept();
		driver.findElement(By.xpath("//a[text()='Opportunity Name']")).click();
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys("Salesforce Automation by Venkatesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Stage']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-value='--None--']")).click();
		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}


