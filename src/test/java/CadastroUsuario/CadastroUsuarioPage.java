package CadastroUsuario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CadastroUsuarioPage {

    WebDriver driver;



    String btnRegistrar = "//*[contains(text(),'Registrar')]";
    String campoEmailCadastro = "//form/div[2]/input";
    String campoNomeCadastro = "//input[@name='name']";
    String campoSenhaCadastro = "//form/div[4]/div/input";
    String campoConfirmarSenhaCadastro = "//input[@name='passwordConfirmation']";
    String btnCriarContaSaldo = "//form/div[6]/label/span";
    String btnConfirmar = "//*[contains(text(),'Cadastrar')]";

    String msgContaCriada = "//*[contains(text(),'foi criada com sucesso')]";

    public CadastroUsuarioPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clicarRegistrar(){
        driver.findElement(By.xpath(btnRegistrar)).click();
    }

    public void digitarEmailCadastro(String email){
        driver.findElement(By.xpath(campoEmailCadastro)).sendKeys(email);
    }

    public void digitarNomeCadastro(String nome){
        driver.findElement(By.xpath(campoNomeCadastro)).sendKeys(nome);
    }

    public void digitarSenhaCadastro(String senha){
        driver.findElement(By.xpath(campoSenhaCadastro)).sendKeys(senha);
    }

    public void digitarConfirmacaoSenhaCadastro(String confirmacaoSenha){
        driver.findElement(By.xpath(campoConfirmarSenhaCadastro)).sendKeys(confirmacaoSenha);
    }

    public void clicarCriarContaSaldo(){
        driver.findElement(By.xpath(btnCriarContaSaldo)).click();
    }

    public void clicarConfirmar() {
        driver.findElement(By.xpath(btnConfirmar)).click();

    }

    public boolean cadastroRealizadoComSucesso(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(msgContaCriada)));
      return driver.findElement(By.xpath(msgContaCriada)).isDisplayed();

    }





}
