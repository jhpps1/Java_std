package practice;

import java.util.*;

public class Main5430_2 {
    static final int MAX = 100001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수빈 위치
        int K = sc.nextInt(); // 동생 위치

        int[] time = new int[MAX];
        boolean[] visited = new boolean[MAX];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        visited[N] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            if (now == K) {
                System.out.println(time[now]);
                break;
            }

            // 2*X: 순간이동 (0초지만 BFS에서는 동일 취급)
            if (now * 2 < MAX && !visited[now * 2]) {
                queue.offer(now * 2);
                visited[now * 2] = true;
                time[now * 2] = time[now] + 1; // 사실은 +0이어야 함
            }

            // X - 1
            if (now - 1 >= 0 && !visited[now - 1]) {
                queue.offer(now - 1);
                visited[now - 1] = true;
                time[now - 1] = time[now] + 1;
            }

            // X + 1
            if (now + 1 < MAX && !visited[now + 1]) {
                queue.offer(now + 1);
                visited[now + 1] = true;
                time[now + 1] = time[now] + 1;
            }
        }
        sc.close();
    }
}

