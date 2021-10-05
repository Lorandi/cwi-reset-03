package br.com.cwi.reset.projeto1;

import java.util.ArrayList;
import java.util.Arrays;
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

    public List<Integer> ordenarLista(List<Integer> numeros) {

//        int temp;
//        int[] arrayInt = new int[numeros.size()];
//
//        for (int i = 0; i < numeros.size() ; i++){
//            arrayInt[i] = (int)numeros.toArray()[i];
//        }
//
//        for(int j = 0; j < arrayInt.length; j++){
//            for (int k = 0; k < arrayInt.length; k++){
//                if (arrayInt[j] < arrayInt[k]){
//                    temp = arrayInt[k];
//                    arrayInt[k] = arrayInt[j];
//                    arrayInt[j] = temp;
//                }
//            }
//        }
//
//
//        for (int l = 0; l < arrayInt.length; l++){
//            System.out.println(arrayInt[l]);
//        }

        int temp = 0;

        for (int i = 0; i < (numeros.size() - i); i++) {
            for (int j = 0; j < (numeros.size() - i - 1); j++) {
                if (numeros.get(j) > numeros.get(j+1)) {
                    temp = numeros.get(j);
                    numeros.set(j,numeros.get(j+1));
                    numeros.set(j+1, temp);
                }
            }
        }
        return numeros;
//
    }
}

