package googleTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import googleTests.*;

import java.time.Duration;

public class Search {
  @Test
  public void Search() throws Exception{

      //Login
      WebDriverManager.chromedriver().setup();
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");
      WebDriver driver = new ChromeDriver(options);
      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
      driver.manage().window().maximize();
      driver.get("https://www.google.com");
      driver.findElement(By.xpath("  //span[text()='Sign in']")).click();
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='email']")))).sendKeys("casetestcase383@gmail.com");
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button/span[@class='VfPpkd-vQzf8d' and text()='Next']")))).click();
      Thread.sleep(10000);

      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='password']")))).sendKeys("case1@123");
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button/span[@class='VfPpkd-vQzf8d' and text()='Next']")))).click();
      Thread.sleep(10000);

      System.out.println("Verified: " + driver.getTitle());
      Thread.sleep(500);

      //Search
      driver.findElement(By.name("q")).sendKeys("TCC - The Craft Cafe", Keys.ENTER);
//      driver.findElement(By.name("q")).sendKeys(" youtube", Keys.ENTER);
      System.out.println("Verified: " + driver.getTitle());
      Thread.sleep(500);

      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//h3[contains(text(),'TCC - The Craft Cafe')])[1]")))).click();
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Videos']")))).click();
      Thread.sleep(1000);
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//yt-formatted-string[text()='Mini Scrapbook | Most Prettiest Creation'])[1]")))).click();
      Thread.sleep(1000);
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")))).click();
      Thread.sleep(3000);




//      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//yt-formatted-string[text()='Add a comment...']")))).sendKeys("This is Automation TEST comments test case no. 2");
//      Thread.sleep(1000);
//      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[27]")))).click();

      driver.quit();




    }
}
