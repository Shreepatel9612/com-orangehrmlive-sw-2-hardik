package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).click();
        String actualText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[2]")).getText();
        Assert.assertEquals(actualText, "Reset Password", "Verification failed: Reset Password");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[1]")).click();
        String actualTextAfterCancel = driver.findElement(By.id("logInPanelHeading")).getText();
        Assert.assertEquals(actualTextAfterCancel, "LOGIN", "Verification failed");


    }
    @After
    public void tearDown() {
        closeBrowser();
    }


}