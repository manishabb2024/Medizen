package AdminOR;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Doctor {
	WebDriver driver=null;
	public Doctor(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath="//span[text()=' Doctors ']")
private WebElement doctorclick;

@FindBy(xpath="//span[text()=' Doctor Specialization ']") 
private WebElement doctorspecclick;

public WebElement getDoctorclick() {
	return doctorclick;
}

public WebElement getDoctorspecclick() {
	return doctorspecclick;
}

@FindBy(className="form-control")
private WebElement doctorspecsearch;

@FindBy(xpath="//span[text()=' Manage Doctors ']")
private WebElement Managedoctorclick;

@FindBy(xpath="//a[@tooltip='Edit']")
private WebElement ActionEdit;

@FindBy(className="form-control")
private WebElement specEdit;

@FindBy(className="form-control")
private WebElement selectspec;

@FindBy(name="docname")
private WebElement docname;

@FindBy(name="clinicaddress")
private WebElement clinicaddress;

@FindBy(name="docfees")
private WebElement consfees;

@FindBy(name="doccontact")
private WebElement doccontact;

@FindBy(id="docemail")
private WebElement docemail;

@FindBy(name="npass")
private WebElement newpassword;

@FindBy(name="cfpass")
private WebElement confirmpass;

public WebElement getSelectspec() {
	return selectspec;
}

public WebElement getDocname() {
	return docname;
}

public WebElement getClinicaddress() {
	return clinicaddress;
}

public WebElement getConsfees() {
	return consfees;
}

public WebElement getDoccontact() {
	return doccontact;
}

public WebElement getDocemail() {
	return docemail;
}

public WebElement getNewpassword() {
	return newpassword;
}

public WebElement getConfirmpass() {
	return confirmpass;
}

public WebElement getDoctorspecsearch() {
	return doctorspecsearch;
}

public WebElement getManagedoctorclick() {
	return Managedoctorclick;
}

public WebElement getActionEdit() {
	return ActionEdit;
}

public WebElement getSpecEdit() {
	return specEdit;
}

@FindBy(name="submit")
private WebElement submit;

@FindBy(xpath="//span[text()=' Add Doctor']")
private WebElement Adddoctor;


public WebElement getAdddoctor() {
	return Adddoctor;
}

public WebElement getDoctorspec() {
	return doctorspecsearch;
}

public WebElement getSubmit() {
	return submit;
}

}
