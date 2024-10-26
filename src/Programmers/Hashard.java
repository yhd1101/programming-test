package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Hashard {
    public static void main(String[] args) {
        boolean answer = true;
        int x = 14;
        int a = x;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        while ( a> 0) {
            int i =0;
            list.add(a%10);
            a = a/10;
        }
        for (int i =0; i< list.size(); i++) {
            sum = sum + list.get(i);
            System.out.println(sum);
        }
        if (x % sum == 0) {
            System.out.println(answer);
        } else {
            answer =false;
            System.out.println(answer);
        }
    }
}
