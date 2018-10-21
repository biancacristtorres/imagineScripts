package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class BuyPage extends TestBase {
	
	@FindBy(xpath = "//button[@class='mat-raised-button']")
	private List<WebElement> btnComprar;
	
	public BuyPage() {
    	PageFactory.initElements(driver, this);
    }
	
	public FinalPricePage clickPrice() {
    	this.btnComprar.get(0).click();
    	return new FinalPricePage();
    }
}
