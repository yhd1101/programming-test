package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescInteger {
    public static void main(String[] args) {
        long n = 118372;
        List<Integer> list = new ArrayList<>();
        while (n> 0) {
            list.add((int) n%10);
            n = n/10;
        }
        Collections.sort(list, Collections.reverseOrder());
        long result = 0;
        for (int i = 0; i < list.size(); i++) {

            result = result * 10 + list.get(i);
            System.out.println(result);// 자릿수를 왼쪽으로 옮기며 숫자를 결합
        }

    }
}
