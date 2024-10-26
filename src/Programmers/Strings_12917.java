package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class Strings_12917 {
    public static void main(String[] args) {
        String s = "Zbcdefg";

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        String answer = "";
        for (int i = 0; i< str.length; i++) {
            answer= answer+str[i];
        }

        System.out.println(answer);
    }
}
