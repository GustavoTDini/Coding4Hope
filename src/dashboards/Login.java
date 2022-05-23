package dashboards;

import usuarios.Usuario;


/**
 * Classe que irá criar a página de login do Cadastro do usuário
 * @see usuarios.Usuario
 * @author Turing
 */
public class Login extends Usuario {

    private String emailLogin;
    private String passwordLogin;

    public Login(String login, String senha) {
        super();
        this.emailLogin = login;
        this.passwordLogin = senha;
    }

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public String getPasswordLogin() {
        return passwordLogin;
    }

    public void setPasswordLogin(String passwordLogin) {
        this.passwordLogin = passwordLogin;
    }

    /**
     * Methodo que irá enviar os dados para a confirmação pela PDMIG
     * @see PDMIG
     * @author Turing
     */
    public void enviarDados(){

    }

    /**
     * Methodo que será chamado caso ocorra algum erro de login, tanto de servidos como de erro de login e senha
     * @author Turing
     */
    public void erroLogin(){

    }
}
