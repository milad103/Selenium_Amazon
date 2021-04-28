import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Games {


    public static void main(String[] args) throws InterruptedException   {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\Selenium_Amazon\\Driver\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();


            driver.get("https://gamestop.com");



            driver.findElement(By.linkText("PLAYSTATION 4")).click();

            driver.findElement(By.cssSelector("a[href='/-ps4-consoles-new--1/products/playstation-4-and-mlb-the-show-21-jackie-robinson-edition-system-bundle/B147255S.html']")).click();

            driver.findElement(By.xpath("//button[@data-buttontext='Add to Cart']")).click();

            Thread.sleep(3000);

            driver.findElement(By.linkText("VIEW CART")).click();
        }
    }

