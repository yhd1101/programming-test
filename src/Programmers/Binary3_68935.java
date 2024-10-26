package Programmers;

public class Binary3_68935 {
    public static void main(String[] args) {
        int n = 45;
        int sum = 0;
        int add = 0;

        while (n>0) {
            sum = sum *10;
            sum = (sum + n%3);
            n = n/3;
        }

        while (sum>0) {
            int i = 1;
            if(sum %10 != 0) {
                add = add + (3 * i);
            }
        }
    }
}
