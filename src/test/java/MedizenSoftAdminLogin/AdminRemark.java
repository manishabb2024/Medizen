package MedizenSoftAdminLogin;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.telstra.medizensoftproject.OR.ContactQueries;
import com.telstra.medizensoftproject.baseclass.BaseClassUtility;

public class AdminRemark extends BaseClassUtility {
@Test
public void AdminRemarkTest() throws Throwable
{
	ContactQueries cq=new ContactQueries(driver);
	System.out.println("hello");
	Thread.sleep(2000);
	cq.getContactquery().click();
	cq.getUnreadquery().click();
	Thread.sleep(2000);
	cq.getAction().click();
	cq.getAddRemark().sendKeys("ok we will inform you");
	cq.getUpdate().click();
	// Switch to the alert
	Alert alert = driver.switchTo().alert();	
	System.out.println("Alert message: " + alert.getText());	
	alert.accept();

	Thread.sleep(3000);
}
}
