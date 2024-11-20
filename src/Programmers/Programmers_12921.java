package Programmers;

public class Programmers_12921 {
    public static void main(String[] args) {
        int n = 5;
        int answer = 0;

        int cnt =0;
        for (int i =2; i<=n; i++) {

            for (int j =1; j<=i; j++) {
                if (i % j ==0) {
                    cnt ++;
                }
            }
            if (cnt ==2) {
                answer++;
            }
            cnt = 0;
        }

        System.out.println(answer);
    }
}
