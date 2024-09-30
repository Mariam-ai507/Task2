package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment {
    WebDriver driver;

    By customerName = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[2]/input[2]");
    By phoneNumber = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[2]/input[2]");
    By email = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[3]/input[2]");
    By makePaymentButton = By.id("makePayment");
    By proccedButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[1]/div[2]");
    public Payment(WebDriver driver) {
        this.driver = driver;
    }

    public void CustomeerDetails(String phone, String emailAddress) {
        driver.findElement(phoneNumber).sendKeys(phone);
        driver.findElement(email).sendKeys(emailAddress);

    }
    public void fillPaymentDetails(String name) {
        driver.findElement(customerName).sendKeys(name);

    }

}
