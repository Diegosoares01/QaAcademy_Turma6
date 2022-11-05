package cep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BuscaCepPage {
    private String campoBusca = "endereco";
    private String selectTipo = "tipoCEP";
    private String botaoPesquisar = "btn_pesquisar";

    public void preencherCampoCep(WebDriver cep){
        cep.findElement(By.name(campoBusca)).sendKeys("05773070");
    }
    public void selecionarTipo (WebDriver cep){
        Select select = new Select(cep.findElement(By.id(selectTipo)));
        select.selectByVisibleText("Localidade/Logradouro");//seleciona o texto da caixa de seleção
    }
    public void clicarBotaoBusca(WebDriver cep){
        cep.findElement(By.id(botaoPesquisar)).click();

    }
}
