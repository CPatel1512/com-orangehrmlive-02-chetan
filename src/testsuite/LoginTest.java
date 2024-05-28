package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        setBaseUrl();
    }


    @Test

    public void userSholdLoginSuccessfullyWithValidCredentials() {

//Enter “Admin” username
// Enter “admin123 password
//Click on ‘LOGIN’ button
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        //Verify the ‘Dashboard’ text is display
        WebElement dashboardHeader = driver.findElement(By.linkText("Dashboard"));
                String headerText = dashboardHeader.getText();
        Assert.assertEquals("The dashbord is not as expected","Dashboard",headerText);

    }
    @After
    public void tearDown(){
        driver.close();
    }

}
