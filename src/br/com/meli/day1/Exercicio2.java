package br.com.meli.day1;

import java.util.Scanner;

public class Exercicio2{


    public static void main(String[] args){

            int n = 0, m = 0;

            System.out.println("Por favor digite um numero:");

            Scanner s = new Scanner(System.in);

            n = s.nextInt();

            System.out.println("Por favor digite outro numero:");

            m = s.nextInt();

            s=null;

            for(int i=1; i<=n; i++){
                if(i%m == 0){
                    System.out.println(i);
                }
                
            }

    }


}