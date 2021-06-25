package br.com.meli.day1;

import java.util.Scanner;

public class Exercicio5{


    public static void main(String[] args){

        int n = 0, m = 0, count=0;

        String  d = "0";
        System.out.print("Por favor digite um numero:");

        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        System.out.print("Por favor digite um numero:");

        m = s.nextInt();

        System.out.print("Por favor digite um numero:");

        d = String.valueOf(s.nextInt());

        s = null;

        do{

            count++;
            
            int quali = 0;

            char[] cArray = String.valueOf(count).toCharArray();

            for(char c : cArray) {
                
                if(String.valueOf(c).equals(d)){
                    quali++;
                }

            }
            

            if(quali == m){
                System.out.print(count + " ");
                n--;
            }

        }while(n!=0);   

    }


}