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
    driver.findElement(By.name("email")).sendKeys(username);
}

public void enterPassword(String password){
    driver.findElement(By.name("password")).sendKeys(password);
}

public void loginClick(){
    driver.findElement(By.xpath("//button[text()='Login']")).click();
}

}
