package MedizenSoftAdminLogin;

import org.testng.annotations.Test;

import com.telstra.medizensoftproject.OR.HomePage;

import com.telstra.medizensoftproject.baseclass.BaseClassUtility;



public class StyleSelectorTest extends BaseClassUtility{
@Test
public void selectFixHeader() throws InterruptedException
{
	HomePage hp=new HomePage(driver);
	hp.getStyleselector().click();
	Thread.sleep(2000);
	hp.getFixheader().click();	
	Thread.sleep(2000);
	hp.getStyleselector().click();
}
@Test
public void selectfixSider() throws Throwable
{
	HomePage hp=new HomePage(driver);
	hp.getStyleselector().click();
	Thread.sleep(2000);
	hp.getFixsidebar().click();
	Thread.sleep(2000);
	hp.getStyleselector().click();
}
@Test
public void selectclosedSidebar() throws Throwable
{
	HomePage hp=new HomePage(driver);
	hp.getStyleselector().click();
	Thread.sleep(2000);
	hp.getClosesidebar().click();
	Thread.sleep(2000);
	hp.getStyleselector().click();
}
@Test
public void selectFixedFooter() throws Throwable
{
	HomePage hp=new HomePage(driver);
	hp.getStyleselector().click();
	Thread.sleep(2000);
	hp.getFixedfooter().click();
	Thread.sleep(2000);
	hp.getStyleselector().click();
}

}
