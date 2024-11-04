package Programmers;

public class Programmers_86491 {
    public static void main(String[] args) {
        int[][] sizes = {{60,90}, {30,70}, {60,30}, {80,40}};
        int maxh = 0;
        int maxw =0;
        int answer= 0;

        for (int i =0; i< sizes.length; i++) {
            int v=Math.max(sizes[i][0],sizes[i][1]);
            int h=Math.min(sizes[i][0],sizes[i][1]);
            maxw=Math.max(maxw,v);
            maxh=Math.max(maxh,h);
        }
        answer = maxh*maxw;
    }
}
