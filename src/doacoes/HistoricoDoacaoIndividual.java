package doacoes;

import java.util.Date;

/**
 * Classe basica que extende o historico de doações com a doação individual, para ser possivel fazer a doação periodica
 * @see HistoricoDoacoes
 * @author Turing
 */
public class HistoricoDoacaoIndividual extends HistoricoDoacoes{

    public HistoricoDoacaoIndividual(Date dataDoacao, double valorDoacao, int quantidadeDoacao, TipoDoacao tipoDoacao) {
        super(dataDoacao, valorDoacao, quantidadeDoacao, tipoDoacao);
    }

    public HistoricoDoacaoIndividual() {
    }

    /**
     * Methodo que programa no backend as doações periodicas
     * @author Turing
     */
    public void peridicidade(){

    }

}
