package dashboards;

import usuarios.Usuario;

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

    public void enviarDados(){

    }

    public void erroLogin(){

    }
}
