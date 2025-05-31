package MedizenSoftAdminLogin;

import org.testng.annotations.Test;

import com.telstra.medizensoftproject.OR.AppointmentHistory;
import com.telstra.medizensoftproject.baseclass.BaseClassUtility;

public class AppointmentHistoryTest extends BaseClassUtility {
@Test
public void Appointmenthistory() throws Throwable
{
	AppointmentHistory ah=new AppointmentHistory(driver);
	System.out.println("hello");
	Thread.sleep(2000);
	ah.getAppointmenthistory().click();	
}
}
