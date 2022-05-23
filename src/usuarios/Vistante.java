package usuarios;

/**
 * Classe basica para personalizar a experiência de um visitante no site
 * @author Turing
 */
public class Vistante {

    private String nome;

    public Vistante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Methodo opara definir o idioma mostrado no site
     * @author Turing
     */
    public void definirIdioma(){
        // set Idioma no FrontEnd
    }
}
