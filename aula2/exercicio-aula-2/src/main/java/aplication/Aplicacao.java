package aplication;

import entities.*;

public class Aplicacao {
    public static void main(String[] args) {

        try{
            Diretor diretor1 = new Diretor("Steven Spilberg", "12/05/1980", 45, Genero.MASCULINO);
            Diretor diretor2 = new Diretor("Pedro Almodovar", "12/05/1980", 33, Genero.MASCULINO);
            Ator ator1 = new Ator("Tiririca", "12/05/1980", 12, Genero.MASCULINO);
            Ator ator2 = new Ator("Dona Florinca", "12/05/1980", 17, Genero.FEMININO);

            ator1.infos();
            ator2.infos();

            diretor1.infos();
            diretor2.infos();


            Filme filme1 = new Filme("Tubarão",
                    "Banhistas aprontam muitas confusões com peixe nervoso",
                    90,
                    1981,
                    9.0, diretor1);
            Filme filme2 = new Filme("Tudo sobre minha mãe",
                    "Problemas com a mami",
                    120,
                    2003,
                    5.0, diretor2);

            filme1.reproduzir();
            System.out.println();
            filme2.reproduzir();

        } catch (AvaliacaoForaDoPadraoException e){
            System.out.println(e.getMessage());
        }

    }
}
