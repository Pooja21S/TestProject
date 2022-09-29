package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {
	private WebDriverWait wait; 
	private WebDriver driver;
	private Select s;
	private Select s1;
	
	@FindBy (xpath = "// input[@ng-model = '$ctrl.user.first_name'] ")
	private WebElement firstName;
	
	@FindBy (xpath = "(//input [@required = 'required'])[2]")
	private WebElement lastName ;
	
	@FindBy (xpath = "//input [@type = 'email']")
	private WebElement  email;
	
	@FindBy (xpath = "//input [@type = 'password']")
	private WebElement  password ;
	
	@FindBy (xpath = "//button [@class = 'btn btn-lg btn-primary btn-block']")
	private WebElement  signUp;
	
	@FindBy (xpath = "//select[@ng-model= '$ctrl.data.country_id']")
	private WebElement  pincode ;
	
	@FindBy (xpath = "//input[@id= 'tel']")
	private WebElement mobNo  ;
	
	@FindBy (xpath = "//select[@name= 'survey']")
	private WebElement  howDidYouGetKnowAboutUs ;
	
	@FindBy (xpath = "//button[@type= 'submit']")
	private WebElement  save ;
	
	public LogIn   (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void sendfirstname() {
		wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.visibilityOf(firstName));
		firstName.sendKeys("Pooja");}
		
		public void sendlastname () {
		
		lastName.sendKeys("Sabarad");}
		
		public void sendEmail () {
		
		email.sendKeys("poojasabarad21@gmail.com");
		}
		
		public void sendPassword () {
		password.sendKeys("P21@pooja");}
		
		public void clickOnSignup () {
		signUp.click();}
		
		public void selectOincode () {
		    s = new Select(pincode);
			
			s.selectByVisibleText("+91(India)");}
			
			public  void sendMobileNo () {
			mobNo.sendKeys("8329436006");}
			
			public void slectHowDidYouGet () {
			s1 = new Select(howDidYouGetKnowAboutUs);
			s1.selectByVisibleText("Facebook");}
			
			public void clickOnSaveButton() {
			save.click();}
}
