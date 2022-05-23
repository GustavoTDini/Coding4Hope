package dashboards;

import doacoes.HistoricoDoacoes;
import doacoes.TipoDoacao;

/**
 * Classe que irá criar a tela de controle e dados do doador
 * @author Turing
 */
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

    /**
     * Methodo irá fazer efetivamente a doação a partir das opções solicitadas pelo doador
     * @return TipoDoacao realizada
     * @author Turing
     */
    public TipoDoacao fazerDoacao(){
        return new TipoDoacao();
    }

    /**
     * Methodo que permite ao doador alterar dados do seu cadastro
     * @author Turing
     */
    public void alterarDados(){

    }

    /**
     * Methodo que permite ao doador verificar todas as suas doações
     * @return o HistoricoDoacoes do usuário Doador
     * @author Turing
     */
    public HistoricoDoacoes exibirHistoricoDoacoes(){
        return new HistoricoDoacoes();
    }
}
