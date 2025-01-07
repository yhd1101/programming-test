package Programmers;

public class Programmers77484 {
    public static void main(String[] args) {
        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = { 31,10,45,1,6,19};
        int[] answer = new int[2];
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < lottos.length; i ++) {
            if (lottos[i] == 0) {
                // 0인 경우, 알 수 없는 번호로 간주하여 최고 순위 증가
                answer[0]++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    // 일치하는 번호가 있으면 최고 순위와 최저 순위 모두 증가
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        answer[0] = rank[answer[0]];
        answer[1] = rank[answer[1]];
        System.out.println(answer[0]);


    }
}
