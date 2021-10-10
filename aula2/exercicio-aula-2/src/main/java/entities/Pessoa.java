package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class  Pessoa {
    private String nome;
    private String dataNacimento;
    private Genero genero;



    public Pessoa(String nome, String dataNacimento, Genero genero) {
        this.nome = nome;
        this.dataNacimento = dataNacimento;
        this.genero = genero;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate dateTime = LocalDate.parse(dataNacimento, formatter);
    }

    public void infos(){
        System.out.println("Nome: " + this.nome +"\n"
                + "Idade: " + this.dataNacimento+"\n"
                + "Gênero: " + this.genero.getDecricao() +"\n") ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
