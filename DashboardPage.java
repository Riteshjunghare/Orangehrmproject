package pages;
import org.openqa.selenium.*;

public class DashboardPage {
 WebDriver driver;
 By admin = By.xpath("//span[text()='Admin']");
 By pim = By.xpath("//span[text()='PIM']");
 public DashboardPage(WebDriver driver){this.driver=driver;}
 public void goToAdmin(){driver.findElement(admin).click();}
 public void goToPIM(){driver.findElement(pim).click();}
}