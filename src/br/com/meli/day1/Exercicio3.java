package br.com.meli.day1;

import java.util.Scanner;

public class Exercicio3{


    public static void main(String[] args){

            int n = 0;

            String res = "É primo";

            System.out.println("Por favor digite um numero:");

            Scanner s = new Scanner(System.in);

            n = s.nextInt();

            s = null;

            for(int i=2; i<n; i++){

                if(n%i == 0){
                    res = "Não é primo";
                    break;
                }
                
            }

            System.out.println(res);

    }


}