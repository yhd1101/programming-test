package Programmers;

import java.util.ArrayList;

public class Programmers_12926 {
    public static void main(String[] args) {
        String s = "a B z";
        String answer ="";
        int n = 4;
        for (int i =0; i< s.length(); i++) {
            char ch  = s.charAt(i);
            //소문자범위..
            if (ch >= 'a' && ch <='z') {
                ch = (char) ('a' + (ch - 'a' +n) %26);
            }
            if (ch >='A' && ch <= 'Z') {
                ch = (char) ('A' + (ch - 'A' +n) %26);
             }
            answer = answer + ch;
        }
        System.out.println(answer);

//        ArrayList<String> list = new ArrayList<>();
//        String[] str= s.split("");
//        for (int i = 0; i< s.length(); i++) {
//            list.add(str[i]);
//        }
//        String answer= "";
//
//        for (int i= 0; i< list.size(); i++) {
//            char ch = list.get(i).charAt(0);
//            if ((ch >= (int) 'a' || ch >= (int) 'A') && (ch <= (int)'y' || ch <= (int) 'Y') ){
//                ch = (char) ((int) ch + n);
//            } else if (ch == (int) 'z') {
//                ch = 'a';
//                ch = (char) ((int) ch + n -1);
//            }else if (ch == (int) 'Z') {
//                ch = 'a';
//                ch = (char) ((int) ch + n -1);
//            }
//            answer = answer + ch;
//        }
//
//        System.out.println(answer);
    }
}
