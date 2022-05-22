package doacoes;

public class CertificacaoDoacao {

    private boolean valido;

    public CertificacaoDoacao(boolean valido) {
        this.valido = valido;
    }

    public CertificacaoDoacao() {
    }

    public boolean isValido() {
        return valido;
    }

    public void certificar(boolean valido) {
        this.valido = valido;
    }

    public void emitir(){

    }
}
