package Programmers;

import java.util.Arrays;

public class Programmers_135808 {
    public static void main(String[] args) {

        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int answer = 0;
        int n = score.length;
        Arrays.sort(score);

        for ( int i = n-m; i>=0; i -= m) {
            answer = answer + score[i] *m;
        }
        System.out.println(answer);

    }
}
