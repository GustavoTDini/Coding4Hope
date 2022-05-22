package dashboards;

import java.util.Date;

public class RelatorioTransparencia {

    private Date dataDoacao;
    private double valorDoacaço;
    private int quantidadeDoacao;
    private String gastos;

    public RelatorioTransparencia(Date dataDoacao, double valorDoacaço, int quantidadeDoacao, String gastos) {
        this.dataDoacao = dataDoacao;
        this.valorDoacaço = valorDoacaço;
        this.quantidadeDoacao = quantidadeDoacao;
        this.gastos = gastos;
    }

    public Date getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(Date dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public double getValorDoacaço() {
        return valorDoacaço;
    }

    public void setValorDoacaço(double valorDoacaço) {
        this.valorDoacaço = valorDoacaço;
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
