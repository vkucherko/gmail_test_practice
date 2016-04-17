import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

/**
 * Created by User on 4/3/2016.
 */
public class GmailTest {
    private WebDriver driver;
    private GmailLoginPage page;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("i am in class level setup");
    }

    @Before
    public void setUp() throws Exception {
        driver= DriverFactory.getDriver();
        page = new GmailLoginPage(driver);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("I am in teardown");
//        driver.quit();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("I am in class level teardown");
    }

    @Test
    public void loadGmail() throws Exception {
        System.out.println("I am in test loadGmail");
        page.login();
//        driver.get(URL);
//        WebElement emailInputBox = driver.findElement(By.id("Email"));
//        emailInputBox.sendKeys(email);
//        driver.findElement(By.name("signIn")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("Passwd")).sendKeys(password);
//        driver.findElement(By.id("signIn")).click();
    }
}
