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
    private GmailLoginPage page;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("i am in class level setup");
    }

    @Before
    public void setUp() throws Exception {
        page = new GmailLoginPage();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("I am in teardown");
//        DriverFactory.getDriver().quit();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("I am in class level teardown");
    }

    @Test
    public void loadGmail() throws Exception {
        System.out.println("I am in test loadGmail");
        page.login().composeEmail("testemail");
    }
}
