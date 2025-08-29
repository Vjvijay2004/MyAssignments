package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class SecondLargestPrice {
	
		public static void main(String[] args) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("guest");
			
			ChromeDriver driver=new ChromeDriver(options);
			driver.get("https://www.saucedemo.com/v1");
			driver.manage().window().maximize();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			WebElement element = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
			String text = element.getText();
			System.out.println("Name of the first product "+text);
			WebElement element2 = driver.findElement(By.xpath("//div[text()='29.99']"));
			String text2 = element2.getText();
			System.out.println("price of the first product "+text2);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			driver.get("https://www.saucedemo.com/v1/cart.html");
			WebElement element3= driver.findElement(By.xpath("//div[text()='29.99']"));
			String text3 = element3.getText();
			System.out.println("verify the price is matched "+text3);

	

			
}
	
}
