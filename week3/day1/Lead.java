package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Lead {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Kingvj");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vijay");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source=new Select(element);
		source.selectByVisibleText("Employee");
		WebElement element2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));	
		Select source1=new Select(element2);
		source1.selectByValue("9001");
		WebElement element3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select source2=new Select(element3);
		source2.selectByIndex(5);
		WebElement element4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select source3=new Select(element4);
		source3.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();

}
}

