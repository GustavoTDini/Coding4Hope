package doacoes;

import java.util.Date;

/**
 * Classe basica que traz os dados completos de uma doação - valor, data, e tipo,
 * além de mostrar a quantidade de doações totais.
 * @author Turing
 */
public class HistoricoDoacoes {

    private Date dataDoacao;
    private double valorDoacao;
    private int quantidadeDoacao;
    private TipoDoacao tipoDoacao;

    public HistoricoDoacoes(Date dataDoacao, double valorDoacao, int quantidadeDoacao, TipoDoacao tipoDoacao) {
        this.dataDoacao = dataDoacao;
        this.valorDoacao = valorDoacao;
        this.quantidadeDoacao = quantidadeDoacao;
        this.tipoDoacao = tipoDoacao;
    }

    public HistoricoDoacoes() {
    }

    public Date getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(Date dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public double getValorDoacao() {
        return valorDoacao;
    }

    public void setValorDoacao(double valorDoacao) {
        this.valorDoacao = valorDoacao;
    }

    public int getQuantidadeDoacao() {
        return quantidadeDoacao;
    }

    public void setQuantidadeDoacao(int quantidadeDoacao) {
        this.quantidadeDoacao = quantidadeDoacao;
    }

    public TipoDoacao getTipoDoacao() {
        return tipoDoacao;
    }

    public void setTipoDoacao(TipoDoacao tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }

    /**
     * Methodo que somar os valores de doações caso houver várias do mesmo tipo, no histórico
     * @author Turing
     */
    public void somarDoacoes(){

    }

    /**
     * Methodo que somar a quantidade de doações no histórico
     * @author Turing
     */
    public void quantidadeDoacoes(){

    }

    /**
     * Methodo para validar caso a doação seja efetivada e não houver erro no envio
     * @see TipoDoacao
     * @return true se a Doação foi válida
     * @author Turing
     */
    public boolean validarDoacao(){
        return true;
    }


}
