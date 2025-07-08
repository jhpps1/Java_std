import java.io.*;
import java.util.*;
public class swea14510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC =  Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= TC; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] tree = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄을 통으로 읽고 토큰으로 분리
            int maxTree = 0;
            for (int i = 0; i < N; i++) {
                tree[i] = Integer.parseInt(st.nextToken()); // 각 나무의 높이를 차례대로 담고
                maxTree = Math.max(maxTree, tree[i]); // 최댓값 찾기
            }
            int S = 0, O = 0;
            for (int i = 0; i < N; i++) {
                int d = maxTree - tree[i]; // 가장 높은 나무 만큼 자라려면 얼마나 커져야 하는지
                S += d; // 모든 나무의 부족한 높이 차이를 더해서 얼마나 자라야하는지
                if ((d & 1) == 1) O ++; // d가 홀 수 일때 한 번 씩 카운트 => 1씩 자라는 날이 한 번은 필요하기에
            }

            // D 를 0부터 늘려가며 조건 확인
            int answer = 0;
            for (int D = 0; ; D++) {
                int oneDay = (D+1) / 2; // 최대 1씩 자랄 수 있는 날
                int twoDay = D / 2; // 최대 2씩 자랄 수 있는 날

                int twoUse = Math.min(twoDay, (S - O) / 2); // 최대한 2씩 자라게 채우고
                int oneUse = S - 2 * twoUse; // 남은 날은 하루 로

                if (oneUse >= 0 && oneUse <= oneDay) { // 홀수 차이인 나무들은 1일이 반드시 필요 & D일 중 실제 1짜리 날은 (D+1)/2를 넘을 수 없음
                    answer = D;
                    break;
                }
            }
            System.out.printf("#%d %d%n", tc, answer);
        }
    }
}
