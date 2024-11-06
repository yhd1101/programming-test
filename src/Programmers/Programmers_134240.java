package Programmers;

public class Programmers_134240 {
    public static void main(String[] args) {
        int[] food = {1,7,1,2};
        String answer  = "";
        food[0] =0;
        answer = answer + food[0];


        for (int i =food.length-1; i>0; i--) {
            if (food[i] %2 ==0) {
                for (int j= 0; j<food[i]/2; j++) {
                    answer= i+ answer +i;
                }
            } else  {
                for (int s =0; s< (food[i] -1)/2; s++) {
                    answer =i+ answer +i;
                }
            }
        }

        System.out.println(answer);
    }
}
