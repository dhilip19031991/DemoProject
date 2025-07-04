package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;

public LoginPage(WebDriver driver) {
        this.driver = driver;
}
public void openLoginPage(String url) {
    driver.get(url);
}

public void enterUsername(String username){
    driver.findElement(By.id("user-name")).sendKeys(username);
}

public void enterPassword(String password){
    driver.findElement(By.id("password")).sendKeys(password);
}

public void loginClick(){
    driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
}

}
