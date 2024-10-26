package Programmers;

public class NegatPlusPosi_76501 {
    public static void main(String[] args) {
        int[] ab = {4, 7, 12};
        int sum= 0;
        boolean[] sin = {true, false, true};

        for (int i =0; i<ab.length; i++) {
            if(sin[i]== false) {
                ab[i] = -ab[i];
            }
        }
        for (int i =0; i<ab.length; i++) {
            sum = sum+ab[i];
        }
        System.out.println(sum);
    }
}
