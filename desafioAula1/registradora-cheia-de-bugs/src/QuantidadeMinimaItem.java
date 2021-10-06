public class QuantidadeMinimaItem {

    public static boolean precisaReposicao(String item) {
        if ("paes".equals(item)) {
            return Estoque.paes < 10;
        }

        if ("fatiasTorta".equals(item)) {
            return Estoque.fatiasTorta < 10;
        }

        if ("sanduiche".equals(item)) {
            return Estoque.sanduiche == 1;
        }

        if ("cafe".equals(item)) {
            return Estoque.leite < 12;
        }

        if ("leite".equals(item)) {
            return Estoque.cafe < 12;
        }
        return false;
    }
}
