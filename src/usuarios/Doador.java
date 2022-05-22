package usuarios;

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
