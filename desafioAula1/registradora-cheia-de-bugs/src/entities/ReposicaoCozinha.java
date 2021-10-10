package entities;

import enums.Produtos;

public class ReposicaoCozinha {

    static void reporItem(String item) {

        if(DataProjeto.cozinhaEmFuncionamento()){
            if (Produtos.PAO.getDecricao().equals(item)) {
                System.out.println("fez mais 60 pães");
                Estoque.setPaes(Estoque.getPaes() + Produtos.PAO.getEstoqueInicial());
            }
            if (Produtos.FATIAS_TORTA.getDecricao().equals(item)) {
                System.out.println("fez mais 64 fatidas de tortas");
                Estoque.setFatiasTorta(Estoque.getFatiasTorta() + Produtos.FATIAS_TORTA.getEstoqueInicial());
            }
            if (Produtos.SANDUICHE.getDecricao().equals(item)) {
                System.out.println("fez mais 20 sandubas");
                Estoque.setSanduiche(Estoque.getSanduiche() + Produtos.SANDUICHE.getEstoqueInicial());
            }
        }
    }
}
