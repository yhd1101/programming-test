package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers_42748 {
    public static void main(String[] args) {
        int[] sol = {1, 5, 2, 6, 3, 7, 4};
        int[][] com = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[com.length];

        for (int i = 0; i < com.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = com[i][0] - 1; j < com[i][1]; j++) {
                list.add(sol[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(com[i][2] - 1);
        }

        // 결과 출력
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
