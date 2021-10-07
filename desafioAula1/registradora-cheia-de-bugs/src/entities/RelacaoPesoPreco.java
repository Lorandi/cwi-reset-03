package entities;

public class RelacaoPesoPreco {

    public static double retornaPrecoProduto(String item, int qtd) {
        double precoTotal = 0;

        if ("paes".equals(item)) {
            if (Estoque.getPaes() >= qtd * 60) {
                precoTotal = qtd * (12.75 * 60 / 1000);
                Estoque.setPaes(Estoque.getPaes() - qtd * 60);
            } else if(DataProjeto.cozinhaEmFuncionamento()){
                while (Estoque.getPaes() < qtd * 60) {
                    ReposicaoCozinha.reporItem("paes");
                }
                precoTotal = qtd * (12.75 * 60 / 1000);
                Estoque.setPaes(Estoque.getPaes() - qtd * 60);
            } else {
                System.out.println("Estoque insuficiente: " + Estoque.getPaes() / 60  + " unidade de pães");
            }
        }

        if ("fatiasTorta".equals(item)) {
            if (Estoque.getFatiasTorta() >= qtd) {
                precoTotal = 4.5 * qtd;
                Estoque.setFatiasTorta(Estoque.getFatiasTorta() - qtd);
            } else if (DataProjeto.cozinhaEmFuncionamento()) {
                while (Estoque.getFatiasTorta() < qtd) {
                    ReposicaoCozinha.reporItem("fatiasTorta");
                }
                precoTotal = 4.5 * qtd;
                Estoque.setFatiasTorta(Estoque.getFatiasTorta() - qtd);
            }else{
                System.out.println("Estoque insuficiente: " + Estoque.getFatiasTorta() + " fatias de torta");
            }
        }


        if ("leite".equals(item)) {
            precoTotal = 4.48 * qtd;
            Estoque.setLeite(Estoque.getLeite() - qtd);
            while(Estoque.getLeite() < 0){
                ReposicaoFornecedor.reporItem(item);
            }
        }

        if ("cafe".equals(item)) {
            precoTotal = 9.56 * qtd;
            Estoque.setCafe(Estoque.getCafe() - qtd);
            while(Estoque.getCafe() < 0){
                ReposicaoFornecedor.reporItem(item);
            }
        }

        if ("sanduiche".equals(item)) {
            if (Estoque.getSanduiche() >= qtd) {
                precoTotal = 4.5 * qtd;
                Estoque.setSanduiche(Estoque.getSanduiche() - qtd);
            } else if (DataProjeto.cozinhaEmFuncionamento()) {
                while (Estoque.getSanduiche() < qtd) {
                    ReposicaoCozinha.reporItem("sanduiche");
                }
                precoTotal = 4.5 * qtd;
                Estoque.setSanduiche(Estoque.getSanduiche() - qtd);
            }else{
                System.out.println("Estoque insuficiente: " + Estoque.getSanduiche() + " sanduiches");
            }
        }
        return precoTotal;
    }
}
