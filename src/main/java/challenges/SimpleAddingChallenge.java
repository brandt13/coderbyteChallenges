package challenges;

import java.util.*;
import java.io.*;

public class SimpleAddingChallenge {

    // This challenge wants you to take a number and add each number up to the original number

    public static int SimpleAdding(int num) {

        int sum = 0;

        for (int i = 0; i <= num; i++){

            sum = sum + i;
        }

        return sum;

    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(SimpleAdding(s.nextInt()));
    }
}
