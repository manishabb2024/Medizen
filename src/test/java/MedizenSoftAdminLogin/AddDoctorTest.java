package MedizenSoftAdminLogin;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import com.telstra.medizensoftproject.baseclass.BaseClassUtility;
import com.telstra.medizensoftproject.webdriverutility.WebDriverUtility;

import AdminOR.Doctor;

public class AddDoctorTest extends BaseClassUtility {

@Test
public void AddDoctor() throws InterruptedException
{
	Doctor ds=new Doctor(driver);
	Thread.sleep(2000);
	ds.getDoctorclick().click();
	Thread.sleep(2000);
	WebElement docspec=ds.getDoctorspec();
	WebDriverUtility wu=new WebDriverUtility();
	ds.getAdddoctor().click();
	wu.getSelectByValue(docspec, "ENT");
	ds.getDocname().sendKeys("Deepak");
	ds.getClinicaddress().sendKeys("Chembur");
	ds.getConsfees().sendKeys("1500");
	ds.getDoccontact().sendKeys("9769714830");
	ds.getDocemail().sendKeys("deepak@gmail.com");
	ds.getNewpassword().sendKeys("deepak");
	ds.getConfirmpass().sendKeys("deepak");
	wu.scrollBy(driver);
	Thread.sleep(2000);
	ds.getSubmit().click();
	Thread.sleep(2000);
}
@Test
public void AddDoctorSpecialization() throws Throwable
{
	Doctor ds=new Doctor(driver);
	ds.getDoctorclick().click();
	Thread.sleep(2000);
	ds.getDoctorspecclick().click();
	Thread.sleep(2000);
	ds.getDoctorspec().sendKeys("ortho");
	Thread.sleep(2000);
	ds.getSubmit().click();	
}
@Test
public void ManageDoctorTest()
{
	WebDriverUtility wu=new WebDriverUtility();
	Doctor ds=new Doctor(driver);
	ds.getManagedoctorclick().click();
	ds.getActionEdit().click();
	WebElement specEdit=ds.getSpecEdit();
	wu.getSelectByValue(specEdit, "Pathology");
	ds.getSubmit().click();
}
}
