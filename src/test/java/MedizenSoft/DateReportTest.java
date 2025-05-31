package MedizenSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.telstra.medizensoftproject.OR.Betweendatesreports;
import com.telstra.medizensoftproject.OR.DashboardPOM;

public class DateReportTest {
	   
@Test
public void Report()
{
	       

	        
	           
	        	WebDriver driver=null;
				Betweendatesreports cal=new Betweendatesreports(driver);
	        	cal.getFromdate().clear();	           
	            cal.getFromdate().sendKeys("12-03-2025");

	           
	            
	            cal.getTodate().clear();
	            cal.getTodate().sendKeys("19-03-2025");

	                      
	            cal.getSubmit().click();

	            
//	            WebElement reportSection = driver.findElement(By.id("reportTable")); // Replace with actual locator
//	            if (reportSection.isDisplayed()) {
//	                System.out.println("Test Passed: Report generated successfully.");
//	            } else {
//	                System.out.println("Test Failed: Report not displayed.");
//	            }

	       
	       
	    }
	}


