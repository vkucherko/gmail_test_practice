import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by User on 4/3/2016.
 */
public class GmailLoginPage extends Utils{
    public static String URL = "http://www.gmail.com";
    public static String email = "junktestmail123@gmail.com";
    public static String password = "junktest";

    public static By emailInputBox = By.id("Email");
    public static By signInButton = By.xpath("//input[@value='Sign in']");


    public static By nextButton = By.name("signIn");
    public static By passwordInput = By.id("Passwd");

    public GmailLoginPage() {
        DriverFactory.getDriver().get(URL);
        waitForElementToAppear(emailInputBox);
        waitForElementToAppear(nextButton);
    }

    public WebElement getNextButton() {
        return DriverFactory.getDriver().findElement(nextButton);
    }

    public WebElement getEmailInputBox() {
        return DriverFactory.getDriver().findElement(emailInputBox);
    }

    public WebElement getSignInButton() {
        return DriverFactory.getDriver().findElement(signInButton);
    }

    public WebElement getPasswordInput() {
        return DriverFactory.getDriver().findElement(passwordInput);
    }

    public InboxPage login(){
        getEmailInputBox().sendKeys(GmailLoginPage.email);
        getNextButton().click();
        waitForElementToAppear(GmailLoginPage.passwordInput);
        getPasswordInput().sendKeys(GmailLoginPage.password);
        waitForElementToAppear(By.xpath("//input[@value='Sign in']"));
        getSignInButton().click();
        return new InboxPage();
    }

}
