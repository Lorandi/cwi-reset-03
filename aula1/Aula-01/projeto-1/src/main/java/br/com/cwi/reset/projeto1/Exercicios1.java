package br.com.cwi.reset.projeto1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicios1 {

    public Integer somarLista(List<Integer> numeros) {
        Integer soma = 0;

        if(numeros.isEmpty()){
            throw new ArithmeticException("Erro matemático");
        }

        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public Double calcularMedia(List<Integer> numeros) {
        Double soma = 0.0;

        for (Integer numero : numeros) {
            soma += numero;
        }

        if(numeros.isEmpty()){
            throw new ArithmeticException("Erro matemático");
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

    public List<Integer> ordenarLista(List<Integer> numeros) {
        Integer[] ints = numeros.toArray(new Integer[numeros.size()]);
        Integer aux;
        for (int i = 0; i < numeros.size() - 1; i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (ints[j] < ints[i]) {
                    aux = ints[j];
                    ints[j] = ints[i];
                    ints[i] = aux;
                }
            }
        }
        return Arrays.asList(ints);

    }
}

