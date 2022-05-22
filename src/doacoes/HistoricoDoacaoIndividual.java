package doacoes;

import java.util.Date;

public class HistoricoDoacaoIndividual extends HistoricoDoacoes{

    public HistoricoDoacaoIndividual(Date dataDoacao, double valorDoacao, int quantidadeDoacao, TipoDoacao tipoDoacao) {
        super(dataDoacao, valorDoacao, quantidadeDoacao, tipoDoacao);
    }

    public HistoricoDoacaoIndividual() {
    }

    public void peridicidade(){

    }

}
