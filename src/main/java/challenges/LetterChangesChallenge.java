package challenges;

import java.util.*;
import java.io.*;

public class LetterChangesChallenge {

    /*
       I learned after completing this challenge that there are much simpler ways to deal
       with characters through methods other than charAt().
    */
    /*
       Prompt:
       Using the Java language, have the function LetterChanges(str) take the str parameter being passed and modify
       it using the following algorithm.Replace every letter in the string with the letter following it in the alphabet
       (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) and
       finally return this modified string.
    */

    public static String LetterChanges(String str) {

        String modStr = "";

        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {

                if (str.charAt(i) == 90 || str.charAt(i) == 122) {
                    modStr = modStr + 'A';
                    continue;
                } else if (str.charAt(i) == 68 || str.charAt(i) == 100) {
                    modStr = modStr + 'E';
                    continue;
                } else if (str.charAt(i) == 72 || str.charAt(i) == 104) {
                    modStr = modStr + 'I';
                    continue;
                } else if (str.charAt(i) == 78 || str.charAt(i) == 110) {
                    modStr = modStr + 'O';
                    continue;
                } else if (str.charAt(i) == 84 || str.charAt(i) == 116) {
                    modStr = modStr + 'U';
                    continue;
                } else {
                    if ((str.charAt(i) >= 65 && str.charAt(i) <= 67) || (str.charAt(i) >= 69 && str.charAt(i) <= 71) || (str.charAt(i) >= 73 && str.charAt(i) <= 77) || (str.charAt(i) >= 79 && str.charAt(i) <= 83) || (str.charAt(i) >= 85 && str.charAt(i) <= 88)) {
                        modStr = modStr + (char)(str.charAt(i) + 33);
                    } else {
                        modStr = modStr + (char)(str.charAt(i) + 1);
                    }
                }
            } else {
                modStr = modStr + str.charAt(i);
            }
        }

        return modStr;
    }

    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextLine()));
    }

}

