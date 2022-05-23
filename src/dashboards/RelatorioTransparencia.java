package dashboards;

import java.util.Date;


public class RelatorioTransparencia {

    private Date dataDoacao;
    private double valorDoacao;
    private int quantidadeDoacao;
    private String gastos;

    public RelatorioTransparencia(Date dataDoacao, double valorDoacao, int quantidadeDoacao, String gastos) {
        this.dataDoacao = dataDoacao;
        this.valorDoacao = valorDoacao;
        this.quantidadeDoacao = quantidadeDoacao;
        this.gastos = gastos;
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

    public String getGastos() {
        return gastos;
    }

    public void setGastos(String gastos) {
        this.gastos = gastos;
    }

    public void somarDoacoes(){

    }

    public void somarQantidadeDoacoes(){

    }

    public void somarGastos(){

    }

}
