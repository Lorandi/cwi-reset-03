package entities;

import enums.Produtos;
import exception.BusinessException;

public class Pedido {
    Produtos produto;
    Integer quantidade;


    public Pedido(Produtos produto, Integer quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public static double registrarItem(Produtos produto, int quantidade) {

        int estoque = 0;
        int pedido = 0;


        if (quantidade < 0) {
            throw new BusinessException("Erro de dados : quantidade deve ser maior que zero");
        }

        if (produto == Produtos.PAO) {
            estoque = Estoque.getPaes();
        }

        if (produto == Produtos.SANDUICHE) {
            estoque = Estoque.getSanduiche();
        }

        if (produto == Produtos.FATIAS_TORTA) {
            estoque = Estoque.getFatiasTorta();
        }


        boolean produtoDependeDaCozinha = produto == Produtos.PAO || produto == Produtos.FATIAS_TORTA || produto == Produtos.SANDUICHE;
        boolean cozinhaFuncionando = DataProjeto.cozinhaEmFuncionamento();


        System.out.println("Pedido:");
        System.out.println("Horário: " + DataProjeto.getHora() + ":" + DataProjeto.getMinuto());
        System.out.println("Item: " + produto.getDecricao());
        System.out.println("Quantidade: " + quantidade);

        double valorTotal = produto.getValor() * quantidade;


        if(quantidade > estoque){
            if (produtoDependeDaCozinha && !cozinhaFuncionando) {
                System.out.println("Cozinha fechada!");
                System.out.println(String.format("Estoque insuficiente de %s com %d unidades", produto.getDecricao(), estoque));
                return 0.0;
            } else {
                Estoque.atualizaEstoque(produto, quantidade);
                return valorTotal;
            }
        } else{
            Estoque.atualizaEstoque(produto, quantidade);
            return valorTotal;
        }

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
