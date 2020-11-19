package testi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class test3 {
    private WebDriver driver;

    @Before
    public void start() {

        driver = new ChromeDriver();
    }

    @Test
    public void Test3() {
        driver.get("http://localhost/litecart/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();

        List<WebElement> listEl = driver.findElements(By.cssSelector("li#app- > a"));

        for (int i = 0; i < listEl.size(); i++) {
            List<WebElement> f = driver.findElements(By.cssSelector("li#app- > a"));
            f.get(i).click();
            List<WebElement> s = driver.findElements(By.cssSelector("li#app-  li a"));
            for (int j = 0; j < s.size(); j++) {
                List<WebElement> newEl = driver.findElements(By.cssSelector("li#app-  li a"));
                newEl.get(j).click();
                if (El(driver, By.cssSelector("h1"))) {
                    System.out.println("На странице есть заголовок H1");
                } else {
                    System.out.println("На странице нет заголовка H1");
                }
            }
        }
    }

        boolean El (WebDriver driver, By locator){
            return driver.findElements(locator).size() > 0;

        }
    @After
    public void stop(){
        driver.quit();
        driver = null;

    }

}
