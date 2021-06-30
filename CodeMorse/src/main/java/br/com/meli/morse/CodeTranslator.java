package br.com.meli.morse;

import java.util.Arrays;
import java.util.List;

public class CodeTranslator
{

    public static String translate(String s){

        char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?' };

        List<String> morse = Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--..");

        s = s.toUpperCase();

        String[] words = s.split("\\s{1,2}");;

        StringBuilder output = new StringBuilder();

        for (String word : words) {

            int index = morse.indexOf(word);

            if(word.equals("")){

                output.append(" ");

            }else if(index>=0){

                output.append(alphabet[index]);

            }

        }

        return output.toString();

    }

}
