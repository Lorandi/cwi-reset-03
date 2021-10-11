package aplication;

import entities.DataProjeto;
import entities.Pedido;
import enums.Produtos;
import exception.BusinessException;


public class Registradora {

    public static void main(String[] args) {

        try {
            primeiroBug();

            segundoBug();

            terceiroBug();

            quartoBug();

            quintoBug();

            sextoBug();
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void primeiroBug() {
        System.out.println("primeiroBug()");
        DataProjeto.criarDataComCozinhaFuncionando();

        Pedido pedido = new Pedido(Produtos.PAO,100);

        System.out.println(pedido.toString());
    }

    private static void segundoBug() {
        System.out.println("segundoBug()");
        DataProjeto.criarDataComCozinhaEncerradaMasComDiaUtil();

        Pedido pedido = new Pedido(Produtos.FATIAS_TORTA,10);

        System.out.println(pedido.toString());
    }

    private static void terceiroBug() {
        System.out.println("terceiroBug()");
        DataProjeto.criarDataComCozinhaFuncionando();

        Pedido pedido = new Pedido(Produtos.LEITE,40);

        System.out.println(pedido.toString());
    }

    private static void quartoBug() {
        System.out.println("quartoBug()");
        DataProjeto.criarDataComCozinhaFuncionando();
        // Cliente 1

        Pedido pedido = new Pedido(Produtos.SANDUICHE,20);

        System.out.println(pedido.toString());

        // Cliente 2

        Pedido pedido2 = new Pedido(Produtos.SANDUICHE,5);

        System.out.println(pedido2.toString());

    }

    private static void quintoBug() {
        System.out.println("quintoBug()");
        DataProjeto.criarDataComCozinhaEncerradaMasComDiaUtil();

        Pedido pedido = new Pedido(Produtos.PAO,1000);

        System.out.println(pedido.toString());

    }

    private static void sextoBug() {
        System.out.println("sextoBug()");
        DataProjeto.criarDataComCozinhaEncerradaSemDiaUtil();
        // Cliente 1

        Pedido pedido = new Pedido(Produtos.SANDUICHE,20);

        System.out.println(pedido.toString());

        // Cliente 2
        Pedido pedido2 = new Pedido(Produtos.SANDUICHE,5);

        System.out.println(pedido2.toString());

    }

}
