package googleTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class EGovTestCase {
  @Test
  public void EGovTestCase() throws Exception{

      //Login
      WebDriverManager.chromedriver().setup();
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");
      WebDriver driver = new ChromeDriver(options);
      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
      driver.manage().window().maximize();
      driver.get("https://charusat.edu.in:912/eGovernance/");
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='txtUserName']")))).sendKeys("D21IT169");
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='txtPassword']")))).sendKeys("050902");
      Thread.sleep(3000);
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='btnLogin']")))).click();
      Thread.sleep(3000);
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='grdGrossAtt_ctl01_lnkRequestViewTT']")))).click();
      Thread.sleep(6000);
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@value='More']")))).click();
      Thread.sleep(6000);
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//button[@class='close'])[4]")))).click();

      // Another module
      Thread.sleep(900);
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='gvTimetable_stu_ctl01_lnkRequestViewTT']")))).click();
      Thread.sleep(3000);
//      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='txtdate']")))).sendKeys("10/03/2023");
//      Thread.sleep(500);
//      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='card-block']")))).click();

//      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='gvresult1_ctl01_lnkRequestViewTT']")))).click();
//      Thread.sleep(10000);


//      //ONLY FOR SELECT Exam -- STARTS --
//      WebElement elSem = driver.findElement(By.name("ddlsemester"));
//      Select selectSem = new Select(elSem);
//      selectSem.selectByVisibleText("4");
//      //  -- ENDS --

//      Thread.sleep(500);

        //log out
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//i[@class='icon-power-off']")))).click();


//      driver.quit();

  }

    }
