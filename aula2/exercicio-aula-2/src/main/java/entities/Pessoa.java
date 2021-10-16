package entities;

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

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNacimento=" + dataNacimento +
                ", genero=" + genero +
                '}';
    }

}

