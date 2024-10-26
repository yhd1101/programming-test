package Programmers;

public class SumOfInteger_12912 {
    public static void main(String[] args) {
        int a= 3;
        int b =3;
        int c = Math.max(a,b);
        int d = Math.min(a,b);
        System.out.println(c);
        System.out.println(d);
        long sum = 0;

        for (int i = d; i<=c; i++) {
            sum = sum +i;
        }
        System.out.println(sum);

    }
}
