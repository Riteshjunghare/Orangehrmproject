package pages;
import org.openqa.selenium.*;

public class AdminPage {
 WebDriver driver;
 By add = By.xpath("//button[normalize-space()='Add']");
 By emp = By.xpath("//input[@placeholder='Type for hints...']");
 By user = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
 By pass = By.xpath("(//input[@type='password'])[1]");
 By cpass = By.xpath("(//input[@type='password'])[2]");
 By save = By.xpath("//button[@type='submit']");
 public AdminPage(WebDriver driver){this.driver=driver;}
 public void addUser(String e,String u,String p) throws Exception{
  driver.findElement(add).click();
  Thread.sleep(2000);
  driver.findElement(emp).sendKeys(e);
  Thread.sleep(2000);
  driver.findElement(By.xpath("//span[contains(text(),'"+e+"')]")).click();
  driver.findElement(user).sendKeys(u);
  driver.findElement(pass).sendKeys(p);
  driver.findElement(cpass).sendKeys(p);
  driver.findElement(save).click();
 }
}