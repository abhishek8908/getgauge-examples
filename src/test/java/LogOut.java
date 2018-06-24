import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.driver.Driver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogOut {

    @Step("Log out from portal")
    public void giveAnOptionToLogIn() {
        WebDriver webDriver = Driver.webDriver;
        webDriver.findElement(By.xpath("//*[@id='header']/div/ul/li[3]/a")).click();
        String logOutMsg= webDriver.findElement(By.xpath("//*[@id='main-body']/div/div/div[1]/div/div[2]")).getText().trim();
        assertEquals("You have been successfully logged out.", logOutMsg);
    }





}
