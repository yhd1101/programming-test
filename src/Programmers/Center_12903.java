package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Center_12903 {
    public static void main(String[] args) {
        String s = "qwer";
        String d = "";
        String c= "";
        String e = "";
        char[] a = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
        }
        if (a.length % 2 != 0) {
            e = String.valueOf(a[a.length / 2]);
        } else {

            e= String.valueOf(a[a.length/2-1]);
            c= String.valueOf(a[a.length/2]);
            e = e+c;
        }

        System.out.println(e);  // 중간 값 출력
    }
}
