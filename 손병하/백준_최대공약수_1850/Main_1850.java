import java.util.Scanner;

public class Main_1850 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();

        // 최대공약수 계산
        long gcd = a;
        long r = b;
        while (r != 0) {
            long temp = gcd % r;
            gcd = r;
            r = temp;
        }

        // gcd만큼 "1" 출력
        // 왜 StringBuilder인가?
        // StringBuilder는 문자열을 반복해서 만들거나 조작하면 하나의 객체만 조작하는 것이라 시간 + 메모리 절약.
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < gcd; i++) {
            ans.append('1');
        }
        System.out.println(ans);
    }
}
