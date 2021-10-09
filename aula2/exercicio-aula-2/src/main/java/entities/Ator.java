package entities;

public class Ator {
    private String nome;
    private Integer idade;
    private Integer oscarVencidos;
    private Genero genero;

    public Ator(String nome, Integer idade, Integer oscarVencidos, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.oscarVencidos = oscarVencidos;
        this.genero = genero;
    }

    public void infosAtor(){
        System.out.println("Nome: " + this.nome +"\n"
                + "Idade: " + this.idade+"\n"
                + "Gênero: " + this.genero.getDecricao() +"\n");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getOscarVencidos() {
        return oscarVencidos;
    }

    public void setOscarVencidos(Integer oscarVencidos) {
        this.oscarVencidos = oscarVencidos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
