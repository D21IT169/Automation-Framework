package googleTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.String.*;
import java.time.Duration;


public class Login {

    @Test
    public void Login() throws Exception {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("  //span[text()='Sign in']")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='email']")))).sendKeys("D21it169@charusat.edu.in");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button/span[@class='VfPpkd-vQzf8d' and text()='Next']")))).click();
        Thread.sleep(10000);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='password']")))).sendKeys("hetvi@soni");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button/span[@class='VfPpkd-vQzf8d' and text()='Next']")))).click();
        Thread.sleep(10000);

        System.out.println("Verified: " + driver.getTitle());
        Thread.sleep(500);
        driver.quit();
    }
}
