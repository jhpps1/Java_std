package backjoon1463;

import java.util.Scanner;

public class Main_1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 목표 순서
        int count = 0;         // 666이 포함된 수의 개수
        int target = 666;      // 검사 시작 숫자

        while (true) {
            int temp = target;
            int c_six = 0;

            // 숫자를 한 자리씩 보면서 666이 연속으로 있는지 판단
            while (temp > 0) {
                if (temp % 10 == 6) {
                	c_six++;
                    if (c_six == 3) {
                        count++;
                        break;
                    }
                } else {
                	c_six = 0;
                }
                temp /= 10;
            }

            if (count == n) {
                System.out.println(target);
                break;
            }
            target++;
        }

        sc.close();
    }
}
