package br.com.meli.day1;

import java.util.Scanner;

public class Exercicio1{


    public static void main(String[] args){

            int n = 0, p = 2;

            System.out.print("Por favor digite um numero:");

            Scanner s = new Scanner(System.in);

            n = s.nextInt();

            s=null;

            for(int i=0; i<n; i++){
                
                System.out.println(p);

                p = p+2;
                
            }

    }


}