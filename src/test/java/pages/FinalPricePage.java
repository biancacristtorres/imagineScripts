package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class FinalPricePage extends TestBase {
	
	@FindBy(xpath = "//div[@class='mat-form-field-infix']/input[contains(@id,'mat-input')]")
	private WebElement inputCumpom;

	@FindBy(xpath = "//span[contains(text(),'R$')]")
	private WebElement finalPrice;
	
	public FinalPricePage() {
    	PageFactory.initElements(driver, this);
    }
	
	public void insertCupom(String cumpomValue) {
		this.inputCumpom.clear();
		this.inputCumpom.sendKeys(cumpomValue);
	}
	
	public String getFinalPrice() {
		return this.finalPrice.getText();
	}

}
