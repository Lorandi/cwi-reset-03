package entities;

public class Diretor {
    private String nome;
    private Integer idade;
    private Integer quantidadeFilmes;
    private Genero genero;

    public Diretor(String nome, Integer idade, Integer quantidadeFilmes, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeFilmes = quantidadeFilmes;
        this.genero = genero;
    }

    public void infosDiretor(){
        System.out.println("Nome: " + this.nome +"\n"
                + "Idade: " + this.idade+"\n"
                + "Gênero: " + this.genero.getDecricao() +"\n") ;
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

    public Integer getQuantidadeFilmes() {
        return quantidadeFilmes;
    }

    public void setQuantidadeFilmes(Integer quantidadeFilmes) {
        this.quantidadeFilmes = quantidadeFilmes;
    }
}
