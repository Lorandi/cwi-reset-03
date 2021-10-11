package entities;

import enums.Produtos;

//public class RelacaoPesoPreco {
//
//    public static double retornaPrecoProduto(String item, int qtd) {
//        double precoTotal = 0;
//
//        if (Produtos.PAO.getDecricao().equals(item)) {
//            if (Estoque.getPaes() >= qtd ) {
//                precoTotal = qtd * Produtos.PAO.getValor();
//                Estoque.setPaes(Estoque.getPaes() - qtd );
//            } else if(DataProjeto.cozinhaEmFuncionamento()){
//                while (Estoque.getPaes() < qtd ) {
//                    ReposicaoCozinha.reporItem(Produtos.PAO.getDecricao());
//                }
//                precoTotal = qtd * Produtos.PAO.getValor();
//                Estoque.setPaes(Estoque.getPaes() - qtd );;
//            } else {
//                System.out.println("Cozinha fechada!");
//                System.out.println("Estoque insuficiente: " + Estoque.getPaes()   + " unidade de pães");
//            }
//        }
//
//        if (Produtos.FATIAS_TORTA.getDecricao().equals(item)) {
//            if (Estoque.getFatiasTorta() >= qtd) {
//                precoTotal = Produtos.FATIAS_TORTA.getValor() * qtd;
//                Estoque.setFatiasTorta(Estoque.getFatiasTorta() - qtd);
//            } else if (DataProjeto.cozinhaEmFuncionamento()) {
//                while (Estoque.getFatiasTorta() < qtd) {
//                    ReposicaoCozinha.reporItem(Produtos.FATIAS_TORTA.getDecricao());
//                }
//                precoTotal = Produtos.FATIAS_TORTA.getValor() * qtd;
//                Estoque.setFatiasTorta(Estoque.getFatiasTorta() - qtd);
//            }else{
//                System.out.println("Cozinha fechada!");
//                System.out.println("Estoque insuficiente: " + Estoque.getFatiasTorta() + " fatias de torta");
//            }
//        }
//
//
//        if (Produtos.LEITE.getDecricao().equals(item)) {
//            precoTotal = Produtos.LEITE.getValor() * qtd;
//            Estoque.setLeite(Estoque.getLeite() - qtd);
//            while(Estoque.getLeite() < qtd){
//                ReposicaoFornecedor.reporItem(item);
//            }
//        }
//
//        if (Produtos.CAFE.getDecricao().equals(item)) {
//            precoTotal = Produtos.CAFE.getValor() * qtd;
//            Estoque.setCafe(Estoque.getCafe() - qtd);
//            while(Estoque.getCafe() < qtd){
//                ReposicaoFornecedor.reporItem(item);
//            }
//        }
//
//        if (Produtos.SANDUICHE.getDecricao().equals(item)) {
//            if (Estoque.getSanduiche() >= qtd) {
//                precoTotal = Produtos.SANDUICHE.getValor() * qtd;
//                Estoque.setSanduiche(Estoque.getSanduiche() - qtd);
//            } else if (DataProjeto.cozinhaEmFuncionamento()) {
//                while (Estoque.getSanduiche() < qtd) {
//                    ReposicaoCozinha.reporItem(Produtos.SANDUICHE.getDecricao());
//                }
//                precoTotal = Produtos.SANDUICHE.getValor() * qtd;
//                Estoque.setSanduiche(Estoque.getSanduiche() - qtd);
//            }else{
//                System.out.println("Cozinha fechada!");
//                System.out.println("Estoque insuficiente: " + Estoque.getSanduiche() + " sanduiches");
//            }
//        }
//        return precoTotal;
//    }
//}
