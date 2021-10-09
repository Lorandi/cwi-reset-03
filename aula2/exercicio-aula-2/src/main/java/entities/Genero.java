package entities;

public enum Genero {
    FEMININO("Feminino"),
    MASCULINO("Masculino"),
    NAO_BINARIO("Não Binário");

    String decricao;

    Genero(String decricao) {
        this.decricao = decricao;
    }
}
