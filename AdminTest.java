package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.*;

public class AdminTest extends BaseTest {
 @Test
 public void addUserTest() throws Exception{
  new LoginPage(driver).login("Admin","admin123");
  new DashboardPage(driver).goToAdmin();
  new AdminPage(driver).addUser("Paul Collings","testuser01","Test@123");
 }
}