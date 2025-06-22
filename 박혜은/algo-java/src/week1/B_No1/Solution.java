package week1.B_No1;
//새로운 불면증 치료법

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc < (T + 1); tc ++) {
            int N = sc.nextInt();
            int result = Solve(N);
            System.out.println("#" + tc + " " + result * N);
        }
    }

    static int Solve(int N) {
        int k = 1;
        //String vs Character: 문자열, 문자 하나
        HashSet<Character> set = new HashSet<>();

        while (set.size() < 10) {
            String num = Integer.toString(k * N);
            for (int i = 0; i < num.length(); i ++) {  //문자 하나씩 순회
                set.add(num.charAt(i));
            }

            k += 1;
        }
        return k - 1;
    }
}
