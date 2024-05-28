package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {


    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        setBaseUrl();
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//div[@class = 'orangehrm-login-forgot']")).click();
        //Verify the text ‘Reset Password
        WebElement resetPassword = driver.findElement(By.xpath("//h6[text() = 'Reset Password']"));
        String resetPasswordText = resetPassword.getText();
        Assert.assertEquals("The reset password page is not as expected","Reset Password",resetPasswordText);

    }
}
