package aplication;

import entities.DataProjeto;
import entities.Pedido;
import exception.BusinessException;


public class Registradora {

    public static void main(String[] args) {

        try {
            primeiroBug();

//            segundoBug();
//
//            terceiroBug();
//
//            quartoBug();
//
//            quintoBug();
//
//            sextoBug();
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void primeiroBug() {
        System.out.println("primeiroBug()");
        DataProjeto.criarDataComCozinhaFuncionando();

        Pedido pedido = new Pedido("sanduiche",0);

        System.out.println(pedido.toString());
    }

    private static void segundoBug() {
        System.out.println("segundoBug()");
        DataProjeto.criarDataComCozinhaEncerradaMasComDiaUtil();
//        entities.DataProjeto.criarDataComCozinhaFuncionando();
//        entities.DataProjeto.criarDataComCozinhaEncerradaSemDiaUtil();

        Pedido pedido = new Pedido("fatiasTorta",10);

        System.out.println(pedido.toString());
    }

    private static void terceiroBug() {
        System.out.println("terceiroBug()");
        DataProjeto.criarDataComCozinhaFuncionando();

        Pedido pedido = new Pedido("cafe",40);

        System.out.println(pedido.toString());
    }

    private static void quartoBug() {
        System.out.println("quartoBug()");
        DataProjeto.criarDataComCozinhaFuncionando();
        // Cliente 1

        Pedido pedido = new Pedido("sanduiche",20);

        System.out.println(pedido.toString());

        // Cliente 2

        Pedido pedido2 = new Pedido("sanduiche",5);

        System.out.println(pedido2.toString());

    }

    private static void quintoBug() {
        System.out.println("quintoBug()");
        DataProjeto.criarDataComCozinhaFuncionando();

        Pedido pedido = new Pedido("paes",10);

        System.out.println(pedido.toString());

    }

    private static void sextoBug() {
        System.out.println("sextoBug()");
        DataProjeto.criarDataComCozinhaEncerradaSemDiaUtil();
        // Cliente 1

        Pedido pedido = new Pedido("sanduiche",20);

        System.out.println(pedido.toString());


        // Cliente 2
        Pedido pedido2 = new Pedido("sanduiche",5);

        System.out.println(pedido2.toString());

    }

}
