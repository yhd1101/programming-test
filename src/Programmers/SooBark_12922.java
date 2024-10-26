package Programmers;

public class SooBark_12922 {
    public static void main(String[] args) {
        int n = 4;
        String answer ="";

        for (int i =0; i< n; i++) {
            if(answer.length() % 2 == 1) {
                answer = answer + "박";
            } else {
                answer = answer + "수";
            }
        }

        System.out.println(answer);
    }
}
