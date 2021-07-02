package br.com.meli.day1.Exercicio8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = null, output = null;
        int count = 0;
        float value = 0f, total=0f;
         
        Product[] products = new Product[3];

        Scanner s = new Scanner(System.in);
        
        for (int i=0;i<3;i++) {

            System.out.println("Insira o nome do produto: ");
            name = s.next();
            System.out.println("Insira o valor do produto: ");
            value = s.nextFloat();
            System.out.println("Insira a quatidade dos produtos: ");
            count = s.nextInt();

            products[i] = new Product(name,value,count);

            output += "\nProduto:\n"+products[i].getName()+"\nValor do produto: "+products[i].getValue()+"\n Quantidade: " + products[i].getCount() + "\n\n" ;

            total += products[i].getValue() * products[i].getCount();

        }

        System.out.println(output);
        System.out.println("Valor dos pordutos: " + total);

    }
    
}
