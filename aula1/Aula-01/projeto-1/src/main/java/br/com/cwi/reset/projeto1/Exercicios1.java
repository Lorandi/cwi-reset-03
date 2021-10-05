package br.com.cwi.reset.projeto1;

import java.util.ArrayList;
import java.util.List;

public class Exercicios1 {

    public Integer somarLista(List<Integer> numeros) {
        int soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int calcularMedia(List<Integer> numeros) {

        int soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma / numeros.size();
    }

    public Integer obterMaiorNumero(List<Integer> numeros) {

        int maior = numeros.get(0);

        for (Integer numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    public String obterPalavraInvertida(String palavra) {

        String[] palavraTrocada = palavra.split("");

        String invertida = "";

        for(int i = 0; i < palavraTrocada.length; i++){
            String p = palavraTrocada[palavraTrocada.length - i - 1];
            invertida +=p;
        }
        return invertida;
    }
//
//    public List<Integer> ordenarLista(List<Integer> numeros) {
//        return Arrays.asList(1, 2, 3, 4, 5);
//    }
}

