package aplication;

import entities.Diretor;
import entities.Filme;

public class Aplicacao {
    public static void main(String[] args) {
        Diretor diretor1 = new Diretor("Steven Spilberg", 74, 45);
        Diretor diretor2 = new Diretor("Pedro Almodovar", 72, 33);


        Filme filme1 = new Filme("Tubarão",
                "Banhistas aprontam muitas confusões com peixe nervoso",
                "90 minutos",
                1981,
                4, diretor1);
        Filme filme2 = new Filme("Tudo sobre minha mãe",
                "Problemas com a mami",
                "120 minutos",
                2003,
                5, diretor2);

        filme1.reproduzir();
        System.out.println();
        filme2.reproduzir();
    }
}
