package Programmers;

public class SmallSubstrings_147355 {
    public static void main(String[] args) {
        String t = "500220839878";
        String p = "7";
        int a = 0;
        int sum = 0;
        System.out.println(p.length());

        for(int i = 0; i< t.length(); i++) {
            if(i+p.length() > t.length()) {
                break;
            }
            String sub = t.substring(i, i+p.length());
            a= Integer.parseInt(sub);
            if (Integer.parseInt(p)>= a) {
                sum ++;
            }
        }
        System.out.println(sum);
    }
}
