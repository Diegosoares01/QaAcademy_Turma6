package google;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    WebDriver driver;
    @Test
    public void testeGoogle(){
        driver = new ChromeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("corinthians");
        //Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body")).click();
        String texto = driver.findElement(By.xpath("//*[@id=\"sports-app\"]/div/div[1]/div/div/div[1]/div/div[2]/div[2]")).getText();
        Assert.assertEquals("Texto inválido","Sport Club Corinthians Paulista",texto);
        }
        @After
        public void fecharBrowse(){
        driver.quit();
        }
}
