package entities;

public enum Genero {
    FEMININO("Feminino"),
    MASCULINO("Masculino"),
    NAO_BINARIO("Não Binário");

    private String decricao;

    Genero(String decricao) {
        this.decricao = decricao;
    }

    public String getDecricao() {
        return decricao;
    }
}
