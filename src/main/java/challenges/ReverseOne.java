package challenges;

import java.util.*;
import java.io.*;

public class ReverseOne {

    public static String FirstReverse(String str) {

        // This challenge wants you to reverse a string.

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }

        return reverse;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}

