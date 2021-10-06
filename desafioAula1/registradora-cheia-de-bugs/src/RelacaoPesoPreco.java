public class RelacaoPesoPreco {

    public static double retornaPrecoProduto(String item, int qtd) {
        double precoTotal = 0;

        if ("paes".equals(item)) {
            precoTotal = qtd * 0.765;
            Estoque.setPaes(Estoque.getPaes() - qtd);
        }

        if ("fatiasTorta".equals(item)) {
            precoTotal = 6 * qtd;
            Estoque.setFatiasTorta(Estoque.getFatiasTorta() - qtd);
        }

        if ("leite".equals(item)) {
            precoTotal = 4.48 * qtd;
            Estoque.setLeite(Estoque.getLeite() - qtd);
        }

        if ("cafe".equals(item)) {
            precoTotal = 9.56 * qtd;
            Estoque.setCafe(Estoque.getCafe() - qtd);
        }

        if ("sanduiche".equals(item)) {
            precoTotal = 4.5 * qtd;
            Estoque.setSanduiche(Estoque.getSanduiche() - qtd);
        }
        return precoTotal;
    }
}
