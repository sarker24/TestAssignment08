# TestAssignment08
## Create a web User Interface to Marios Pizzabar And Relevant Automated System Tests.
### Environment Setup:
1.	Create new java project name PizzaShop_Selenium_Test in Ecliepese Ide.
2.	Download selenium-java-3.141.59 and add in add my project external JARS.

<img width="576" alt="1" src="https://user-images.githubusercontent.com/31739314/57185348-d276e580-6ec9-11e9-9529-db48eb2253fe.png">
3.	Download and place chromedriver in C drive.
4.	Create new package name net.pizzashop.automation.
5.	Under net.pizzashop.automation create new class name Base.
6.	For setup driver write the following code

public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.deive","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
When I set driver findElement(By.id("loginLink")) and click its shows logIn page.


<img width="576" alt="2" src="https://user-images.githubusercontent.com/31739314/57185349-d4d93f80-6ec9-11e9-93c2-2a46957559de.png">
