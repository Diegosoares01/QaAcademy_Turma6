package register;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RegisterTest {
    @Test
    public void testeAutomation() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Diego");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Soares");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Rua Um Dois Tres da Silva Quatro");
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("teste@teste.com");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("98765432");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
        //Selects
        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByVisibleText("Java");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[3]")).click();
        Select year = new Select(driver.findElement(By.id("yearbox")));
        year.selectByVisibleText("1986");
        Select month = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
        month.selectByVisibleText("October");
        Select day = new Select(driver.findElement(By.id("daybox")));
        day.selectByVisibleText("5");
    }

    @Test
    public void alertOK() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
        Alert alert = driver.switchTo().alert();
        String textoAlert = alert.getText();
        Assert.assertEquals("Texto Alert Invalido", "I am an alert box!", textoAlert);
        alert.accept();
    }

    @Test
    public void alertOkandCancel() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
        Alert alert = driver.switchTo().alert();
        String textoAlertCancel = alert.getText();
        Assert.assertEquals("Texto Alert Invalido", "Press a Button !", textoAlertCancel);
        alert.dismiss();
    }

    @Test
    public void alertTextBox() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Diego");
        alert.accept();
        String textoTextBox = driver.findElement(By.id("demo1")).getText();
        textoTextBox.contains("Diego");
        Assert.assertTrue(textoTextBox.contains("Diego"));
        //Assert.assertEquals("Texto invalido", "Hello Diego How are you today", textoTextBox);

    }
    @Test
    public void frameTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.switchTo().frame("singleframe");
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Diego");
        driver.switchTo().defaultContent();//Serve para fazer o frame voltar a estar como antes

    }
}