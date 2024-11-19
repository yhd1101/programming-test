package Programmers;

import java.util.Arrays;

public class Programmers_135808 {
    public static void main(String[] args) {

        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int answer = 0;
        int cnt = 0;
        Arrays.sort(score);
        for (int i =0; i< score.length; i++) {
            System.out.print(score[i] + " ");
        }


        if (score.length <m*2) {
           answer = score[m-1] *m;
        } else if (score.length > m*2) {

            for (int i = 0; i< score.length/m; i++) {
                score[cnt] = score[cnt] *m;
                System.out.println("score: " + score[cnt]);
                answer = answer + score[cnt];
                cnt = cnt +m;
            }

        }else  {
            answer =0;
            System.out.println();
        }
        System.out.println(answer);

    }
}
