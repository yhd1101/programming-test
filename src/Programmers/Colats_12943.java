package Programmers;

public class Colats_12943 {
    public static void main(String[] args) {
        int num = 626331;
        int cnt =0;
        while(num>0) {
            if (cnt >= 500) {
                cnt = -1;
                break;
            }
            if(num == 1) {
                break;
            } else if (num % 2 ==0) {
                num = num/2;
                cnt ++;
            }  else if (num % 2 ==1) {
                num = num *3 +1;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}


//int형 변수는 -2,147,483,648부터 2,147,483,647까지의 정수 값을 저장할 수 있는데 아마 테스트케이스 중에 연산을 하다보면 int형 변수의 저장범위를 초과해서 오버플로우가 발생해서 그런 것 같네요