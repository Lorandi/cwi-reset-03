package entities;

import enums.Produtos;
import exception.BusinessException;
import java.util.Arrays;

public class Pedido {
    Integer quantidade;
    Produtos produto;
    String item;

    public Pedido() {
    }


    String[] produtos = {"paes", "sanduiche",  "fatiasTorta","leite","cafe" };

    public Pedido(Produtos produto, Integer quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    //    public Pedido(String item, Integer quantidade) {
//
//        if (quantidade < 0) {
//            throw new BusinessException("Erro nos dados: quantidade de itens deve ser maior que zero");
//        }
//
//        if (Arrays.asList(produtos).indexOf(item) == -1) {
//            throw new BusinessException("Erro nos dados: produto não cadastrado");
//        }
//        this.item = item;
//        this.quantidade = quantidade;
//    }

    public static double registrarItem(Produtos produto, int quantidade) {

        System.out.println("Pedido:");
        System.out.println("Horário: " +  DataProjeto.getHora() + ":" + DataProjeto.getMinuto());
        System.out.println("Item: " + produto.getDecricao());
        System.out.println("Quantidade: " + quantidade);

        double precoItem = RelacaoPesoPreco.retornaPrecoProduto(produto.getDecricao(), quantidade);

        if (QuantidadeMinimaItem.precisaReposicao(produto.getDecricao())) {
            if ("paes".equals(produto.getDecricao()) || "sanduiche".equals(produto.getDecricao()) || "fatiasTorta".equals(produto.getDecricao())) {

                ReposicaoCozinha.reporItem(produto.getDecricao());
            }

            if ("leite".equals(produto.getDecricao()) || "cafe".equals(produto.getDecricao())) {
                ReposicaoFornecedor.reporItem(produto.getDecricao());
            }
        }
        return precoItem;
    }

    @Override
    public String toString() {
        return String.format("Valor total: %.2f", registrarItem(produto, quantidade)) + "\n"
                + pedidoFinalizado();

    }

    private static String pedidoFinalizado(){
        return "\n"
                + Estoque.showEstoque() + "\n"
                + "------ Pedido finalizado ------" + "\n";

    }
}
