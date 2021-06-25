package br.com.meli.day1;

import java.util.Scanner;

public class Exercicio4 {


    public static void main(String[] args){

            int n = 0, p = 2, j=0;

            System.out.print("Por favor digite um numero:");

            Scanner s = new Scanner(System.in);

            n = s.nextInt();

            s = null;

            for(int i=0; i<n; i++){

                for(j=2; j<p; j++){

                    if(p%j == 0){
    
                        p++;
                        
                    }
                    
                }

                if(j == p){

                    System.out.println(p);

                    p++;

                }
                
            }

            

    }


}