// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class GrotestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void grotest() {
    driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme_v4/add");
    driver.manage().window().setSize(new Dimension(1050, 660));
    driver.findElement(By.id("field-customerName")).click();
    driver.findElement(By.id("field-customerName")).sendKeys("g");
    driver.findElement(By.id("field-contactLastName")).click();
    driver.findElement(By.id("field-contactLastName")).sendKeys("v");
    driver.findElement(By.id("field-contactFirstName")).click();
    driver.findElement(By.id("field-contactFirstName")).sendKeys(" c");
    driver.findElement(By.id("field-phone")).click();
    driver.findElement(By.id("field-phone")).sendKeys("c");
    driver.findElement(By.id("field-addressLine1")).click();
    driver.findElement(By.id("field-addressLine1")).sendKeys("c");
    driver.findElement(By.id("field-addressLine2")).click();
    driver.findElement(By.id("field-addressLine2")).sendKeys("d");
    driver.findElement(By.id("field-city")).click();
    driver.findElement(By.id("field-city")).sendKeys("d");
    driver.findElement(By.id("field-state")).click();
    driver.findElement(By.id("field-state")).sendKeys("d");
    driver.findElement(By.id("field-postalCode")).click();
    driver.findElement(By.id("field-postalCode")).sendKeys("4");
    driver.findElement(By.id("field-country")).click();
    driver.findElement(By.id("field-country")).sendKeys("d");
    driver.findElement(By.cssSelector("b")).click();
    driver.findElement(By.cssSelector(".chosen-search > input")).click();
    driver.findElement(By.cssSelector(".chosen-search > input")).sendKeys("king");
    driver.findElement(By.cssSelector(".active-result")).click();
    driver.findElement(By.id("field-creditLimit")).click();
    driver.findElement(By.id("field-creditLimit")).sendKeys("10.000,00");
    driver.findElement(By.id("field-deleted")).click();
    driver.findElement(By.id("field-deleted")).sendKeys("ok");
    driver.findElement(By.id("form-button-save")).click();
  }
}
