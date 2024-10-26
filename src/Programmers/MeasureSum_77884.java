package Programmers;

public class MeasureSum_77884 {
    public static void main(String[] args) {
        int le = 13;
        int ri = 17;
        int cnt = 0;
        int sum =0;

        for (int i =le; i<= ri; i++) {
            for (int j = 1; j<=i; j++) {
                if(i % j ==0) {
                    cnt ++;
                }
            }
            if (cnt % 2 == 1) {
                sum = sum- i;
            } else {
                sum = sum + i;
            }
            cnt = 0;
        }

        System.out.println(Math.sqrt(14));
    }
}
