package Programmers;

import java.util.ArrayList;
import java.util.List;

public class SumNumPlus_86051 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4,6,7,8};
        int result  =0;
        int[] n = new int[10];

        for (int i =0; i< num.length; i++) {
            n[num[i]] = 1;
        }

        for (int i = 0; i< n.length; i++) {
            if(n[i] == 0){
                result = result +i;
            }
        }
        System.out.println(result);

    }
}
