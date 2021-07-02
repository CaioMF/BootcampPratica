package br.com.meli.day1;

import java.util.Arrays;
import java.util.Collections;
public class Exercicio6 {

    public static void main(String[] args) {

        Integer[] array = new Integer [] {52, 10, 85, 1324, 01, 13, 62, 30, 12 , 127};

        Arrays.sort(array);

        System.out.println("Ordenado crescente: " + Arrays.toString(array));

        Arrays.sort(array,Collections.reverseOrder());
        
        System.out.println("Ordenado decrescente: " + Arrays.toString(array));

    }
    
}
