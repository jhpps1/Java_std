package practice;

import java.io.*;
import java.util.*;

public class Main5430 {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int N = Integer.parseInt(tokens[0]); // 시작 위치
        int K = Integer.parseInt(tokens[1]); // 도착 위치

        int MAX = 100001;
        int[] dist = new int[MAX];
        Arrays.fill(dist, -1);

        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(N);
        dist[N] = 0;

        while (!dq.isEmpty()) {
            int cur = dq.poll();

            // 종료 조건: 목적지 도달 시 바로 출력 후 종료
            if (cur == K) {
                System.out.println(dist[cur]);
                return;
            }

            // 2 * X: 0초, 앞에 넣음
            if (cur * 2 < MAX && dist[cur * 2] == -1) {
                dist[cur * 2] = dist[cur];
                dq.addFirst(cur * 2);
            }

            // X - 1: 1초, 뒤에 넣음
            if (cur - 1 >= 0 && dist[cur - 1] == -1) {
                dist[cur - 1] = dist[cur] + 1;
                dq.addLast(cur - 1);
            }

            // X + 1: 1초, 뒤에 넣음
            if (cur + 1 < MAX && dist[cur + 1] == -1) {
                dist[cur + 1] = dist[cur] + 1;
                dq.addLast(cur + 1);
            }
        }
    }
}
