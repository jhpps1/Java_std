package week3;
import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static char[][] arr;
    static int[][] dir = {  // main함수 밖에 써야함...
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };
    static int[][] visited1;
    static int[][] visited2;

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        visited1 = new int[N][N];  // N에 값이 할당되고 나서 배열을 선언해야 한다.
        visited2 = new int[N][N];
        // 인덱스로 접근해야 하므로 배열로 선언
        arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            arr[i] = line.toCharArray();
        }
        System.out.println(Arrays.deepToString(arr));

        int cnt1 = 0;
        int cnt2 = 0;

        for (int r=0; r < N; r++) {
            for (int c=0; c < N; c++) {
                if (visited1[r][c] == 0) {
                    bfs(r, c, visited1, false);
                    cnt1++;
                }
                if (visited2[r][c] == 0) {
                    bfs(r, c, visited2, true);
                    cnt2++;
                }
            }
        }

        System.out.println(cnt1 + " " + cnt2);

    }



    static void bfs (int r, int c, int[][] visited, boolean isColorBlind) {
        // Deque<int[]>: (r, c) 좌표쌍을 저장
        Deque<int[]> q = new ArrayDeque<>();  // 초기값을 직접 넣을 수 없음
        q.add(new int[] {r, c});
        visited[r][c] = 1;

        while (!q.isEmpty()) {
            int[] current = q.poll();  // == .popleft()
            int cr = current[0];
            int cc = current[1];
            char color = arr[cr][cc];

            for (int[] d : dir) {
                int nr = cr + d[0];
                int nc = cc + d[1];
                if (0 <= nr && nr < N && 0 <= nc && nc < N && visited[nr][nc] == 0) {
                    if (isColorBlind) {
                        if (((color == 'R' || color == 'G') && (arr[nr][nc] == 'R' || arr[nr][nc] == 'G')) || arr[nr][nc] == color) {
                            visited[nr][nc] = 1;
                            q.add(new int[]{nr, nc});
                        }
                    } else if (arr[nr][nc] == color) {
                        visited[nr][nc] = 1;
                        q.add(new int[]{nr, nc});
                    }
                }
            }

        }
    }
}
