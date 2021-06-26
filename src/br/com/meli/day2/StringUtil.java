package br.com.meli.day2;

public class StringUtil {


    public static String rPad (String s, char c, int n){

        s = s + String.valueOf(c).repeat(Math.max(0, n));

        return s;

    }


    public static String lTrim (String s){

        char[] c = s.toCharArray();
        int i;

        for (i = 0; i < c.length; i++ ){
            if(c[i] != ' '){
                break;
            }
        }

        return s.substring(i);

    }

    public static String rTrim (String s){

        char[] c = s.toCharArray();
        int i;

        for (i = c.length -1; i >=0; i-- ){
            if(c[i] != ' ' ){
                break;
            }
        }

        return s.substring(0,i);

    }

    public static String trim (String s){

        char[] c = s.toCharArray();
        boolean iDone =true, jDone = true;
        int i = 0,j = c.length-1;

        while(iDone || jDone){

            if(c[j] == ' '){
                j--;
            }else{
                jDone = false;
            }
            if(c[i] == ' '){
                i++;
            }else {
                iDone = false;
            }

        }

        return s.substring(i,j+1);

    }

    public static int indexOfN (String s, char c, int n){

        int count = 0, index =0;

        for (char o: s.toCharArray()) {

            index++;

            if( o == c){
                count++;
            }else {
                continue;
            }

            if(count == n){
                return index-1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        System.out.println(rPad("macaco",'c',2));

    }


}
