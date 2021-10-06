
public class Registradora {

    public static void main(String[] args) {
        primeiroBug();

        segundoBug();

        terceiroBug();

        quartoBug();

        quintoBug();

        sextoBug();
    }

    private static double registrarItem(String item, int quantidade) {

        System.out.println("Pedido:");
        System.out.println("Horário: " +  DataProjeto.getHora() + ":" + DataProjeto.getMinuto());
        System.out.println("Item: " + item);
        System.out.println("Quantidade: " + quantidade);

        double precoItem = RelacaoPesoPreco.retornaPrecoProduto(item, quantidade);

        if (QuantidadeMinimaItem.precisaReposicao(item)) {
            if ("paes".equals(item) || "sanduiche".equals(item) || "fatiasTorta".equals(item)) {
                if (!DataProjeto.cozinhaEmFuncionamento()) {
                    System.out.println("Cozinha fechada!");
                }
                ReposicaoCozinha.reporItem(item);
            }

            if ("leite".equals(item) || "cafe".equals(item)) {
                ReposicaoFornecedor.reporItem(item);
            }
        }
        return precoItem;
    }

    private static void primeiroBug() {
        System.out.println("primeiroBug()");
        DataProjeto.criarDataComCozinhaFuncionando();
        String item = "sanduiche";
        int quantidade = 4;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
        pedidoFinalizado();
    }

    private static void segundoBug() {
        System.out.println("segundoBug()");
        DataProjeto.criarDataComCozinhaEncerradaMasComDiaUtil();
        String item = "fatiasTorta";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
        pedidoFinalizado();

    }

    private static void terceiroBug() {
        System.out.println("terceiroBug()");
        DataProjeto.criarDataComCozinhaFuncionando();
        String item = "cafe";
        int quantidade = 40;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
        pedidoFinalizado();
    }

    private static void quartoBug() {
        System.out.println("quartoBug()");
        DataProjeto.criarDataComCozinhaFuncionando();
        // Cliente 1
        String item = "sanduiche";
        int quantidade = 20;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
        pedidoFinalizado();


        // Cliente 2
        String item2 = "sanduiche";
        int quantidade2 = 5;

        double precoTotal2 = registrarItem(item2, quantidade2);

        System.out.println(String.format("Valor total: %.2f", precoTotal2));
        pedidoFinalizado();

    }

    private static void quintoBug() {
        System.out.println("quintoBug()");
        DataProjeto.criarDataComCozinhaFuncionando();
        String item = "paes";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
        pedidoFinalizado();

    }

    private static void sextoBug() {
        System.out.println("sextoBug()");
        DataProjeto.criarDataComCozinhaEncerradaSemDiaUtil();
        // Cliente 1
        String item = "sanduiche";
        int quantidade = 20;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
        pedidoFinalizado();

        // Cliente 2
        String item2 = "sanduiche";
        int quantidade2 = 5;

        double precoTotal2 = registrarItem(item2, quantidade2);

        System.out.println(String.format("Valor total: %.2f", precoTotal2));
        pedidoFinalizado();
    }

    private static void pedidoFinalizado(){
        System.out.println();
        System.out.println(Estoque.showEstoque());
        System.out.println("------ Pedido finalizado ------");
        System.out.println();
    }

}
