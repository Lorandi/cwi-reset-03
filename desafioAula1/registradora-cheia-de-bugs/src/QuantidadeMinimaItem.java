public class QuantidadeMinimaItem {

    public static boolean precisaReposicao(String item) {
        if ("paes".equals(item)) {
            return Estoque.getPaes() < 10;
        }

        if ("fatiasTorta".equals(item)) {
            return Estoque.getFatiasTorta() < 10;
        }

        if ("sanduiche".equals(item)) {
            return Estoque.getSanduiche() <= 1;
        }

        if ("cafe".equals(item)) {
            return Estoque.getCafe() < 12;
        }

        if ("leite".equals(item)) {
            return Estoque.getLeite() < 12;
        }
        return false;
    }
}
