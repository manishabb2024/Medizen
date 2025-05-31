package MedizenSoftAdminLogin;

import org.testng.annotations.Test;

import com.telstra.medizensoftproject.OR.HomePage;
import com.telstra.medizensoftproject.baseclass.BaseClassUtility;

public class ThemeTest extends BaseClassUtility{
@Test
public void theme1()
{
	HomePage hp=new HomePage(driver);	
	hp.getStyleselector().click();
	hp.getTheme1().click();
}
@Test
public void theme2()
{
	HomePage hp=new HomePage(driver);
	hp.getStyleselector().click();
	hp.getTheme2().click();
}
@Test
public void theme3()
{
	HomePage hp=new HomePage(driver);
	hp.getStyleselector().click();
	hp.getTheme3().click();
}

@Test
public void theme4()
{
	HomePage hp=new HomePage(driver);
	hp.getStyleselector().click();
	hp.getTheme4().click();
}

@Test
public void theme5()
{
	HomePage hp=new HomePage(driver);
	hp.getStyleselector().click();
	hp.getTheme5().click();
}
@Test
public void theme6()
{
	HomePage hp=new HomePage(driver);
	hp.getStyleselector().click();
	hp.getTheme6().click();
}
}
