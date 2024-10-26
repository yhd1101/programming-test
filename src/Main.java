import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n: 배열의 크기, s: 구간 합을 구하는 횟수
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int[] prefixSum = new int[n + 1];  // 누적 합 배열 (1-based indexing)

        // 배열 a 입력받기
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // 누적 합 배열 계산
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + a[i - 1];
        }

        // 구간 합 계산
        for (int i = 0; i < s; i++) {
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            // 구간 합 출력 (누적 합을 이용하여 계산)
            System.out.println(prefixSum[r2] - prefixSum[r1 - 1]);
        }
    }
}
