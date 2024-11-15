package Programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programmers_176963 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] year = {5 ,10 ,1 ,3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] answer = new int[photo.length];

        Map<String, Integer> map =new HashMap<>();
        for (int i =0; i< name.length; i++) {
            map.put(name[i], year[i]);
        }

        for (int i=0; i< photo.length; i++) {
            answer[i] =0;
            for (int j =0; j< photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {
                    answer[i] =answer[i] + map.get(photo[i][j]);
                }
            }
        }

        for (int i =0; i<answer.length; i++) {
            System.out.println(answer[i]);
        }


    }
}
