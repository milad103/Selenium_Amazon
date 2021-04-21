import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_Amazon_TestCase {

    public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\Selenium_Amazon\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://amazon.com");
Thread.sleep(6000);

driver.findElement(By.cssSelector("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[11]/td[11]/a"));
    }
}
