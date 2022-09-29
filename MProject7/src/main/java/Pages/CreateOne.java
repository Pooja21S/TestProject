package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateOne {
	
	private WebDriverWait wait; 
	private WebDriver driver;
	
	
	
	@FindBy (xpath = "//a[@class = 'text-info']")
	private WebElement createOne;
	
	
	
	
	public CreateOne  (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOncreateOne (){
		
		wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.visibilityOf(createOne));
		createOne.click();
		} 
	
		
		
		
		
	}

