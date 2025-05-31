package AdminOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StyleSelector {
	WebDriver driver=null;
	public StyleSelector(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//i[@class='fa fa-spin fa-gear']")
private WebElement styleselector;

@FindBy(xpath="//span[@class='switchery switchery-default']")
private WebElement fixheader;

public WebElement getFixheader() {
	return fixheader;
}

public WebElement getStyleselector() {
	return styleselector;
}

//@FindBy())
//public WebElement getStyleselector() {
//	return styleselector;
}


	

