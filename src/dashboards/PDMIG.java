package dashboards;

import usuarios.Cadastro;

/**
 * Classe que irá criar a integração entre o ‘login’ do usuario e o banco de dados do site
 * @see usuarios.Cadastro
 * @author Turing
 */
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

    /**
     * Methodo que irá comparar os dados e liberar o acesso ao BD
     * @return true apenas se não houver divergencias
     * @author Turing
     */
    public boolean comparar_Dados(){
        return true;
    }

    /**
     * Methodo que irá comparar os dados e liberar o acesso ao BD
     * @return String com os dados do respectivo erro
     * @author Turing
     */
    public String enviarMsgErro(){
        return "Erro";
    }

    /**
     * Methodo que irá mandar um e-mail de confirmação, podendo ser de segurança, ou caso seja erro,
     * enviará a mensagem de erro conforme o methodo enviarMsgErro()
     * @author Turing
     */
    public void enviarEmailConfirmacao(){

    }

}
