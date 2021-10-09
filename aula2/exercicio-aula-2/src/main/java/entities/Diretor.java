package entities;

public class Diretor extends Pessoa{
    private Integer quantidadeFilmes;

    public Diretor(String nome, Integer idade, Integer quantidadeFilmes, Genero genero) {
        super(nome, idade, genero);
        this.quantidadeFilmes = quantidadeFilmes;
    }

    public Integer getQuantidadeFilmes() {
        return quantidadeFilmes;
    }

    public void setQuantidadeFilmes(Integer quantidadeFilmes) {
        this.quantidadeFilmes = quantidadeFilmes;
    }
}
