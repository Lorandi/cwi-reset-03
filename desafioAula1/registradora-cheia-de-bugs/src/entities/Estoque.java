package entities;

import enums.Produtos;

public class Estoque {

    private static int paes = Produtos.PAO.getEstoqueInicial();
    private static int fatiasTorta = Produtos.FATIAS_TORTA.getEstoqueInicial();
    ;
    private static int sanduiche = Produtos.SANDUICHE.getEstoqueInicial();
    ;
    private static int leite = Produtos.LEITE.getEstoqueInicial();
    ;
    private static int cafe = Produtos.CAFE.getEstoqueInicial();
    ;

    public static int getPaes() {
        return paes;
    }

    public static void setPaes(int paes) {
        Estoque.paes = paes;
    }

    public static int getFatiasTorta() {
        return fatiasTorta;
    }

    public static void setFatiasTorta(int fatiasTorta) {
        Estoque.fatiasTorta = fatiasTorta;
    }

    public static int getSanduiche() {
        return sanduiche;
    }

    public static void setSanduiche(int sanduiche) {
        Estoque.sanduiche = sanduiche;
    }

    public static int getLeite() {
        return leite;
    }

    public static void setLeite(int leite) {
        Estoque.leite = leite;
    }

    public static int getCafe() {
        return cafe;
    }

    public static void setCafe(int cafe) {
        Estoque.cafe = cafe;
    }

    public static String showEstoque() {
        return "Estoque: " + "\n"
                + "Pães: " + getPaes() + " unidades" + "\n"
                + "Fatias de torta: " + getFatiasTorta() + "\n"
                + "Sanduiche:  " + getSanduiche() + "\n"
                + "Leite: " + getLeite() + "\n"
                + "Café: " + getCafe() + "\n";
    }



    public static void atualizaEstoque(Produtos produto, Integer quantidade) {
        if (produto == Produtos.PAO) {
            Estoque.setPaes(Estoque.getPaes() - quantidade);

            if (DataProjeto.cozinhaEmFuncionamento()) {
                while (Estoque.getPaes() < produto.getQuantidadeMinima()) {
                    ReposicaoCozinha.reporProduto(produto);
                }
            }
        }

        if (produto == Produtos.FATIAS_TORTA) {
            Estoque.setFatiasTorta(Estoque.getFatiasTorta() - quantidade);

            if (DataProjeto.cozinhaEmFuncionamento()) {
                while (Estoque.getFatiasTorta() < produto.getQuantidadeMinima()) {
                    ReposicaoCozinha.reporProduto(produto);
                }
            }
        }

        if (produto == Produtos.SANDUICHE) {
            Estoque.setSanduiche(Estoque.getSanduiche() - quantidade);

            if (DataProjeto.cozinhaEmFuncionamento()) {
                while (Estoque.getSanduiche() < produto.getQuantidadeMinima()) {
                    ReposicaoCozinha.reporProduto(produto);
                }
            }
        }

        if (produto == Produtos.LEITE) {
            Estoque.setLeite(Estoque.getLeite() - quantidade);
            while (Estoque.getLeite() < produto.getQuantidadeMinima()) {
                ReposicaoFornecedor.reporProduto(produto);
            }
        }

        if (produto == Produtos.CAFE) {
            Estoque.setCafe(Estoque.getCafe() - quantidade);
            while (Estoque.getCafe() < produto.getQuantidadeMinima()) {
                ReposicaoFornecedor.reporProduto(produto);
            }
        }
    }
}
