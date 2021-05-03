import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wayfair {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\Selenium_Amazon\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("http://wayfair.com");
        //driver.findElement(By.xpath("//span[@role='checkbox']")).submit();
Thread.sleep(10000);

        //driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id='DepartmentItem-Furniture']")).click();
        Thread.sleep(10000);

        driver.findElement(By.cssSelector("a[href='/furniture/cat/office-furniture-c332627.html']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//img[@src='https://secure.img1-fg.wfcdn.com/im/46275877/resize-h65-w65%5Ecompr-r85/1097/109710330/default_name.jpg']"))
       .click();
        Thread.sleep(10000);
        //driver.manage().deleteAllCookies();
        driver.findElement(By.cssSelector("//img[@alt='Steyning Height Adjustable Standing Desk']")).click();


    }
}
