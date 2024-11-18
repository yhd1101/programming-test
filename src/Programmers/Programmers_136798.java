package Programmers;

public class Programmers_136798 {
    public static void main(String[] args) {
        int number = 10;
        int limit = 3;
        int power =2;
        int result = 0;
        int count = 0;
        int[] s = new int[number];
        int cnt = 0;
        for (int i =1; i<=number; i++) {

            for (int j =1; j<=i; j++) {
                if (i % j == 0 ){
                    count ++;
                }
            }
            s[cnt] = count;
            if (s[cnt] >limit) {
                s[cnt] = power;
            }
            count = 0;
            result = result + s[cnt];
            cnt ++;
        }

        System.out.println(result);


    }
}
