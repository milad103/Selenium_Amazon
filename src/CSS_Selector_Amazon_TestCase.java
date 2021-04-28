import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_Amazon_TestCase {

    public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\Selenium_Amazon\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://amazon.com");



    }
}
