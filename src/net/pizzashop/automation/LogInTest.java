package net.pizzashop.automation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class LogInTest {

	
	public static void main(String[] args) {
		WebDriver driver = Base.getDriver();
		//driver.get("www.google.com");
		driver.get("http://localhost/PizzaShop");
		// Find sign In element  
		WebElement element=driver.findElement(By.id("loginLink"));
		//Click on found element
		element.click();
		WebElement login=driver.findElement(By.className("btn"));
		login.click();
		
		String my_title=driver.getTitle();
		System.out.print("Title is" +my_title);
		String expected_title ="Login";

		Assert.assertEquals(my_title,expected_title);
		System.out.print("Executed");
		
	}

	

}
