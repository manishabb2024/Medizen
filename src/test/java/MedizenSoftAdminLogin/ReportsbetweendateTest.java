package MedizenSoftAdminLogin;

import org.testng.annotations.Test;

import com.telstra.medizensoftproject.OR.Reports;
import com.telstra.medizensoftproject.baseclass.BaseClassUtility;

public class ReportsbetweendateTest extends BaseClassUtility {
@Test
public void getreportbetweendate() throws Throwable
{
	Reports rp=new Reports(driver); 
	rp.getReports().click();
	System.out.println("test");
	rp.getBetweendate().click();
	rp.getFromdate().clear();
	rp.getFromdate().sendKeys("01-03-2025");
	rp.getTodate().clear();
	rp.getTodate().sendKeys("07-03-2025");
	rp.getSubmit().click();
	Thread.sleep(3000);
}
}
