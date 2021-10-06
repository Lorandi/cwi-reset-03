import java.util.Random;

public class ReposicaoFornecedor {

    static void reporItem(String item) {
        Random random = new Random();

        if ("leite".equals(item)) {
            Estoque.setLeite(random.nextInt(40) + 10);
        }

        if ("cafe".equals(item)) {
            Estoque.setCafe(random.nextInt(40) + 10);
        }
    }
}
