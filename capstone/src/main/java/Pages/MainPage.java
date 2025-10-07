package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;
    private WebElement opportunityButton = driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-id='Opportunity']//a[@title='Opportunities']"));

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOpportunityButton(){
        opportunityButton.click();
    }
}
