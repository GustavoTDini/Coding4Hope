package usuarios;

import java.util.UUID;

/**
 * Classe para definir um cadastro basico inicial que inclue o ‘login’, podendo ser o e-mail,
 * e uma senha, além de atribuir um ‘id’ unico com o tipo UUID
 * @author Turing
 */
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


    /**
     * Methodo que irá adicionar o cadastro criado no banco de dados
     * @author Turing
     */
    public void adicionarCadastro(){
        //Iremos adicionar esse novo usuario no banco de dados
        Usuario usuario = new Usuario();
    }

    /**
     * Methodo opara fazer o ‘login’ do usuario e abrir a seção privada no site
     * @author Turing
     */
    public void logar(){
        // Função para logar usuario no Backend
    }

    /**
     * Methodo opara fazer a validação do usuário e da sanha, liberando o sistema para fazer o ‘login’
     * @param usuario true se usuario for igual ao login
     * @param senha true se senha for igual senha do usuário
     * @author Turing
     */
    public void validarUsuario(boolean usuario, boolean senha){
        // Função para Validar entrada do usuario
    }

}
