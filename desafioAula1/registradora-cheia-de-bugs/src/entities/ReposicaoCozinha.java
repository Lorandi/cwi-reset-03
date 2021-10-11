package entities;

import enums.Produtos;

public class ReposicaoCozinha {

    static void reporItem(Produtos produto) {

        if(DataProjeto.cozinhaEmFuncionamento()){
            if (produto == Produtos.PAO) {
                System.out.println("fez mais 60 pães");
                Estoque.setPaes(Estoque.getPaes() + Produtos.PAO.getEstoqueInicial());
            }
            if (produto == Produtos.FATIAS_TORTA) {
                System.out.println("fez mais 64 fatidas de tortas");
                Estoque.setFatiasTorta(Estoque.getFatiasTorta() + Produtos.FATIAS_TORTA.getEstoqueInicial());
            }
            if (produto == Produtos.SANDUICHE) {
                System.out.println("fez mais 20 sandubas");
                Estoque.setSanduiche(Estoque.getSanduiche() + Produtos.SANDUICHE.getEstoqueInicial());
            }
        }
    }
}
