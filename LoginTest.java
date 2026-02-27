package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
 @Test
 public void loginTest() throws Exception{
  new LoginPage(driver).login("Admin","admin123");
  Thread.sleep(3000);
  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
 }
}