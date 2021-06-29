package br.com.meli.day3.People;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Previous<People> arr[] = new People[5];

        arr[0] = new People("Caio","000000000");
        arr[1] = new People("Max","000000001");
        arr[2] = new People("Gonçalves","000000002");
        arr[3] = new People("Fagundes","000000003");
        arr[4] = new People("Trindade","000000004");

        SortUtil.sort(arr);

        System.out.println(Arrays.toString(arr));

        Previous<Cell> arrCell[] = new Cell[3];

        arrCell[0] = new Cell("999999999",(People) arr[1]);
        arrCell[1] = new Cell("111111111",(People) arr[2]);
        arrCell[2] = new Cell("777777777",(People) arr[4]);

        SortUtil.sort(arrCell);

        System.out.println(Arrays.toString(arrCell));


    }
}
