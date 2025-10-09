package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomWebElement {
    private WebElement element;
    private WebDriver driver;

    public CustomWebElement(WebElement element, WebDriver driver) {
        this.element = element;
        this.driver = driver;
    }

    public void javaClick() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public WebElement getElement() {
        return element;
    }
}
