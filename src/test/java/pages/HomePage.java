package pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[contains(@class,'mat-button-wrapper')]  [contains(text(),'FECHAR')]")
    private WebElement btnFechar;
	
	@FindBy(xpath="//button[@class='mat-icon-button']")
    private WebElement btnMenu;
	
	@FindBy(xpath = "//h1[contains(text(),'Comprar')]")
	private WebElement btnComprar;
	
    public HomePage() {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickFechar() {
    	this.btnFechar.click();
    }
    
    public void clickMenu() {
    	this.btnMenu.click();
    }
    
    public BuyPage clickCompar() {
    	this.btnComprar.click();
    	return new BuyPage();
    }
    
}
