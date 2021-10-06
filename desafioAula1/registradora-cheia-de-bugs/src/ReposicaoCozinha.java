public class ReposicaoCozinha {

    static void reporItem(String item) {
        if ("paes".equals(item)) {
            Estoque.setPaes(60);
        }
        if ("torta".equals(item)) {
            Estoque.setTorta(4);
        }
        if ("sanduiche".equals(item)) {
            Estoque.setSanduiche(20);
        }
    }
}
