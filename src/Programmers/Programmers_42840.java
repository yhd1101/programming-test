package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers_42840 {
    public static void main(String[] args) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] answer = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>();
        int[] sum = new int[3];

        // 패턴 비교
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == one[i % one.length]) {
                sum[0]++;
            }
            if (answer[i] == two[i % two.length]) { // 수정: two로 변경
                sum[1]++;
            }
            if (answer[i] == three[i % three.length]) { // 수정: three로 변경
                sum[2]++;
            }
        }
        int max = Math.max( Math.max(sum[0], sum[1]), sum[2]);


        for (int i =0; i<sum.length; i++) {
            if (sum[i] == max) {
                list.add(i+1);
            }
        }
        System.out.println(list);
    }
}
