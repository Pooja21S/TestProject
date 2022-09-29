package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath = "(//a [@id = 'btn_login'])[2] ")
	private WebElement logIn;
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginButton ()
	{
		logIn.click();
	}
}
