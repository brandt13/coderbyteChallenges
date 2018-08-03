package challenges;

import java.util.Scanner;

public class AlphabetSoupChallenge {

    public static String AlphabetSoup(String str) {

        // Have the function AlphabetSoup(str) take the str string parameter being
        // passed and return the string with the letters in alphabetical order (ie. hello
        // becomes ehllo). Assume numbers and punctuation symbols will not be included in the string.

        String sorted = "";

        for (char i = 'a'; i <= 'z'; i++){

            for (int j = 0; j < str.length(); j++){

                if (str.charAt(j) == i){
                    sorted = sorted + i;
                }
            }
        }
        
        return sorted;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(AlphabetSoup(s.nextLine()));
    }
}
