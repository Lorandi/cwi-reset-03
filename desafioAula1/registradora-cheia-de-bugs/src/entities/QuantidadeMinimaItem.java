package entities;

import enums.Produtos;

public class QuantidadeMinimaItem {

    public static boolean precisaReposicao(String item) {
        if (Produtos.PAO.getDecricao().equals(item)) {
            return Estoque.getPaes() < Produtos.PAO.getQuantidadeMinima();
//
        }

        if (Produtos.FATIAS_TORTA.getDecricao().equals(item)) {
            return Estoque.getFatiasTorta() < Produtos.FATIAS_TORTA.getQuantidadeMinima();
        }

        if (Produtos.SANDUICHE.getDecricao().equals(item)) {
            return Estoque.getSanduiche() <= Produtos.SANDUICHE.getQuantidadeMinima();
        }

        if (Produtos.CAFE.getDecricao().equals(item)) {
            return Estoque.getCafe() < Produtos.CAFE.getQuantidadeMinima();
        }

        if (Produtos.LEITE.getDecricao().equals(item)) {
            return Estoque.getLeite() < Produtos.LEITE.getQuantidadeMinima();
        }
        return false;
    }
}
