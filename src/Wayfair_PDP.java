import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Wayfair_PDP {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\Selenium_Amazon\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://wayfair.com");

Thread.sleep(6000);

        //driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id='DepartmentItem-Furniture']")).click();

        Thread.sleep(6000);

        driver.findElement(By.cssSelector("a[href='/furniture/cat/office-furniture-c332627.html']")).click();


        Thread.sleep(6000);
        driver.findElement(By.xpath("//img[@src='https://secure.img1-fg.wfcdn.com/im/46275877/resize-h65-w65%5Ecompr-r85/1097/109710330/default_name.jpg']"))
       .click();

        Thread.sleep(6000);
        driver.findElement(By.xpath("//img[@alt='Liverpool Reversible Desk']")).click();


        driver.get("https://www.wayfair.com/furniture/pdp/williston-forge-liverpool-reversible-desk-w003306032.html");

        String PDP_title = driver.getTitle();

        System.out.println(PDP_title);
    }
}
