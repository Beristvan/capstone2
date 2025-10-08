import Pages.LoginPage;
import Pages.MainPage;
import org.example.testDataReader;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class capstoneTest {

    private static WebDriver driver;

    @BeforeAll
    static void setup(){
        System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    @Order(1)
    public void loginToTSIforce() throws InterruptedException {

        driver.get("https://tsiforce--int.sandbox.lightning.force.com/lightning/page/home");
        Thread.sleep(5000);
        testDataReader user = new testDataReader("01");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername(user.getUsername());
        loginPage.enterPassword(user.getPassword());
        Thread.sleep(5000);
        loginPage.clickLogin();
    }

    @Test
    @Order(2)
    public void createNewOpportunity() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.clickOpportunityButton();
    }

    @AfterAll
    void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }

}

