package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ProductListPage extends TestBase{

	//page factory or object repo
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[1]/div[1]/picture[1]/img[1]")
	WebElement black_hoodie;
	
	@FindBy(xpath="//h1[normalize-space()='H And M Men Black Relaxed Fit Hoodie']")
	WebElement search_result;
	
//	@FindBy(xpath="")
//	WebElement ;
	
	public ProductListPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	
	public ProductDetailsPage
}
