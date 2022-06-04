package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    WebDriver driver;


    String campoEmail = "(//input[@type='email'])[1]";
    String campoSenha = "(//input[@type='password'])[1]";
    String btnAcessar = "//button[contains(text(),'Acessar')]";


    public void digitarEmail(){

        driver.findElement(By.xpath(campoEmail)).sendKeys("soarescjunior@teste.com.br");

    }

    public void digitarSenha(){

        driver.findElement(By.xpath(campoSenha)).sendKeys("12345678");

    }

    public void btnAcessar(){

        driver.findElement(By.xpath(campoSenha)).click();

    }

    public void telaInicial(){


    }

}
