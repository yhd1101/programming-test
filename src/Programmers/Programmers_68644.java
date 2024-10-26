package Programmers;

import java.util.*;

public class Programmers_68644 {
    public static void main(String[] args) {
        int[] num = {2, 1, 3,4,1};

        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i< num.length - 1; i++) {
            for (int j= i+1; j< num.length; j++) {
                set.add(num[i] + num[j]);
            }
        }
        //리스트
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);C
    }
}
