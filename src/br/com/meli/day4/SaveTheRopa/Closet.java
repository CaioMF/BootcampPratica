package br.com.meli.day4.SaveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Closet {

    private int count;
    private Map<Integer, List<Clothing>> dictionary;

    public Closet() {
        this.count = 0;
        this.dictionary = new HashMap<>();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int saveClothing(List<Clothing> l){

        dictionary.put(count,l);
        return this.count++;

    }

    public void showClothing(){
        dictionary.forEach((k,v) -> System.out.println("Key :" + k +", Value: " + v.toString()));
    }

    public List<Clothing> getClothing(Integer i){
        return dictionary.get(i);
    }


}
