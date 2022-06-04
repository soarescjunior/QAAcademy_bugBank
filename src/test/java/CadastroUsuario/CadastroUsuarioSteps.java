package CadastroUsuario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CadastroUsuarioSteps {

    WebDriver driver;
    CadastroUsuarioPage cadastroUsuarioPage;


    @Before
    public void iniciarTest(){
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        cadastroUsuarioPage = new CadastroUsuarioPage(driver);


    }

    @Dado("que esteja na pagina inicial {string}")
    public void queEstejaNaPaginaInicialHttpLocalhost(String url) {
        driver.get(url);
    }

    @Quando("acessar a opção de registrar")
    public void acessar_a_opção_de_registrar() {
        cadastroUsuarioPage.clicarRegistrar();

    }

    @E("preeencher os dados de acesso")
    public void preeencher_os_dados_de_acesso(List<Map<String,String>>dataTable) {
        String email = dataTable.get(0).get("email");
        String nome = dataTable.get(0).get("nome");
        String senha = dataTable.get(0).get("senha");
        String confirmacaoSenha = dataTable.get(0).get("confirmacao senha");
        cadastroUsuarioPage.digitarEmailCadastro(email);
        cadastroUsuarioPage.digitarNomeCadastro(nome);
        cadastroUsuarioPage.digitarSenhaCadastro(senha);
        cadastroUsuarioPage.digitarConfirmacaoSenhaCadastro(confirmacaoSenha);
        cadastroUsuarioPage.clicarCriarContaSaldo();
        cadastroUsuarioPage.clicarConfirmar();
    }

    @Entao("o cadastro e realizado")
    public void o_cadastro_e_realizado() {

       Assert.assertTrue(cadastroUsuarioPage.cadastroRealizadoComSucesso());
    }

    @After
    public void fechearTest(){
        driver.quit();

    }

}
