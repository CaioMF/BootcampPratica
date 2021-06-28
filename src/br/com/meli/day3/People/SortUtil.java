package br.com.meli.day3.People;

public class SortUtil{

    public static <T> void sort (Previous<T> arr[]){

        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].previousA(arr[j+1]) < 0)
                {

                    Previous<T> temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

    }

}
