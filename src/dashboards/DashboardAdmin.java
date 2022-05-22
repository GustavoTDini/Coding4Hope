package dashboards;

import doacoes.HistoricoDoacoes;
import usuarios.Cadastro;

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

    public void definirIdiomas(){

    }

    public HistoricoDoacoes exibirHistoricoDoacoes(){
        return new HistoricoDoacoes();
    }

    public void cadastarDoador(){

    }

    public Cadastro visualizarPerfil(Cadastro cadastro){
        return cadastro;
    }

    public Cadastro AlterarPerfil(Cadastro cadastro){
        return cadastro;
    }
    public Cadastro ConsultarDoadores(Cadastro cadastro){
        return cadastro;
    }
}
