import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by User on 4/3/2016.
 */
public class DriverFactory {
    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chrome/win32/chromedriver.exe");
        return new ChromeDriver();
    }
}
