package br.com.cwi.reset.primeiroprojetospring.domain;

import java.time.LocalDate;

public class Ator extends Pessoa {

    private Integer oscarVencidos;


    public Ator(String nome, LocalDate dataNacimento, Integer oscarVencidos, Genero genero) {
        super(nome, dataNacimento, genero);
        this.oscarVencidos = oscarVencidos;
    }

    public Integer getOscarVencidos() {
        return oscarVencidos;
    }

    public void setOscarVencidos(Integer oscarVencidos) {
        this.oscarVencidos = oscarVencidos;
    }

}
