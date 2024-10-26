package Programmers;

public class Programmers_12930 {
    public static void main(String[] args) {
        String s = "try hello world";
        String[] str = s.split("");
        String result = "";
        int count = 0;

        for (int i = 0; i< str.length; i++) {
            if (count % 2==0) {
                str[i] = str[i].toUpperCase();
                count ++;
            } else {
                str[i] = str[i].toLowerCase();
                count ++;
            }
            if (str[i].equals(" ")) {
                count = 0;
            }
            result = result + str[i];
        }
        System.out.println(result);


    }
}
