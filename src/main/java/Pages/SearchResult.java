package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResult {
    WebDriver driver;

    By firstBus = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div/div/div[5]/div[7]/div");

    public SearchResult(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstBus() {
        driver.findElement(firstBus).click();
    }

}
