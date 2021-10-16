package br.com.cwi.reset.primeiroprojetospring.domain;

import java.time.LocalDate;


public abstract class  Pessoa {
    private String nome;
    private LocalDate dataNacimento;
    private Genero genero;

    public Pessoa(String nome, LocalDate dataNacimento, Genero genero) {
        this.nome = nome;
        this.dataNacimento = dataNacimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNacimento=" + dataNacimento +
                ", genero=" + genero +
                '}';
    }

}

