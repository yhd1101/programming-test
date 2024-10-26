package Programmers;

public class SqrtInteger {
    public static void main(String[] args) {
        long n = 121;
        double a = Math.sqrt(n);

        if(a % 1 == 0)  {
            System.out.println((long) Math.pow(a+1, 2));
        } else {
            System.out.println(-1);
        }


    }
}
