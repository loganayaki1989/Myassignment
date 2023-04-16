package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Duplicate {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
			EdgeDriver use = new EdgeDriver();
			use.manage().window().maximize();
			use.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			use.get("http://leaftaps.com/opentaps/control/login");
			use.findElement(By.xpath("(//ul[@class='sectionTabBar']//a)[2]")).click();
			use.findElement(By.xpath("//a[text()='Request Catalog ']/preceding::a[text()='Find Leads']")).click();
			use.findElement(By.xpath("(//em[@class='x-tab-left']/span)[2]")).click();
			use.findElement(By.xpath("(//div[contains(@class,'x-plain-body')]//input)[13]")).sendKeys("9884653533");
			use.findElement(By.xpath("(//em[@unselectable='on']/button)[6]")).click();
			 WebElement leadId = use.findElement(By.xpath("(//div[contains(@class,'col-partyId')]/a)[1]"));
			 String Leadno = leadId.getText();
			 leadId.click();
			 System.out.println(Leadno);
			use.findElement(By.xpath("(//a[@class='subMenuButton']/following-sibling::a)[3]")).click();
			use.findElement(By.xpath("(//a[text()='Merge Leads']/preceding::a)[33]")).click();
			use.findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(Leadno);
			use.findElement(By.xpath("//button[text()='Find Leads']/parent::em")).click();
			
			String recMsg = use.findElement(By.xpath("//div[text()='No records to display']")).getText();
				if (recMsg.contains("No records to display")){
					System.out.println("Record deleted successfully");
				}else {
					System.out.println("Record is not deleted successfully");
				}
				
			use.close();
			
			
				
		}
	}


