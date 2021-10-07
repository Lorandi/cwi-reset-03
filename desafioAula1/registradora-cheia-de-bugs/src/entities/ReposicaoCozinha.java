package entities;

public class ReposicaoCozinha {

    static void reporItem(String item) {

        if(DataProjeto.cozinhaEmFuncionamento()){
            if ("paes".equals(item)) {
                System.out.println("fez mais 60 pães");
                Estoque.setPaes(Estoque.getPaes() + 3600);
            }
            if ("fatiasTorta".equals(item)) {
                System.out.println("fez mais 4 tortas");
                Estoque.setFatiasTorta(Estoque.getFatiasTorta() + 64);
            }
            if ("sanduiche".equals(item)) {
                System.out.println("fez mais 20 sandubas");
                Estoque.setSanduiche(Estoque.getSanduiche() + 20);
            }
        }
    }
}
