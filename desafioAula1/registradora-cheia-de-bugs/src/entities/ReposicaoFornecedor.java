package entities;

import enums.Produtos;

import java.util.Random;

public class ReposicaoFornecedor {

    static void reporItem(String item) {
        Random random = new Random();

        if (Produtos.LEITE.getDecricao().equals(item)) {
            int compraLeite = random.nextInt(40) + 10;
            Estoque.setLeite(Estoque.getLeite() + compraLeite);
            System.out.println("Comprou mais " + compraLeite +  " leites");
        }

        if (Produtos.CAFE.getDecricao().equals(item)) {
            int compraCafe = random.nextInt(40) + 10;
            Estoque.setCafe(Estoque.getCafe() + compraCafe);
            System.out.println("Comprou mais " + compraCafe +  " cafés");
        }
    }
}
