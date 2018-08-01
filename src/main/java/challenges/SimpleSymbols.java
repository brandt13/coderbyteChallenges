package challenges;

import java.util.*;
import java.io.*;


public class SimpleSymbols {

    public static String SimpleSymbols(String str) {

        /*
            Using the Java language, have the function SimpleSymbols(str) take the str parameter being passed and
            determine if it is an acceptable sequence by either returning the string true or false. The str
            parameter will be composed of + and = symbols with several letters between them (ie. ++d+===+c++==a)
            and for the string to be true each letter must be surrounded by a + symbol. So the string to the left
            would be false. The string will not be empty and will have at least one letter.
         */


        for (int i = 1; i < str.length(); i++){

            if ((str.charAt(i) >= 65 && str.charAt(i) >= 90) || (str.charAt(i) >= 97 && str.charAt(i) >= 122)){

                if ((str.charAt(0) >= 65 && str.charAt(0) >= 90) || (str.charAt(0) >= 97 && str.charAt(0) >= 122)){
                    return str = "false";
                }

                if (((str.charAt(i - 1)) == 43) && ((str.charAt(i + 1)) == 43)) continue;
                else return str = "false";
            }
        }

        return str = "true";
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(SimpleSymbols(s.nextLine()));
    }
}
