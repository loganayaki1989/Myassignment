package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Assignment1 {
@Test
	public  void Assignment() throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-Notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		//String windowHandle = driver.getWindowHandle();
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[name() = 'svg'][contains(@class, 'slds-icon slds-icon-text-default slds-icon_xx-small')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[name() = 'svg'][contains(@class, 'slds-icon slds-icon-text-default slds-icon_x-small')]")).click();
		
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys("Salesforce Automation by Venkatesh");
		Thread.sleep(3000);
		
		
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@title='Select a date for Close Date']/lightning-primitive-icon//*[name() = 'svg'][contains(@class, 'slds-button__icon')]")).click();
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']")).click();
		driver.findElement(By.xpath("//span[text()='19']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@data-value='--None--']")).click();
		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
		
		WebElement findElement=driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button_neutral')]"));
		findElement.click();
		Thread.sleep(2000);
		
		String OptTitle = driver.findElement(By.xpath("(//span[@class='slds-text-body--regular slds-text-color--default slds-truncate slds-show'])[4]")).getAttribute("title");
		System.out.println(OptTitle);
		String OptName="Salesforce Automation by Venkatesh";
		System.out.println(OptName);
		if(OptName.equals(OptTitle))
		{
			System.out.println("Oppurtunity Name is Verified Successfully and it was presented");
		}
		else
		{
			System.out.println("Oppurtunity Name is Verified Successfully and it was not presented");

		}
		Thread.sleep(2000);
		driver.close();
	}



		
		
		
		
		
	

}

