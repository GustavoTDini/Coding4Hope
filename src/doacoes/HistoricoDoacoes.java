package doacoes;

import java.util.Date;

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

    public void somarDoacçoes(){

    }

    public void quantidadeDoacoes(){

    }

    public boolean validarDoacao(){
        return true;
    }


}
