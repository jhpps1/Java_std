import java.io.*;
import java.util.*;
public class bj13549 {
    static final int MAX = 100000;
    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int s = m, t = n; // 수진이 위치에서 시작
        int[] dist = new int[MAX+1];
        Arrays.fill(dist, INF); // 다 최댓값 넣어두고
        dist[s] = 0;


        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(s);

        while (!dq.isEmpty()) {
            int x = dq.pollFirst();
            if (x == t) break; // 도착지에 도달하면 끝

            if (x % 2 == 0) { // 순간이동은 0초 소모
                int nx = x /2;
                if (dist[nx] > dist[x]) {
                    dist[nx] = dist[x];
                    dq.addFirst(nx);
                }
            }

            // 걷기
            // 최댓값보다 작을때
            if (x + 1 <= MAX && dist[x+1] > dist[x] +1 ) {
                dist[x+1] = dist[x] +1;
                dq.addLast(x+1);
            }
            // 최댓값보다 클 떄
            if (x - 1 >= 0 && dist[x - 1] > dist[x] + 1 ) {
                dist[x-1] = dist[x] +1;
                dq.addLast(x - 1);
            }

        }
            System.out.println(dist[t]);


    }
}
