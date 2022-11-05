package cep;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetornaCepPage {
    private String textoRetornoCep = "//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]";

    public void validarRetornoCep(WebDriver cep){
        String texto = cep.findElement(By.xpath(textoRetornoCep)).getText();
        Assert.assertEquals("Endereço inválido","Rua Inácio Manuel Tourinho", texto);
    }
}
