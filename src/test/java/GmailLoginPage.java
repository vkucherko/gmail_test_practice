import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by User on 4/3/2016.
 */
public class GmailLoginPage {
    public static String URL = "http://www.gmail.com";
    public static String email = "junktestmail123@gmail.com";
    public static String password = "junktest";
    public WebDriver driver;

    public static By emailInputBox = By.id("Email");
    public static By signInButton = By.xpath("//input[@value='Sign in']");


    public static By nextButton = By.name("signIn");
    public static By passwordInput = By.id("Passwd");

    public GmailLoginPage(WebDriver driver) {
        this.driver=driver;
        this.driver.get(URL);
        waitForElementToAppear(emailInputBox);
        waitForElementToAppear(nextButton);
    }

    public WebElement getNextButton() {
        return driver.findElement(nextButton);
    }


    public void waitForElementToAppear(By by){
        new WebDriverWait(this.driver, 10).until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement getEmailInputBox() {
        return driver.findElement(emailInputBox);
    }

    public WebElement getSignInButton() {
        return driver.findElement(signInButton);
    }

    public WebElement getPasswordInput() {
        return driver.findElement(passwordInput);
    }

    public GmailLoginPage login(){
        getEmailInputBox().sendKeys(GmailLoginPage.email);
        getNextButton().click();
        waitForElementToAppear(GmailLoginPage.passwordInput);
        getPasswordInput().sendKeys(GmailLoginPage.password);
        waitForElementToAppear(By.xpath("//input[@value='Sign in']"));
        getSignInButton().click();
        return this;
    }

}
