public class ReposicaoCozinha {

    static void reporItem(String item) {

        if(DataProjeto.cozinhaEmFuncionamento()){
            if ("paes".equals(item)) {
                System.out.println("fez mais 60 pão");
                Estoque.setPaes(Estoque.getPaes() + 60);
            }
            if ("torta".equals(item)) {
                System.out.println("fez mais 4 tortas");
                Estoque.setTorta(Estoque.getTorta() + 4);
            }
            if ("sanduiche".equals(item)) {
                System.out.println("fez mais 20 sandubas");
                Estoque.setSanduiche(Estoque.getSanduiche() + 20);
            }
        }
    }
}
