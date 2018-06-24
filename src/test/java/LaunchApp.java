import com.thoughtworks.gauge.Step;
import utils.driver.Driver;

public class LaunchApp {


    public static String APP_URL = System.getenv("APP_URL");

    @Step("Go to the travel website")
    public void launchTheApplication() {
        Driver.webDriver.get("https://phptravels.org/clientarea.php");
    }


}
