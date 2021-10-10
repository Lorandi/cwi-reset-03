package enums;

public enum Produtos {
    PAO("Pãe", 0.765, 60, 10),
    FATIAS_TORTA("Fatias de torta", 4.5, 64, 10),
    SANDUICHE("Sanduiche", 4.5, 20, 1),
    LEITE("Leite", 4.48, 20, 12),
    CAFE("Café", 9.56, 20, 12);


    Produtos(String decricao, Double valor, Integer estoqueInicial, Integer quantidadeMinima) {
        this.decricao = decricao;
        this.valor = valor;
        this.estoqueInicial = estoqueInicial;
        this.quantidadeMinima = quantidadeMinima;
    }

    private String decricao;
    private Double valor;
    private Integer estoqueInicial;
    private Integer quantidadeMinima;

    public String getDecricao() {
        return decricao;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getEstoqueInicial() {
        return estoqueInicial;
    }

    public Integer getQuantidadeMinima() {
        return quantidadeMinima;
    }
}
