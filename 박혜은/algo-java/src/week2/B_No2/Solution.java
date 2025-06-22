package week2.B_No2;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc ++) {
            String line = br.readLine();
            String[] arr = line.split(" ");
            int N = Integer.parseInt(arr[0]);
            int M = Integer.parseInt(arr[1]);

            String binM = Integer.toBinaryString(M);
            String result = isOn(binM, N);
            System.out.println("#" + tc + " " + result);
        }
    }

    // 마지막 N개의 비트만 확인하여 모두 1이면 ON
    static String isOn (String binM, int N) {
        int lenM = binM.length();
        if (lenM < N) return "OFF";  //tc 1번
        for (int i = lenM - 1; i >= lenM - N; i --) {
            if (binM.charAt(i) == '0') return "OFF";  //char 타입은 쌍따옴표 아님 주의
        }

        return "ON";
    }

}
