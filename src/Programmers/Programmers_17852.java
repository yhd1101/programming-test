package Programmers;

public class Programmers_17852 {
    public static void main(String[] args) {
        int rInner = 3; // 작은 원의 반지름
        int rOuter = 5; // 큰 원의 반지름

        countPoints(rInner, rOuter);
    }

    public static void countPoints(int rInner, int rOuter) {
        int count = 0;

        // 각 x, y에 대해 정수 좌표를 찾아내는 반복문
        for (int x = -rOuter; x <= rOuter; x++) {
            for (int y = -rOuter; y <= rOuter; y++) {
                int distanceSquared = x * x + y * y;

                // 작은 원 안쪽에 있지 않고 큰 원 안쪽에 있는 점들만 찾기
                if (distanceSquared >= rInner * rInner && distanceSquared <= rOuter * rOuter) {
                    count++;
                }
            }
        }

        // 총 개수 출력
        System.out.println("총 정수 좌표 쌍 개수: " + count);
    }
}
