package Tests;

import Pages.*;
//import org.junit.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class BookingTest {
    static WebDriver driver;
    HomePage homePage;
    SearchResult searchResultsPage;
    Seatselection seatSelectionPage;
    Payment paymentPage;

    @BeforeClass
    public void setup() {
        System.out.println("Check No.1");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResult(driver);
        seatSelectionPage = new Seatselection(driver);
        paymentPage = new Payment(driver);
    }

    @Test
    public void bookBus() {

        homePage.bookBus("CHIKKAMAGALURU", "BENGALURU");
        searchResultsPage.selectFirstBus();
        seatSelectionPage.chooseSeatAndPoints();
        paymentPage.CustomeerDetails("6789125987","mmm@example.com");
        paymentPage.fillPaymentDetails("Mariam");

    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }

}
