package challenges;

import java.util.*;
import java.io.*;

public class PentagonalNumberChallenge {

    public static int PentagonalNumber(int num) {

        /*
            This prompt asks you to find the number of points in a pentagon layer by layer, e.g.
            Layer 1: 1 point
            Layer 2: 6 points
            Layer 3: 16 points
            Layer 4: 31 points
            etc.
         */

        int prod = 0;
        int sumOfLayers = 0;
        int pointsOfLayer = 5;

        if (num == 1){
            return num;
        } else if (num == 2){
            return 6;
        } else if (num >= 3){

            for (int i = num; i >= 3; i--){
                prod = ((i - 2)*5);
                sumOfLayers = sumOfLayers + prod + pointsOfLayer;
            }
            return (6 + sumOfLayers);

        } else return num;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PentagonalNumber(s.nextInt()));
    }
}
