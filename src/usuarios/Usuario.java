package usuarios;

import java.util.UUID;

public class Usuario {

    private String login;
    private String senha;
    private UUID _id;

    public Usuario() {
        this._id = UUID.randomUUID();
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
        this._id = UUID.randomUUID();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UUID get_id() {
        return _id;
    }

    public void adicionarCadastro(){
        //Iremos adicionar esse novo usuario no banco de dados
        Usuario usuario = new Usuario();
    }

    public void logar(){
        // Função para logar usuario no Backend
    }

    public void validarUsuario(boolean usuario, boolean senha){
        // Função para Validar entrada do usuario
    }

}
