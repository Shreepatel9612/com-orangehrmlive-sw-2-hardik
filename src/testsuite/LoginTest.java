package testsuite;
/**
 * Write down the following test in the ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials()

 *  Enter “Admin” username
 *  Enter “admin123 password
 * Click on the ‘Login’ button
 *  Verify the ‘Dashboard’ text is displayed

 * 4. Write down the following test in the
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPage
 * Successfully()
 *  click on the ‘Forgot your password’ link
 *  Verify the text ‘Reset Password’
 *  click on the ‘Cancel’ button
 *  Verify the text ‘Login’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }
    @Test

    public void userSholdLoginSuccessfullyWithValidCredentials() {

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        Assert.assertEquals("No valid Credentials", expectedText, actualText);

    }
    @After
    public void tearDown() {
        closeBrowser();

    }
}
