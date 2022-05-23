package usuarios;


/**
 * Classe para definir o cadastro de doador de pessoa juridica, extende Doador e adiciona a informação de CNPJ,
 * para validar a questão tributária para a inclusão do CNPJ,
 * é necessário realizar a validação do mesmo atraves da função isCnpj.
 * @see Doador
 * @author Turing
 */
public class PessoaJuridica extends Doador{
    private String cnpj = "";

    public PessoaJuridica(Endereco endereco, String cnpj) {
        super(endereco);
        if (isCnpj(cnpj)){
            this.cnpj = cnpj;
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (isCnpj(cnpj)){
            this.cnpj = cnpj;
        }
    }

    /**
     * Methodo que irá validar a entrada de CNPJ, realizando o algoritmo disponivel do Governo, para este fim
     * @param cnpj String contendo o número do CNPJ
     * @return Retorna true se o CNPJ é valido
     * @author Turing
     */
    public boolean isCnpj(String cnpj) {

        /*A primeira validação será verificar se o cnpj fornecido é um que possui dígitos iguais ou se ele tem tamanho superior a 14*/
        if(cnpj.equals("00000000000000")||cnpj.equals("11111111111111")||cnpj.equals("22222222222222")||cnpj.equals("33333333333333")
                ||cnpj.equals("44444444444444")||cnpj.equals("55555555555555")||cnpj.equals("66666666666666")||cnpj.equals("77777777777777")
                ||cnpj.equals("88888888888888")||cnpj.equals("99999999999999")|| (cnpj.length()!=14)) {
            return false;
        }
		/*Agora verificaremos o calculo do 1º digito*/
        int valorCalculado = 0, peso;
        peso = 5;
        for (int i = 0; i < 12; i++) {
            valorCalculado += ((int)cnpj.charAt(i)) * peso;
            peso--;
            if (peso < 2){
                peso = 9;
            }
        }
        int resultado = valorCalculado % 11;
        if (resultado < 2){
            resultado = 0;
        } else {
            resultado = 11 - resultado % 11;
        }
        if (resultado != (int)cnpj.charAt(12)){
            return false;
        }

        /*Agora verificaremos o calculo do 2º digito*/
        valorCalculado = 0;
        peso = 6;
        for (int i = 0; i < 13; i++) {
            valorCalculado += ((int)cnpj.charAt(i)) * peso;
            peso--;
            if (peso < 2){
                peso = 9;
            }
        }
        resultado = valorCalculado % 11;
        if (resultado < 2){
            resultado = 0;
        } else {
            resultado = 11 - resultado % 11;
        }
        if (resultado != (int)cnpj.charAt(13)){
            return false;
        }

        return true;
    }


}
