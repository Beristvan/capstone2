package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOpportunityButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By opportunityButtonLocator = By.xpath("//one-app-nav-bar-item-root[@data-id='Opportunity']//a[@title='Opportunities']");
        WebElement opportunityButton = wait.until(ExpectedConditions.visibilityOfElementLocated(opportunityButtonLocator));
        opportunityButton.click();
    }
}
