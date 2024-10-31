package Programmers;

import java.util.HashSet;
import java.util.Set;

public class Programmers_1845 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        int max =  nums.length/2;
        Set<Integer> s = new HashSet<>();
        for (int i =0; i<nums.length; i++) {
            s.add(nums[i]);
        }
        int result = s.size()> max ?  max : s.size();


        System.out.println(result);
    }
}
