import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.driver.Driver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Login {

    @ContinueOnFailure
    @Step("Log In as user <user> username <username> and password <password>")
    public void giveAnOptionToLogIn(String user,String username,String password) {
        WebDriver webDriver = Driver.webDriver;
        webDriver.findElement(By.id("inputEmail")).sendKeys(username);
        webDriver.findElement(By.id("inputPassword")).sendKeys(password);
        webDriver.findElement(By.id("login")).click();
        String loginText=webDriver.findElement(By.xpath("//*[@id='main-body']/div/div/div[1]/div/h1")).getText().trim();
        assertEquals("Welcome Back, "+user,loginText);
    }

    @Step("Verify login text <text>")
    public void verifyLoginText(String text) {
        WebDriver webDriver = Driver.webDriver;
        String loginText=webDriver.findElement(By.xpath("//*[@id='main-body']/div/div/div[1]/div/h1")).getText().trim();
        assertEquals(text,loginText);
    }


}
