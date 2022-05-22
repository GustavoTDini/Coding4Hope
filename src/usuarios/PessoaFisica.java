package usuarios;

public class PessoaFisica extends Doador{
    private String cpf = "";

    public PessoaFisica(Endereco endereco, String cpf) {
        super(endereco);
        if (isCpf(cpf)){
            this.cpf = cpf;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (isCpf(cpf)){
            this.cpf = cpf;
        }
    }

    public boolean isCpf(String cpf) {
        /*A primeira validação será verificar se o cpf fornecido é um que possui dígitos iguais ou se ele tem tamanho superior a 11*/
        if(cpf.equals("00000000000")||cpf.equals("11111111111")||cpf.equals("22222222222")||cpf.equals("33333333333")
                ||cpf.equals("44444444444")||cpf.equals("55555555555")||cpf.equals("66666666666")||cpf.equals("77777777777")
                ||cpf.equals("88888888888")||cpf.equals("99999999999")|| (cpf.length()!=11)) {
            return false;
        }
		/*caso o CPF tenha passado no primeiro teste, vamos submeter ao teste do primeiro dígito. Para isso,
		vamos criar duas variáveis que auxiliarão no cálculo: a variável valor calculado, que verificará se o CPF é
		igual ao dígito verificador e a variável peso, que será usada nas multiplicações*/
        int valorCalculado=0, i, peso=10;

        for(i=0;i<9;i++) {
            //O looping rodará uma vez para cada um dos 9 dígitos relevantes ao cálculo
            //Cada dígito será convertido em inteiro, multiplicado pelo peso e acumulado em valorCalculado
            valorCalculado+= ((int)cpf.charAt(i)-48) * peso;
            //Atendendo ao cálculo, a cada volta o peso diminui
            peso--;
        }
        //A parte final do cálculo do primeiro dígito verificador é realizada
        valorCalculado = valorCalculado * 10 %11;
        if(valorCalculado==10) {
            valorCalculado=0;
        }
        //Se o cálculo dos 9 dígitos relevantes for diferente do dígito verificador, retorna-se false
        if(valorCalculado!=(cpf.charAt(9)-48)) {
            return false;
        }

        valorCalculado = 0;
        peso = 11;

        for(i=0;i<10;i++) {
            //O looping rodará uma vez para cada um dos 10 dígitos relevantes ao cálculo
            //Cada dígito será convertido em inteiro, multiplicado pelo peso e acumulado em valorCalculado
            valorCalculado+= ((int)cpf.charAt(i)-48) * peso;
            //Atendendo ao cálculo, a cada volta o peso diminui
            peso--;
        }
        valorCalculado = valorCalculado * 10 %11;
        if(valorCalculado==10) {
            valorCalculado=0;
        }
        //Se o cálculo dos 10 dígitos relevantes for diferente do 2º dígito verificador, retorna-se false
        if(valorCalculado!=(cpf.charAt(10)-48)) {
            return false;
        }

        //Caso nenhum dos returns anteriores tenha sido atingido, retorna-se verdadeiro
        return true;

    }
}
