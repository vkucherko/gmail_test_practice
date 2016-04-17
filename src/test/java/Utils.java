import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by User on 4/17/2016.
 */
public class Utils {

    public void waitForElementToAppear(By by){
        new WebDriverWait(DriverFactory.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(by));
    }
}
