import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\Selenium_Amazon\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@title='Search']")));
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("www.apple.com");
        driver.findElement(By.cssSelector("input[jsaction='trigger.kWlxhc']")).click();
    }
}
