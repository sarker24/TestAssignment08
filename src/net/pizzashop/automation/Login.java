package net.pizzashop.automation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class Login {

	@Test
	void test() {
		//fail("Not yet implemented");
		WebDriver driver = Base.getDriver();
		//driver.get("http://google.com");
		driver.get("http://localhost/PizzaShop");
		WebElement element=driver.findElement(By.id("loginLink"));
		//Click on found element
		element.click();
		WebElement login=driver.findElement(By.className("btn"));
		login.click();
		

		String my_title=driver.getTitle();
		System.out.print("Title is" +my_title);
		String expected_title ="Log in";

		Assert.assertEquals(my_title,expected_title);
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("Murad");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[4]/div/input")).click();
	}

}
