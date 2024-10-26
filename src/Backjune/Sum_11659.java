package Backjune;

import java.io.*;
import java.util.StringTokenizer;

public class Sum_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int[] answer = new int[s];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i< a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i<s; i++) {
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            for (int j =r1; j<=r2; j++) {
                answer[i] = answer[i] + a[j-1];
            }
        }
        for (int i =0; i< answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
