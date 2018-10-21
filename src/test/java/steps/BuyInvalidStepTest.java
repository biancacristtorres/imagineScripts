package steps;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.BuyPage;
import pages.FinalPricePage;
import pages.HomePage;
import util.TestBase;

public class BuyInvalidStepTest extends TestBase {	
	

	HomePage homePage;
	BuyPage buyPage;
	FinalPricePage finalPricePage;
	String price = "R$ 49.50";
	
	@Before
	public void init() throws Throwable {
		TestBase.initialization();
	}
	
	@After
	public void closerChrome() {
		TestBase.close();
	}
	
	@Test
	public void buyCreditEnem() {
		homePage = new HomePage();
		buyPage = new BuyPage();
		try {
			//homePage.clickFechar();
			homePage.clickMenu();
			homePage.clickCompar();
			buyPage.clickPrice();
			finalPricePage = new FinalPricePage();
			finalPricePage.insertCupom("enem100");
			Thread.sleep(2000);
			assertTrue(price.equals(finalPricePage.getFinalPrice()));
			
		} catch (Exception error) {
			error.getMessage();
		}
	}
}
