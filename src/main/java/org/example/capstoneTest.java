package org.example;
import Pages.LoginPage;
import Pages.MainPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class capstoneTest {

    private static WebDriver driver;

    @BeforeAll
    static void setup(){

    }

    @Test
    public void loginToTSIforce() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://tsiforce--int.sandbox.lightning.force.com/lightning/page/home");
        Thread.sleep(5000);
        testDataReader user = new testDataReader("01");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername(user.getUsername());
        loginPage.enterPassword(user.getPassword());
        Thread.sleep(5000);
        loginPage.clickLogin();
    }

    @Test(dependsOnMethods = {"loginToTSIforce"})
    public void createNewOpportunity() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.clickOpportunityButton();
    }

}

