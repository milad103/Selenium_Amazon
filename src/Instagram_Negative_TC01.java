import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class Instagram_Negative_TC01 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\Selenium_Amazon\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://instagram.com");

        driver.manage().window().maximize();

        WebDriverWait wait = new  WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='password']")));

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Anonymous1999");

        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("p@ssword");

// Show/unhide password
        driver.findElement(By.xpath("//button[@class='sqdOP yWX7d     _8A5w5    ']")).click();


// Click Login Button
        driver.findElement(By.xpath("//form[@class='HmktE']/div/div[3]/button/div")).click();

        driver.manage().timeouts().implicitlyWait (3,SECONDS);

        // Print out the expected results"error message" for our negative test case
        WebElement ErrorMsg = driver.findElement(By.cssSelector("p[data-testid='login-error-message']"));
        ErrorMsg.getText();

        System.out.println("Test case was successfull and expected result is the following message: "+ErrorMsg.getText());



    }
}
