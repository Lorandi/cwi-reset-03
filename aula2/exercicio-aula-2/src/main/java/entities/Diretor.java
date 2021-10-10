package entities;

import java.time.LocalDate;

public class Diretor extends Pessoa{
    private Integer quantidadeFilmes;

    public Diretor(String nome, LocalDate dataNacimento, Integer quantidadeFilmes, Genero genero) {
        super(nome, dataNacimento, genero);
        this.quantidadeFilmes = quantidadeFilmes;
    }

    public Integer getQuantidadeFilmes() {
        return quantidadeFilmes;
    }

    public void setQuantidadeFilmes(Integer quantidadeFilmes) {
        this.quantidadeFilmes = quantidadeFilmes;
    }
}
