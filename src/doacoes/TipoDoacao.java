package doacoes;


/**
 * Classe basica para definir a forma de pagamento da doação, irá ser utilizado nas doações.
 * @author Turing
 */
public class TipoDoacao {

    private boolean pix;
    private boolean debito;
    private boolean credito;
    private boolean superLink;

    public TipoDoacao(boolean pix, boolean debito, boolean credito, boolean superLink) {
        this.pix = pix;
        this.debito = debito;
        this.credito = credito;
        this.superLink = superLink;
    }

    public TipoDoacao() {
    }

    public boolean isPix() {
        return pix;
    }

    public void setPix(boolean pix) {
        this.pix = pix;
    }

    public boolean isDebito() {
        return debito;
    }

    public void setDebito(boolean debito) {
        this.debito = debito;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public boolean isSuperLink() {
        return superLink;
    }

    public void setSuperLink(boolean superLink) {
        this.superLink = superLink;
    }

    /**
     * Methodo que utiliza o tipo da doação para fazer o envio de dados para pagamento
     * @author Turing
     */
    public void enviarDadosOperadora(){

    }
}
