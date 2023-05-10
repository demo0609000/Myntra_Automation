package Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import Base.TestBase;

public class HomePage extends TestBase{

	//page factory or object repository
	@FindBy(xpath="//title[contains(text(),'Online Shopping for Women, Men, Kids Fashion & Lif')]")
	WebElement homepage_title;
	
	@FindBy(xpath="//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")
	WebElement myntra_logo;
	
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")
	WebElement search_button;
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement search_bar;
	
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']")
	WebElement profile;
	
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconWishlist sprites-headerWishlist']")
	WebElement wishlist;
	
	// initialise the object repo in the method by creating the constructor
	
	public HomePage() {
		//initialise elements in page factory (this==current class objects)
		PageFactory.initElements(driver, this);
		
	}
	
	//actions
	
	public String ValidateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean ValidateMyntraLogo() {
		return myntra_logo.isDisplayed();
	}
	
		//product search name
	public ProductListPage search(String search) {
		search_bar.sendKeys(search);
		//click search
		search_button.click();
		return new ProductListPage();
	}
	

	
}
