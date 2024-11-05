package Programmers;

public class Programmers_132267 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;
        int sum = 0;

        while (n >= a) {
            int exchange = (n / a) * b; // 교환 후 얻은 병 수
            sum += exchange;
            n = (n % a) + exchange; // 남은 병과 새로 받은 병을 합쳐 업데이트);
        }

        System.out.println("총 받은 콜라 병 수: " + sum);
    }
}
