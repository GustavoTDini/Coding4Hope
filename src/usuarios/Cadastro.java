package usuarios;

import java.util.Date;


/**
 * Classe para definir o cadastro extende usuario e utiliza os dados de entrada desta.
 * @see Usuario
 * @author Turing
 */
public class Cadastro extends Usuario{

    private String nome;
    private String email;
    private String nacionalidade;
    private Date dataNascimento;
    private char genero;
    private String idioma;

    public Cadastro() {
    }

    public Cadastro(String login, String senha, String nome, String email, String nacionalidade, Date dataNascimento, char genero, String idioma) {
        super(login, senha);
        this.nome = nome;
        this.email = email;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.idioma = idioma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
