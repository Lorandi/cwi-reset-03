import java.util.Random;

public class ReposicaoFornecedor {

    static void reporItem(String item) {
        Random random = new Random();

        if ("leite".equals(item)) {

            int compraLeite = random.nextInt(40) + 10;
            Estoque.setLeite(Estoque.getLeite() + compraLeite);
            System.out.println("Comprou mais " + compraLeite +  "leite");
        }

        if ("cafe".equals(item)) {
            int compraCafe = random.nextInt(40) + 10;
            Estoque.setCafe(Estoque.getCafe() + compraCafe);
            System.out.println("Comprou mais " + compraCafe +  " cafés");
        }
    }
}
