package net.pizzashop.automation;

import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) {
		WebDriver driver=Base.getDriver();
	driver.get("http://localhost/PizzaShop");
		//driver.get("http://google.com");
	}

}
