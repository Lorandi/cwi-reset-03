import java.util.Random;

public class ReposicaoFornecedor {

    static void reporItem(String item) {
        Random random = new Random();

        if ("leite".equals(item)) {
            Estoque.leite = random.nextInt(40) + 10;
        }

        if ("cafe".equals(item)) {
            Estoque.cafe = random.nextInt(40) + 10;
        }
    }
}
