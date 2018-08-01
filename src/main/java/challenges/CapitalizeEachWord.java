package challenges;

import java.util.*;
import java.io.*;

public class CapitalizeEachWord {

    /*
        This prompt asked me to capitalize each word. I did this one two different ways.
     */

    public static String LetterCapitalize(String str) {

        String[] wordsArray = str.split("[^a-zA-Z0-9]");
        String newString = "";


        for (int i = 0; i < wordsArray.length; i++){

            char[] capd = new char[wordsArray[i].length()];

            if ((wordsArray[i].charAt(0) >= 97) && (wordsArray[i].charAt(0) <= 122)){

                for (int j = 0; j < wordsArray[i].length(); j++){

                    if (j == 0){
                        capd[j] = (char)(wordsArray[i].charAt(0) - 32);
                    } else {
                        capd[j] = wordsArray[i].charAt(j);
                    }
                }
            } else {

                for (int j = 0; j < wordsArray[i].length(); j++){
                    capd[j] = wordsArray[i].charAt(j);
                }
            };

            for (int j = 0; j < capd.length; j++) {
                newString = newString + capd[j];
            }

            newString = newString + " ";
        }

        return newString;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }
}
