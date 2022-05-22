package dashboards;

import usuarios.Cadastro;

public class PDMIG  extends Cadastro {
    private String emailLogin;
    private String passwordLogin;

    public PDMIG(String login, String senha) {
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

    public boolean comparar_Dados(){
        return true;
    }

    public String enviarMsgErro(){
        return "Erro";
    }

    public void enviarEmailConfirmacao(){

    }

}
