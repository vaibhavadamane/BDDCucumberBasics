package Pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = "//div[@id='nav-xshop']//*[@data-csa-c-slot-id='nav_cs_4']")
	private WebElement todaysDeals;
	
	@FindBy(xpath = "//*[@Class='nav-cart-icon nav-sprite']")
	private WebElement cartIcon;
	
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	private WebElement signHoverButton;
	
	@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner']")
	private WebElement signInButton;
	
	@FindBy(xpath = "//*[@id='ap_email']")
	private WebElement emailFeild;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueid;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement passwordFeild;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement finalSignInButton;
	
	//Constructor
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	    wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	}
	
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		
		return title;
	}
	
	public boolean verifyCart()
	{
		boolean isdisplay = cartIcon.isDisplayed();
				
	    return isdisplay;
	}
	
	public void gotoSignPage()
	{
		Actions a = new Actions(driver);
		
		a.moveToElement(signHoverButton).perform();
		
		signInButton.click();
	}
	
	public void enterUsername(String uname)
	{
		emailFeild.sendKeys(uname);
		
		continueid.click();
	}
	
	public void finalSignIN(String pwd)
	{
		passwordFeild.sendKeys(pwd);
		
        finalSignInButton.click();
		
	}
	
	public void enterTodaysDeallink()
	{
//		wait.until(ExpectedConditions.visibilityOf(todaysDeals));
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		js.executeAsyncScript("arguments[0].click();", todaysDeals);
		
		todaysDeals.click();
		
	}
	
}
