package challenges;

import java.util.*;
import java.io.*;

public class TimeConvertChallenge {

    public static String TimeConvert(int num) {

        /*
            Have the function TimeConvert(num) take the num parameter being passed and
            return the number of hours and minutes the parameter converts to
            (ie. if num = 63 then the output should be 1:3).
            Separate the number of hours and minutes with a colon.
         */

        int hours;
        int minutes;

        if (num < 60){

            return "0:" + num;
        }
        else {

            hours = num / 60;
            minutes = num % 60;

            return hours + ":" + minutes;
        }
    }

    public static void main (String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.print(TimeConvert(s.nextInt()));
        }


}
