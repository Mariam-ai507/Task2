package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By fromLocation = By.xpath("//*[@id=\"frmSearch\"]/div/div[2]/div[1]/div[1]");
    By toLocation = By.xpath("//*[@id=\"frmSearch\"]/div/div[2]/div[1]/div[2]/div/div[1]");
    By searchButton = By.id("submitSearch");
    By arrivalDate = By.xpath("//*[@id=\"frmSearch\"]/div/div[2]/div[2]/div[1]/div/div[1]");
    By Date = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[5]/a");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void bookBus(String from, String to) {
        driver.findElement(fromLocation).sendKeys(from);
        driver.findElement(toLocation).sendKeys(to);
        driver.findElement(arrivalDate).click();
        driver.findElement(Date).click();
        driver.findElement(searchButton).click();
    }

}
