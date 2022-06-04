#language:pt

@testOne
Funcionalidade: Teste cadastro no BugBank
  Cenario:  Cadastro do Usuario
    Dado que esteja na pagina inicial 'http://localhost:3000/#'
    E acessar a opção de registrar
    Quando preeencher os dados de acesso
    |email                |nome           |senha          |confirmacao senha |
    |teste@teste.com.br   |Claudio        |12345678       |12345678          |
    |user2@teste.com.br   |Junior         |87654321       |87654321          |
    Entao o cadastro e realizado