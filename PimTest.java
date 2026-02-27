package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.*;

public class PimTest extends BaseTest {
 @Test
 public void addEmployeeTest(){
  new LoginPage(driver).login("Admin","admin123");
  new DashboardPage(driver).goToPIM();
  new PimPage(driver).addEmployee("Rahul","Sharma");
 }
}