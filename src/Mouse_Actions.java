import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_Actions {


    //Actions a = new Actions(driver);
    //a.moveToElement(driver.findElement(By.cssSelector(".gf-bttl"))).build().perform();

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\Selenium_Amazon\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("https://gamestop.com");

        driver.manage().window().maximize();


       //WebDriverWait wait1 = new WebDriverWait(driver, 10);
       //wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("XBOX ONE")));
       // JavascriptExecutor src= (JavascriptExecutor) driver;

        //src.executeScript("window.scrollBy(0,2500)");

WebElement  PS4 =  driver.findElement(By.linkText("PLAYSTATION 4"));

        Actions mouse = new Actions(driver);
        mouse.moveToElement(PS4).build().perform();

       PS4.click();
driver.quit();
    }
}
