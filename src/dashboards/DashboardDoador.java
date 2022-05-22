package dashboards;

import doacoes.HistoricoDoacoes;
import doacoes.TipoDoacao;

public class DashboardDoador {

    private boolean botaoFazerDoacao;
    private boolean botaoAlterarDados;
    private boolean botaoHistorico;

    public DashboardDoador() {
    }

    public boolean isBotaoFazerDoacao() {
        return botaoFazerDoacao;
    }

    public boolean isBotaoAlterarDados() {
        return botaoAlterarDados;
    }

    public boolean isBotaoHistorico() {
        return botaoHistorico;
    }

    public TipoDoacao fazerDoacao(){
        return new TipoDoacao();
    }

    public void alterarDados(){

    }

    public HistoricoDoacoes exibirHistoricoDoacoes(){
        return new HistoricoDoacoes();
    }
}
