package Programmers;

public class Programmers_12901 {
    public static void main(String[] args) {
        int a =5;
        int b= 24;

        int[] month = {31, 29, 31,30,31,30,31,31,30,31,30,31};
        int sum = 0;

        for (int i =0; i<a-1; i++) {
            sum = sum + month[i];
        }
        sum = sum +b;

        switch (sum % 7) {
            case 1 :
                System.out.println("FRI");
                break;
            case 2:
                System.out.println("SAT");
                break;
            case 3:
                System.out.println("SUN");
                break;
            case 4:
                System.out.println("MON");
                break;
            case 5:
                System.out.println("TUE");
                break;
            case 6:
                System.out.println("WED");
            default:
                System.out.println("THU");
        }

    }
}
