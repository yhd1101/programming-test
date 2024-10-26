package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DivideArray_12910 {
    public static void main(String[] args) {
        int[] arr = { 3, 2,6};
        List<Integer> list = new ArrayList<>();
        int cnt  = 0;
        int div = 10;
        Arrays.sort(arr);

        for (int i =0; i< arr.length; i++) {
            if (arr[i] % div == 0) {
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }

        System.out.println(list);

    }
}
