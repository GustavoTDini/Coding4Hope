package usuarios;


/**
 * Classe para definir os dados de doador, adiciona o endereço, por esta ser uma informação importante para esta classe
 * @see Usuario
 * @author Turing
 */
public class Doador extends Usuario{
    private Endereco endereco;

    public Doador(Endereco endereco) {
        super();
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
