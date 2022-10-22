package cep;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CepTest {
    WebDriver cep;
    @Test
    public void cep() throws InterruptedException {
        cep = new ChromeDriver();
        cep.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
        cep.manage().window().maximize();
        cep.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cep.findElement(By.name("endereco")).sendKeys("05773070");
        //Thread.sleep(2000);
        Select select = new Select(cep.findElement(By.id("tipoCEP")));
        select.selectByVisibleText("Localidade/Logradouro");
        cep.findElement(By.xpath("//*[@id=\"btn_pesquisar\"]")).click();
        //Thread.sleep(2000);
        String logradouro = cep.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]")).getText();
        Assert.assertEquals("Endereço inválido","Rua Inácio Manuel Tourinho", logradouro);
        cep.findElement(By.xpath("//*[@id=\"btn_nbusca\"]")).click();
    }
//    @After
//    public void fecharCep(){
//        cep.quit();
//    }
}
