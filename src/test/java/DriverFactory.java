import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by User on 4/3/2016.
 */
public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chrome/win32/chromedriver.exe");
        if(driver==null){
            driver=new ChromeDriver();
            return driver;
        }else{
            return driver;
        }
    }

    public static void quit(){
        driver.quit();
        driver=null;
    }
}
