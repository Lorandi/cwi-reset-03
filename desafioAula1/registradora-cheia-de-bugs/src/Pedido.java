public class Pedido {
    String item;
    Integer quantidade;

    public Pedido() {
    }

    public Pedido(String item, Integer quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    public static double registrarItem(String item, int quantidade) {

        System.out.println("Pedido:");
        System.out.println("Horário: " +  DataProjeto.getHora() + ":" + DataProjeto.getMinuto());
        System.out.println("Item: " + item);
        System.out.println("Quantidade: " + quantidade);

        double precoItem = RelacaoPesoPreco.retornaPrecoProduto(item, quantidade);

        if (QuantidadeMinimaItem.precisaReposicao(item)) {
            if ("paes".equals(item) || "sanduiche".equals(item) || "fatiasTorta".equals(item)) {
                if (!DataProjeto.cozinhaEmFuncionamento()) {
                    System.out.println("Cozinha fechada!");
                }
                ReposicaoCozinha.reporItem(item);
            }

            if ("leite".equals(item) || "cafe".equals(item)) {
                ReposicaoFornecedor.reporItem(item);
            }
        }
        return precoItem;
    }

    @Override
    public String toString() {
        return String.format("Valor total: %.2f", registrarItem(item, quantidade)) + "\n"
                + pedidoFinalizado();

    }

    private static String pedidoFinalizado(){
        return "\n"
                + Estoque.showEstoque() + "\n"
                + "------ Pedido finalizado ------" + "\n";

    }
}
