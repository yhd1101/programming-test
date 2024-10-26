package Programmers;

public class ScarceMoney_82612 {
    public static void main(String[] args) {
        int price =3;
        int money = 20;
        int count = 4;
        long answer;
        long sum = 0;

        for (int i =1; i<= count; i++) {
            sum = sum + (long) (i * price);
        }
        if (money> sum) {
            System.out.println(0);
        } else {
            answer = (long) (sum-money);
            System.out.println(answer);
        }



        //sum이 long이아니여서 안됨 sum을 long으로 바꿔줘야함
        //범위를 초과함 int로 설정해주면
//        int price =3;
//        int money = 20;
//        int count = 4;
//        long answer;
//        int sum = 0;
//
//        for (int i =1; i<= count; i++) {
//            sum = sum + i * price;
//        }
//        if (money> sum) {
//            System.out.println(0);
//        } else {
//            answer = (long) (sum-money);
//            System.out.println(answer);
//        }

    }
}

