public class ReposicaoCozinha {

    static void reporItem(String item) {
        if ("paes".equals(item)) {
            Estoque.paes = 3600;
        }
        if ("torta".equals(item)) {
            Estoque.torta = 4;
        }
        if ("sanduiche".equals(item)) {
            Estoque.sanduiche = 20;
        }
    }
}
