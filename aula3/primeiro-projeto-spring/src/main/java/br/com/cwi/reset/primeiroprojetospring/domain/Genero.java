package br.com.cwi.reset.primeiroprojetospring.domain;

public enum Genero {
    FEMININO("Feminino"),
    MASCULINO("Masculino"),
    NAO_BINARIO("Não Binário");

    private String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
