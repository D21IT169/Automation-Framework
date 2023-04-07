package Orange;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    @Test
    public void LaunchURL(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }
    @Test
    public void Search(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q")))).sendKeys("Dhyey Patel");
        driver.findElement(By.name("username")).sendKeys("Hetvi");
        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
        System.out.println(driver.getTitle());
        driver.quit();
    }
//    @Test
//    public void NavigateToMyInfo(){
//        driver.findElement(By.xpath("//span[text()='My Info']")).click();
//        System.out.println(driver.getTitle());
//    }
//    @Test
//    public void Logout(){
//        driver.findElement(By.xpath("//p[text()='Meghana Gangananjaiah']")).click();
//        driver.findElement(By.xpath("//a[text()='Logout']")).click();
//        System.out.println(driver.getTitle());
//        driver.quit();
//    }
}
