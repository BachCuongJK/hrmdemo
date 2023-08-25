package pages;

import org.openqa.selenium.By;

public class LoginPage {
    public By userName = By.name("username");
    public By pass =By.name("password");
    public By loginBtn =By.xpath("//button[@type='submit']");
    public By forgotpass =By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    public By alertLoginFail =By.xpath("//div[@role=\"alert\"]");
}
