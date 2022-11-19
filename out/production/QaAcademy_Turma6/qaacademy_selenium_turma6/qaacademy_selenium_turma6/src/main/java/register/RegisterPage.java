package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver driver; //Declaração de variável

    public RegisterPage(WebDriver driverParametro){ //Metodo construtor
        driver = driverParametro;

    }
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
    public void preencherNome(String nome){
        driver.findElement(By.xpath(firstName)).sendKeys(nome);
    }
    public void preencherSegundoNome(String sobrenome){
        driver.findElement(By.xpath(lastName)).sendKeys(sobrenome);
    }
    public void preencherEndereco(String endereco){
        driver.findElement(By.xpath(address)).sendKeys(endereco);
    }
    public void preencherEmail(String email){
        driver.findElement(By.xpath(emailAddress)).sendKeys(email);
    }
    public void PreencherTelefone(String telefone){
        driver.findElement(By.xpath(phone)).sendKeys(telefone);
    }
    public void selecionarGenero(){
        driver.findElement(By.xpath(gender)).click();
    }
    public void clicarHobbies(){
        driver.findElement(By.xpath(hobbies)).click();
    }
    public void selecionarSkills(String ski){
        Select skillsSelect = new Select(driver.findElement(By.id(skills)));
        skillsSelect.selectByVisibleText(ski);
    }
    public void selecionarPais(){
        driver.findElement(By.xpath(selectCountry1)).click();
        driver.findElement(By.xpath(selectCountry2)).click();
    }
    public void selecionarAno(String YEAR){
        Select year = new Select(driver.findElement(By.id(ano)));
        year.selectByVisibleText(YEAR);
    }
    public void selecionarMes(String MONTH){
        Select month = new Select(driver.findElement(By.xpath(mes)));
        month.selectByVisibleText(MONTH);
    }
    public void selecionarDia(String DAY){
        Select day = new Select(driver.findElement(By.id(dia)));
        day.selectByVisibleText(DAY);
    }
}
