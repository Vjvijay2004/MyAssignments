package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreatAccount {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("chennai");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("100000050500000");
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select industry=new Select(element);
		industry.selectByVisibleText("Computer Software");
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		Select ownership=new Select(element2);
		ownership.selectByVisibleText("S-Corporation");
		WebElement element3 = driver.findElement(By.id("dataSourceId"));
		Select source=new Select(element3);
		source.selectByValue("LEAD_EMPLOYEE");
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		Select marketobj=new Select(element4);
		marketobj.selectByIndex(6);
		WebElement element5 = driver.findElement(By.xpath("(//select[@class='selectBox'])[2]"));
		Select state=new Select(element5);
		state.selectByValue("TX");
		driver.findElement(By.xpath("//input[@onclick='submitFormWithSingleClick(this)']")).click();
	}

}
