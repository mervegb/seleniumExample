import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "/Users/mervebaykara/Downloads/chromedriver");
        driver = new ChromeDriver(options);
        driver.get("https://www.trendyol.com");
        WebElement modalCloseButton = driver.findElement(By.cssSelector(".modal-close"));
        modalCloseButton.click();
    }

    /*@AfterMethod
    public void tearDown() {
        driver.quit();
    }*/
}
