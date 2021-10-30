package br.com.cwi.reset.projeto1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicios1Test {
    Exercicios1 exercicios1 = new Exercicios1();
    @Test
    public void validarASomaComUmaListaDe5NumerosInteirosEPositivos() {
        // Arrange
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);


        Integer expected = 15;

        // Action
        Integer result = exercicios1.somarLista(numeros);

        // Assert
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void validarASomaComUmaListaDe4NumerosInteirosPositivosE1Negativo() {
        // Arrange
       List<Integer> numeros = Arrays.asList(-1,2,3,4,5);


        Integer expected = 13;

        // Action
        Integer result = exercicios1.somarLista(numeros);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void validarASomaComUmaListaDe3NumerosInteirosE1Negativos() {
        // Arrange

        List<Integer> numeros = Arrays.asList(-1,-2,-3);
        Integer expected = -6;

        // Action
        Integer result = exercicios1.somarLista(numeros);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void validarASomaComUmaListaDeZeros() {
        // Arrange

        List<Integer> numeros = Arrays.asList(0,0,0,0,0);
        Integer expected = 0;

        // Action
        Integer result = exercicios1.somarLista(numeros);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void validarASomaComUmaListaVaziz() {
        // Arrange
        Exercicios1 exercicios1 = new Exercicios1();
        List<Integer> numeros = new ArrayList<>();

        // Action
        Throwable exception = Assertions.assertThrows(ArithmeticException.class, () -> exercicios1.somarLista(numeros));
        Assertions.assertEquals("Erro matemático", exception.getMessage());
    }

    @Test
    public void validarAMediaComUmaListaDe5NumerosInteirosEPositivos() {
        // Arrange
        List<Integer> numeros = Arrays.asList(10, 10, 10, 10, 10);


        Double expected = 10.0;

        // Action
        Double result = exercicios1.calcularMedia(numeros);

        // Assert
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void validarAMediaComUmaListaDe4NumerosInteirosPositivosE1Negativo() {
        // Arrange
        List<Integer> numeros = Arrays.asList(-1,2,3,4,5);


        Double expected = 2.6;

        // Action
        Double result = exercicios1.calcularMedia(numeros);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void validarAMediaComUmaListaDe3NumerosInteirosE1Negativos() {
        // Arrange

        List<Integer> numeros = Arrays.asList(-1,-2,-3);

        Double expected = -2.0;

        // Action
        Double result = exercicios1.calcularMedia(numeros);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void validarAMediaComUmaListaDeZeros() {
        // Arrange

        List<Integer> numeros = Arrays.asList(0,0,0,0,0);
        Double expected = 0.0;

        // Action
        Double result = exercicios1.calcularMedia(numeros);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void validarAMediaComUmaListaVaziz() {
        // Arrange
        Exercicios1 exercicios1 = new Exercicios1();
        List<Integer> numeros = new ArrayList<>();

        // Action
        Throwable exception = Assertions.assertThrows(ArithmeticException.class, () -> exercicios1.calcularMedia(numeros));
        Assertions.assertEquals("Erro matemático", exception.getMessage());
    }

    @Test
    public void validarPalavraInvertida1() {
        // Arrange
        String palavra = "Abacate";
        String expected = "etacabA";


        // Action
        String result = exercicios1.obterPalavraInvertida(palavra);

        // Assert
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void validarPalavraInvertida2() {
        // Arrange
        String palavra = "Banana";
        String expected = "ananaB";

        // Action
        String result = exercicios1.obterPalavraInvertida(palavra);

        // Arrange
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void validarPalavraInvertida3() {
        // Arrange
        String palavra = "Pessego";
        String expected = "ogesseP";

        // Action
        String result = exercicios1.obterPalavraInvertida(palavra);

        // Arrange
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void validarPalavraInvertida4() {
        // Arrange
        String palavra = "Morango";
        String expected = "ognaroM";

        // Action
        String result = exercicios1.obterPalavraInvertida(palavra);

        // Arrange
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void validarOrdenarListaPositivos() {
        // Arrange
        List<Integer> list = Arrays.asList(4, 3, 7, 9, 2, 1);

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 7, 9);

        // Action
        List<Integer> result = exercicios1.ordenarLista(list);

        // Assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void validarOrdenarListaPositivosENegativos() {
        // Arrange
        List<Integer> list = Arrays.asList(7, 4, -3, 2, 1, -9);

        List<Integer> expected = Arrays.asList(-9, -3, 1, 2, 4, 7);

        // Action
        List<Integer> result = exercicios1.ordenarLista(list);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void validarOrdenarListaZeros() {
        // Arrange
        List<Integer> list = Arrays.asList(0,0,0,0,0);

        List<Integer> expected = Arrays.asList(0,0,0,0,0);

        // Action
        List<Integer> result = exercicios1.ordenarLista(list);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void validarOrdenarListaNull() {
        // Assert
        Assertions.assertThrows(NullPointerException.class, () -> exercicios1.ordenarLista(null));
    }
}
