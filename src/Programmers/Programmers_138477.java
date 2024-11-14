package Programmers;

import java.util.*;

public class Programmers_138477 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] sa  = new int[k];
        int[] answer = new int[score.length];

        List<Integer> list = new ArrayList<>();

        for (int i =0; i<score.length; i++) {
            list.add(score[i]);

            if (list.size() >k) {
                //최소값제거
                list.remove(Collections.min(list));
            }

            answer[i] = Collections.min(list);
        }


        //효율성이 떨어져서 19점맞음 ..
//        for (int i =0; i< k; i++) {
//            sa[i] = score[i];
//        }
//        Arrays.sort(sa);
//
//        for (int i =0; i< sa.length; i++) {
////            System.out.println(sa[i]);
//            answer[i] = sa[0];
////            System.out.println(answer[i]);
//        }
//
//        for (int i = k; i<score.length; i++) {
//            if(sa[0]<score[i]) {
//                sa[0] = score[i];
//                Arrays.sort(sa);
//                answer[i] =sa[0];
//            } else  {
//               answer[i] = sa[0];
//            }
//        }
//////
//        for (int i =0; i< answer.length; i++) {
//            System.out.println(answer[i]);
//        }
    }
}
