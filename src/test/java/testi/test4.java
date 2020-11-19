package testi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class test4 {
    private WebDriver driver;

    @Before
    public void start() {

        driver = new ChromeDriver();

    }

    @Test
    public void Test4() {
        driver.get("http://localhost/litecart/en/");


        List<WebElement> ListEL = driver.findElements(By.cssSelector(".product"));

        for (WebElement i : ListEL) {
            assertTrue((i.findElements(By.cssSelector(".sticker"))).size() == 1);
            System.out.println("У товара есть стикер");
            }
       }


    @After
    public void stop(){
        driver.quit();
        driver = null;

    }

}