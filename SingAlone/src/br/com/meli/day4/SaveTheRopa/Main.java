package br.com.meli.day4.SaveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Closet c = new Closet();

        List<Clothing> l1 = new ArrayList<>();

        l1.add(new Clothing("Lacrost","Vermelha"));
        l1.add(new Clothing("Lacrost","Branca"));
        l1.add(new Clothing("Lacrost","Preta"));

        List<Clothing> l2 = new ArrayList<>();

        l2.add(new Clothing("Calvin Klein","Vermelha"));
        l2.add(new Clothing("Calvin Klein","Branca"));
        l2.add(new Clothing("Calvin Klein","Preta"));

        int c1 = c.saveClothing(l1);
        int c2 = c.saveClothing(l2);

        c.showClothing();

        System.out.println(c.getClothing(c1).toString());


    }

}
