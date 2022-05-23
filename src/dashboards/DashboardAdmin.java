package dashboards;

import usuarios.Cadastro;

/**
 * Classe que irá criar a tela de controle e dados do administrador
 * @author Turing
 */
public class DashboardAdmin {

    private boolean botaoAlterarIdiomas;
    private boolean botaoHistorico;

    public DashboardAdmin() {
    }

    public boolean isBoataoAlterarIdiomas() {
        return botaoAlterarIdiomas;
    }

    public boolean isBotaoHistorico() {
        return botaoHistorico;
    }

    /**
     * Methodo irá definir os idiomas disponiveis para visualização
     * @author Turing
     */
    public void definirIdiomas(){

    }

    /**
     * Methodo que permite ao administrador cadastrar um novo doador
     * @author Turing
     */
    public void cadastarDoador(){

    }

    /**
     * Methodo que permite ao administrador visualizar o perfil de um usuário
     * @param cadastro Cadastro a ser Visualizado
     * @return Cadastro solicitado
     * @author Turing
     */
    public Cadastro visualizarPerfil(Cadastro cadastro){
        return cadastro;
    }

    /**
     * Methodo que permite ao administrador alterar o perfil de um usuário
     * @param cadastro Cadastro a ser Alterado
     * @return Cadastro solicitado
     * @author Turing
     */
    public Cadastro AlterarPerfil(Cadastro cadastro){
        return cadastro;
    }

    /**
     * Methodo que permite ao administrador consultar o perfil de um doador e o seu historico
     * @param cadastro Cadastro a ser consultado
     * @return Cadastro solicitado
     * @author Turing
     */
    public Cadastro ConsultarDoadores(Cadastro cadastro){
        return cadastro;
    }
}
