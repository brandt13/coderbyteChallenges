package challenges;

import java.util.*;
import java.io.*;

public class FindLongestWord {

    /*
       This challenge asks you to find the longest word out of a sentence, excluding anything but
       letters and numbers (which are allowed to be added to words for some reason). In this challenge,
       I learned more about regex and how to split Strings exactly where you want them to be split.
    */

    public static String LongestWord(String sentence) {

        String[] words = sentence.split("[^a-zA-Z0-9]");
        String longestWord = "";

        for (int i = 0; i < words.length; i++){
            if (words[i].length() > longestWord.length()){
                longestWord = words[i];
            }
        }

        return longestWord;
    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}
