package entities;

import enums.Produtos;

import java.util.Random;

public class ReposicaoFornecedor {

    static void reporProduto(Produtos produto) {
        Random random = new Random();

        if (produto == Produtos.LEITE) {
            int compraLeite = random.nextInt(40) + 10;
            Estoque.setLeite(Estoque.getLeite() + compraLeite);
            System.out.println("Comprou mais " + compraLeite +  " leites");
        }

        if (produto == Produtos.CAFE) {
            int compraCafe = random.nextInt(40) + 10;
            Estoque.setCafe(Estoque.getCafe() + compraCafe);
            System.out.println("Comprou mais " + compraCafe +  " cafés");
        }
    }
}
