package br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

    public static int average(int[] elements) {
        int soma = 0;
        for (int element : elements) {
            soma += element;
        }
        return soma / (elements.length);

    }

    public static int mode(int[] elements) {
        int elementoComMaiorSoma = 0;
        int maiorSoma = 0;
        int somaDosElementos = 0;
        for (int i : elements) {
            for (int j : elements) {
                if (j == i) {
                    somaDosElementos += 1;
                }
                ;
            }
            if (somaDosElementos > maiorSoma) {
                maiorSoma = somaDosElementos;
                elementoComMaiorSoma = i;
            }
            somaDosElementos = 0;
        }
        return elementoComMaiorSoma;
    }

    public static int median(int[] elements) {
        Arrays.sort(elements);
        if (elements.length % 2 == 1) {
            return elements[elements.length / 2];
        }
        return (elements[elements.length / 2] + elements[elements.length / 2 - 1]) / 2;
    }
}