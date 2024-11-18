package Programmers;

public class Programmers_136798 {
    public static void main(String[] args) {
        int number = 10;  // 숫자의 범위
        int limit = 3;    // 약수의 개수 제한
        int power = 2;    // 제한을 초과하면 대신 더할 값
        int result = 0;   // 최종 결과 값

        // number까지 반복하면서 각 숫자의 약수 개수 구하기
        for (int i = 1; i <= number; i++) {
            int count = 0;  // 약수 개수 초기화

            // i의 약수를 구하기: 1부터 i의 제곱근까지
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {  // j가 i의 약수라면
                    count++;  // j는 약수
                    if (i / j != j) {  // i / j도 약수 (단, j와 i/j가 같지 않으면)
                        count++;
                    }
                }
            }

            // 약수 개수가 limit을 넘으면 power를 더하고, 아니면 그 개수를 더함
            if (count > limit) {
                result += power;
            } else {
                result += count;
            }
        }

        System.out.println(result);  // 최종 결과 출력
    }
}
