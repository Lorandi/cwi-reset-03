package entities;

import enums.Produtos;
import exception.BusinessException;

import java.util.Arrays;

public class Pedido {
    Produtos produto;
    Integer quantidade;


    public Pedido(Produtos produto, Integer quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public static double registrarItem(Produtos produto, int quantidade) {

        int estoque = 0;
        int setEstoque = 0;


        if (quantidade < 0) {
            throw new BusinessException("Erro de dados : quantidade deve ser maior que zero");
        }

//        precoTotal = qtd * Produtos.PAO.getValor();
//                Estoque.setPaes(Estoque.getPaes() - qtd );

        if (produto == Produtos.SANDUICHE) {
            estoque = Estoque.getSanduiche();
            Estoque.setSanduiche(estoque - quantidade);
        }
        if (produto == Produtos.PAO) {
            estoque = Estoque.getPaes();
            Estoque.setPaes(estoque - quantidade);
        }

        if (produto == Produtos.FATIAS_TORTA) {
            estoque = Estoque.getFatiasTorta();
            Estoque.setFatiasTorta(estoque - quantidade);
        }


        boolean produtoDependeDaCozinha = produto == Produtos.PAO || produto == Produtos.FATIAS_TORTA || produto == Produtos.SANDUICHE;
        boolean cozinhaFuncionando = DataProjeto.cozinhaEmFuncionamento();
        boolean disponibilidade = estoque > quantidade;

        System.out.println("Pedido:");
        System.out.println("Horário: " + DataProjeto.getHora() + ":" + DataProjeto.getMinuto());
        System.out.println("Item: " + produto.getDecricao());
        System.out.println("Quantidade: " + quantidade);


        if(estoque < quantidade){
            if (produtoDependeDaCozinha && !cozinhaFuncionando) {
                System.out.println("Cozinha fechada!");
                System.out.println(String.format("Estoque insuficiente de %s com %d unidades", produto.getDecricao(), estoque));
            } else {
                if (produto == Produtos.LEITE || produto == Produtos.CAFE) {
                    ReposicaoFornecedor.reporItem(produto.getDecricao());
                }else{
                    ReposicaoCozinha.reporItem(produto.getDecricao());
                }
            }
        }



//        double precoItem = RelacaoPesoPreco.retornaPrecoProduto(produto.getDecricao(), quantidade);

        double valorTotal = produto.getValor() * quantidade;

        return valorTotal;
    }

    @Override
    public String toString() {
        return String.format("Valor total: %.2f", registrarItem(produto, quantidade)) + "\n"
                + pedidoFinalizado();

    }

    private static String pedidoFinalizado() {
        return "\n"
                + Estoque.showEstoque() + "\n"
                + "------ Pedido finalizado ------" + "\n";

    }
}
