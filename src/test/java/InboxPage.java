import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by User on 4/17/2016.
 */
public class InboxPage extends Utils{

    public static By composeButton = By.xpath("//div[text()='COMPOSE']");
    public static By messageBody = By.xpath("//div[@aria-label='Message Body']");
    public static By toInputField = By.xpath("//textarea[@aria-label='To']");
    public static By subjectInputField = By.xpath("//input[@placeholder='Subject']");

    public InboxPage() {
        waitForElementToAppear(composeButton);
    }

    public static WebElement getToInputField() {
        return DriverFactory.getDriver().findElement(toInputField);
    }

    public static WebElement getMessageBody() {
        return DriverFactory.getDriver().findElement(messageBody);
    }

    public WebElement getComposeButton() {
        return DriverFactory.getDriver().findElement(composeButton);
    }

    public WebElement getSubject() {
        return DriverFactory.getDriver().findElement(subjectInputField);
    }

    public InboxPage composeEmail(String emailText){
        getComposeButton().click();
        waitForElementToAppear(messageBody);
        waitForElementToAppear(toInputField);
        getToInputField().sendKeys("junktestmail123@gmail.com");
        getSubject().sendKeys("test");
        getMessageBody().sendKeys(emailText);
        return this;
    }
}
