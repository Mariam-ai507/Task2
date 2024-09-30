package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Seatselection {
    WebDriver driver;

    By selectSeat = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div[5]/div[6]");
    By boardingPoint = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]");
    By chooseboard = By.cssSelector("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div");
    By droppingPoint = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]");
    By chooseDropping = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div");
    By DetailsB= By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]");

    public Seatselection(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseSeatAndPoints() {
        driver.findElement(selectSeat).click();
        driver.findElement(boardingPoint).click();
        driver.findElement(chooseboard).click();
        driver.findElement(droppingPoint).click();
        driver.findElement(chooseDropping).click();
        driver.findElement(DetailsB).click();
    }

}
