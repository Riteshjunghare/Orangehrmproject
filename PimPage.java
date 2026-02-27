package pages;
import org.openqa.selenium.*;

public class PimPage {
 WebDriver driver;
 By add = By.xpath("//button[normalize-space()='Add']");
 By fn = By.name("firstName");
 By ln = By.name("lastName");
 By save = By.xpath("//button[@type='submit']");
 public PimPage(WebDriver driver){this.driver=driver;}
 public void addEmployee(String f,String l){
  driver.findElement(add).click();
  driver.findElement(fn).sendKeys(f);
  driver.findElement(ln).sendKeys(l);
  driver.findElement(save).click();
 }
}