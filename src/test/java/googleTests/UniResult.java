package googleTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ISelect;


import java.time.Duration;
import java.util.List;

public class UniResult {
  @Test
  public void Search() throws Exception{

      //Login
      WebDriverManager.chromedriver().setup();
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");
      WebDriver driver = new ChromeDriver(options);
      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
      driver.manage().window().maximize();
      driver.get("https://charusat.edu.in:912/UniExamResult/");
      Thread.sleep(200);
      //ONLY FOR SELECT Institute -- STARTS --
      WebElement el = driver.findElement(By.name("ddlInst"));
      Select select = new Select(el);
      select.selectByVisibleText("CSPIT");
      //  -- ENDS --
      Thread.sleep(200);

      //ONLY FOR SELECT Degree -- STARTS --
      WebElement elDegree = driver.findElement(By.name("ddlDegree"));
      Select selectDegree = new Select(elDegree);
      selectDegree.selectByVisibleText("BTECH(IT)");
      //  -- ENDS --
      Thread.sleep(200);

      //ONLY FOR SELECT Semester -- STARTS --
      WebElement elSemester = driver.findElement(By.name("ddlSem"));
      Select selectSemester = new Select(elSemester);
      selectSemester.selectByVisibleText("5");
      //  -- ENDS --
      Thread.sleep(200);

      //ONLY FOR SELECT Exam -- STARTS --
      WebElement elExam = driver.findElement(By.name("ddlScheduleExam"));
      Select selectExam = new Select(elExam);
      selectExam.selectByVisibleText("NOVEMBER 2022");
      //  -- ENDS --
      Thread.sleep(200);

      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='txtEnrNo']")))).sendKeys("D21IT169");
      Thread.sleep(300);

      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='submit' and @id='btnSearch' and @value='Show Marksheet']")))).click();
      Thread.sleep(300);
      driver.quit();
  }

    }
