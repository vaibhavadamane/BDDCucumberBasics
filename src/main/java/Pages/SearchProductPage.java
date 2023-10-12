package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage 
{

	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	
	@FindBy(xpath = "//*[@class='nav-search-submit-text nav-sprite nav-progressive-attribute']")
	private WebElement searchButton;
	
	
	public SearchProductPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void search(String text)
	{
		searchBox.sendKeys(text);
	}
	
	public void serchButton()
	{
		searchButton.click();
	}
}
