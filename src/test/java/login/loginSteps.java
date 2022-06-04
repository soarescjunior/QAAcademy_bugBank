package login;

import CadastroUsuario.CadastroUsuarioPage;
import io.cucumber.java.Before;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginSteps {

    WebDriver  driver;

    CadastroUsuarioPage cadastroUsuarioPage;
    loginPage loginPage;

    @Before
    public void iniciarTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        cadastroUsuarioPage = new CadastroUsuarioPage(driver);
    }

        @Quando("digitar o email")
        public void digitar_o_email() {
          loginPage.digitarEmail();
        }

        @E("digitar a senha")
        public void digitar_a_senha() {
            loginPage.digitarSenha();
        }

        @Entao("acesso o portal bugbank")
        public void acesso_o_portal_bugbank() {
         loginPage.btnAcessar();
        }

    }

