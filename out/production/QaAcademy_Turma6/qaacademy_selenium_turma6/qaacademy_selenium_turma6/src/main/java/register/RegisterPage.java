package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private String firstName = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input";
    private String lastName = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
    private String address = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea";
    private String emailAddress = "//*[@id=\"eid\"]/input";
    private String phone = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input";
    private String gender = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input";
    private String hobbies = "//*[@id=\"checkbox2\"]";
    private String skills = "Skills";
    private String selectCountry1 = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span";
    private String selectCountry2 = "//*[@id=\"select2-country-results\"]/li[3]";
    private String ano = "yearbox";
    private String mes = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select";
    private String dia = "daybox";
//    private String password = "";
//    private String confirmPassword = "";

    //Açoes da tela:
    public void preencherNome(WebDriver driver){
        driver.findElement(By.xpath(firstName)).sendKeys("Diego");
    }
    public void preencherSegundoNome(WebDriver driver){
        driver.findElement(By.xpath(lastName).sendKeys("Soares");
    }
    public void preencherEndereco(WebDriver driver){
        driver.findElement(By.xpath(address).sendKeys("Rua Um Dois Tres da Silva Quatro");
    }
    public void preencherEmail(WebDriver driver){
        driver.findElement(By.xpath(emailAddress).sendKeys("teste@teste.com");
    }
    public void PreencherTelefone(WebDriver driver){
        driver.findElement(By.xpath(phone).sendKeys("98765432");
    }
    public void clicarHobbies(WebDriver driver){
        driver.findElement(By.xpath(hobbies).click();
    }
    public void selecionarSkills(WebDriver driver){
        Select skillsSelect = new Select(driver.findElement(By.id(skills)));
        skills.selectByVisibleText("Java");
    }
    public void selecionarPais(WebDriver driver){
        driver.findElement(By.xpath(selectCountry1)).click();
        driver.findElement(By.xpath(selectCountry2)).click();
    }
    public void selecionarAno(WebDriver driver){
        Select year = new Select(driver.findElement(By.id(ano)));
        year.selectByVisibleText("1986");
    }
    public void selecionarMes(WebDriver driver){
        Select month = new Select(driver.findElement(By.xpath(mes)));
        month.selectByVisibleText("October");
    }
    public void selecionarDia(WebDriver driver){
        Select day = new Select(driver.findElement(By.id(dia)));
        day.selectByVisibleText("5");
    }
}
