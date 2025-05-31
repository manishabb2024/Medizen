package MedizenSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginTest 
{
@Test
public void loginTest()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://49.249.28.218:8081/AppServer/Hospital_Management_System");
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.END).perform();;
	WebElement adminLogin = driver.findElement(By.cssSelector("a[href='hms/admin']"));
	adminLogin.click();
}
}
