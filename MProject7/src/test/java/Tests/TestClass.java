package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CreateOne;
import Pages.HomePage;
import Pages.LogIn;

public class TestClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.shoppre.com/firstcry-online-shopping");
		
		Thread.sleep(3000);
		HomePage homePage = new HomePage(driver);
		homePage.clickOnLoginButton();
		
		CreateOne createOne = new  CreateOne(driver);
		createOne.clickOncreateOne();
		
		Thread.sleep(3000);
	    LogIn logInPage = new LogIn  (driver);
		logInPage.clickOnSaveButton();
		
		
}
}
