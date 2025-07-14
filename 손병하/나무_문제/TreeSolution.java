package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class TreeSolution {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim()); // 테스트 케이스 수
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스별로 반복
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine().trim()); // 나무 개수
            int[] trees = new int[N]; // 각 나무의 현재 높이 저장
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            // 입력값을 배열로 저장
            for (int i = 0; i < N; i++) {
                trees[i] = Integer.parseInt(st.nextToken());
            }

            // Java Stream API를 활용하여 최대값 추출
            int maxHeight = Arrays.stream(trees).max().getAsInt();

            int evenCount = 0;  // 2cm 물 주기가 필요한 횟수 (짝수날)
            // 왜 안썼지...? 근데 문제상으로 oddCount가 중요한게 맞다.
            int oddCount = 0;   // 1cm 물 주기가 필요한 횟수 (홀수날)
            int totalDiff = 0;  // 전체 자라야 할 높이 합계

            for (int h : trees) {
                int diff = maxHeight - h;   // 자라야 할 높이
                totalDiff += diff;
                evenCount += diff / 2;
                oddCount += diff % 2;
            }

            // 3cm를 2일에 해결한다는 개념으로 최소 일수 추정
            int days = (totalDiff / 3) * 2 + (totalDiff % 3);

            // 이 days 안에 oddCount만큼의 1cm 급수를 할 수 있는지 확인
            int oneDays = days / 2 + days % 2;

            int ans;
            if (oneDays >= oddCount) {
                ans = days;
            } else {
                // 부족하면 최소 2 * oddCount - 1일 필요
                ans = 2 * oddCount - 1;
            }

            sb.append("#").append(tc).append(" ").append(ans).append("\n");
        }

        System.out.print(sb.toString());
    }
}
