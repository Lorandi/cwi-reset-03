package entities;

public class Ator extends Pessoa {

    private Integer oscarVencidos;


    public Ator(String nome, Integer idade, Integer oscarVencidos, Genero genero) {
        super(nome, idade, genero);
        this.oscarVencidos = oscarVencidos;
    }

    public Integer getOscarVencidos() {
        return oscarVencidos;
    }

    public void setOscarVencidos(Integer oscarVencidos) {
        this.oscarVencidos = oscarVencidos;
    }
}
