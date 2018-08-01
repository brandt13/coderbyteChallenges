package challenges;


import java.util.Scanner;

public class CapitalizeEachWord_v2 {

    public static String LetterCapitalize(String str) {

        /*
            Version 2
         */

       StringBuilder sb = new StringBuilder();

       String[] arr = str.split("\\s");

       for (int i = 0; i < arr.length; i++){

           sb.append(arr[i].substring(0,1).toUpperCase() + arr[i].substring(1));
           sb.append(" ");
       }

       return sb.toString().trim();
    }

    public static void main (String[] args) {
        // keep this function call herse
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }
}
