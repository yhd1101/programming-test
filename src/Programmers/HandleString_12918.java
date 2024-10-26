package Programmers;

public class HandleString_12918 {
    public static void main(String[] args) {
        boolean answer =true;

        String s = "a123";


        if(s.length()>=4 && s.length()<=6) {
            for (int i =0; i< s.length(); i++) {
                if(s.charAt(i) <'0' || s.charAt(i) >'9') {
                    answer = false;
                    System.out.println(answer);
                }
            }
            answer = true;
            System.out.println(answer);
        } else {
            answer = false;
            System.out.println(answer);
        }
    }
}
