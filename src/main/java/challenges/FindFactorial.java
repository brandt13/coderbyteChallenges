package challenges;

import java.util.*;
import java.io.*;

public class FindFactorial {

        /*
           This challenge wants you to find the factorial of a number that is input, i.e. input is 4,
           factorial is 4*3*2*1.
        */

        public static int FirstFactorial(int num) {

            int product = num;

            for (int i = num; i > 1; i--){
                product = product * (i-1);
            }
            return product;
        }

        public static void main (String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.print(FirstFactorial(s.nextInt()));
        }

}

