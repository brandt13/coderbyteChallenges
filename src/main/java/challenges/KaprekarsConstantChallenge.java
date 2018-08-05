package challenges;

import java.util.Scanner;

public class KaprekarsConstantChallenge {

    public static int KaprekarsConstant(int num) {

        /*  Hard Challenge:
            Using the Java language, have the function KaprekarsConstant(num) take the num parameter being
            passed which will be a 4-digit number with at least two distinct digits. Your program should
            perform the following routine on the number: Arrange the digits in descending order and in
            ascending order (adding zeroes to fit it to a 4-digit number), and subtract the smaller number
            from the bigger number. Then repeat the previous step. Performing this routine will always cause
            you to reach a fixed number: 6174. Then performing the routine on 6174 will always give you
            6174 (7641 - 1467 = 6174). Your program should return the number of times this routine must
            be performed until 6174 is reached. For example: if num is 3524 your program should return 3 because
            of the following steps: (1) 5432 - 2345 = 3087, (2) 8730 - 0378 = 8352, (3) 8532 - 2358 = 6174.
         */

        int counter = 0;

        do {
            String unsorted = Integer.toString(num);
            String desString = "";
            String ascString = "";

            if (unsorted.length() < 4) {
                for (int i = unsorted.length(); i < 4; i++) {
                    unsorted += "0";
                }
            }

            if (unsorted.length() > 4) {
                System.out.println("Error: More than 4 digits entered. Please try again.");
                return -1;
            }


            for (char i = '0'; i <= '9'; i++) {
                for (int j = 0; j < unsorted.length(); j++) {

                    if (unsorted.charAt(j) == i) {
                        ascString = ascString + i;
                    }
                }
            }

            for (char i = '9'; i >= '0'; i--) {
                for (int j = 0; j < 4; j++) {

                    if (unsorted.charAt(j) == i) {
                        desString = desString + i;
                    }
                }
            }

            int des = Integer.parseInt(desString);
            int asc = Integer.parseInt(ascString);

            if (des < asc){
                num = asc - des;
            } else {
                num = des - asc;
            }

            counter++;


        } while (num != 6174);

        return counter;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 4-digit number: ");
        System.out.print(KaprekarsConstant(s.nextInt()));
    }
}
