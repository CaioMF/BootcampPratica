package br.com.meli.day1.Exercicio7;

public class Main {
    
    public static void main(String[] args) {

        Company c1 = new Company("Empresa X", "01/01/2021", 1130000, 1.48f);
        Company c2 = new Company("Empresa Y", "01/01/2021", 18400000, 0.32f);

        int c1Value = 0;
        int c2Value = 0;

        while(c1Value<=c2Value){

            c1Value = c1.getValue();
            c2Value = c2.getValue();

            c1.setValue( c1Value += c1Value * c1.getTaxUp());
            c2.setValue( c2Value += c2Value * c2.getTaxUp());

            c1.upDate();
            c2.upDate();

            System.out.println(c1.getName() + " " + c1.getDate() + " Valor da empresa: " + String.format("%.2f",(float) c1Value / 1000000) + "m");
            System.out.println(c2.getName() + " " + c2.getDate() + " Valor da empresa: " + String.format("%.2f",(float) c2Value / 1000000) + "m\n");
            
        }
        
    }

}
