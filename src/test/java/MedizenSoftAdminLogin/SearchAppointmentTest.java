package MedizenSoftAdminLogin;
import org.testng.annotations.Test;

import com.telstra.medizensoftproject.OR.DashboardPOM;
import com.telstra.medizensoftproject.OR.PatientsearchTest;
import com.telstra.medizensoftproject.baseclass.BaseClassUtility;

public class SearchAppointmentTest extends BaseClassUtility{
@Test(groups="Integration")
public void SearchPatientTest()
{
	System.out.println("Test");			
	DashboardPOM db=new DashboardPOM(driver);	
	db.getPatientsearch().click();
	PatientsearchTest ps=new PatientsearchTest(driver);
	ps.getSearchdata().sendKeys("Ravi");
	ps.getSubmit().click();
}
}
