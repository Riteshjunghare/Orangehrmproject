package pages;
import org.openqa.selenium.*;

public class LoginPage {
 WebDriver driver;
 By u = By.name("username");
 By p = By.name("password");
 By b = By.xpath("//button[@type='submit']");
 public LoginPage(WebDriver driver){this.driver=driver;}
 public void login(String user,String pass){
  driver.findElement(u).sendKeys(user);
  driver.findElement(p).sendKeys(pass);
  driver.findElement(b).click();
 }
}