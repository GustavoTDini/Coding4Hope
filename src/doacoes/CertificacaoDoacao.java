package doacoes;

/**
 * Classe que irá armazenar o certificado da doação para controle de historico e dedução de impostos
 * @author Turing
 */
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

    /**
     * Methodo irá tornar a certificação valida
     * @author Turing
     */
    public void certificar() {
        this.valido = true;
    }

    /**
     * Methodo irá emitir a certificação caso a mesma seja valida
     * @author Turing
     */
    public void emitir(){
        if (this.valido){
            //TODO validar
        }
    }
}
