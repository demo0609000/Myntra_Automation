package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import Base.TestBase;
import Pages.HomePage;
import Pages.ProductListPage;

public class TestHomePage extends TestBase {
	HomePage homePage;
	ProductListPage productListPage;
	
	public TestHomePage() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage= new HomePage();
	}
	
	@Test(priority=1)
	public void HomePageTitleTest() {
		String title = homePage.ValidateHomePageTitle();
		Assert.assertEquals(title,"Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
	}
	
	@Test(priority=2)
	public void MyntraLogoTest() {
		boolean flag = homePage.ValidateMyntraLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void SearchTest() {
	productListPage = homePage.search(prop.getProperty("search"));
	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	
}
