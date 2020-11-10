package testi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class test1 {
    private WebDriver driver;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\DriverChrome\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void Test1() {
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("YouTube");
        driver.findElement(By.name("btnK")).click();
        driver.get("https://www.youtube.com/?gl=RU&hl=ru");

    }
    @After
    public void stop(){
        driver.quit();
        driver = null;

    }




}
