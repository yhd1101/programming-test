package Programmers;

public class ThreeMusketeers_131705 {
    public static void main(String[] args) {
        int[] num = {-2,3,0,2,-5};
        int cnt = 0;
        int sum = 0;
        for (int i =0; i< num.length; i++) {
            if (i == num.length-2) {
                break;
            }
            sum = num[i] + num[i+1];
            for (int j =0; j<num.length-2; j++) {

            }
        }
        System.out.println(cnt);
    }
}
