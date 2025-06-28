import java.io.*;
public class rgb_swea10026 {
    static int N;
    // 0. delta
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int totalA = 0, totalB = 0;
        //1.  일단 전체 배열 받고
        char[][] grid = new char[N][N];
        for (int i =0; i < N; i++){
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        // 2. 적녹색약 기준 R을 G로 바꿔주고
        char[][] gridC = new char[N][N];
        for (int i =0; i <N; i++) {
            for (int j = 0; j < N; j++) {
                char c = grid[i][j];
                gridC[i][j] = (c== 'R' ? 'G' :c); // 만약 다른 색이면 그대로
            }
        }

        // 3. 일반인 기준  dfs delta를 돌리면서 rgb를 숫자형태로 바꾸면서 count (total_a]


        boolean[][] visitedA = new boolean[N][N];
        boolean[][] visitedB = new boolean[N][N];
        // 순회
        for (int i =0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visitedA[i][j]) { // 만약 방문하지 않은 경우에는 카운팅이 안된거니깐 최종 개수 증가
                    totalA++;
                    dfs(i, j, grid, visitedA);
                }
            }
        }

        for (int i =0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visitedB[i][j]) {
                    totalB++;
                    dfs(i, j, gridC, visitedB);
                }
            }
        }
        // 4. 둘다 가장 높은 수 반환
        System.out.println(totalA + " " + totalB);



    }
    // dfs 로 다 탐색
    static void dfs(int x, int y, char[][] g, boolean[][] visited) {
        visited[x][y] = true;
        char color = g[x][y];
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (nx <0 || nx >= N || ny <0 || ny >= N) continue;
            if (visited[nx][ny]) continue;
            if (g[nx][ny] != color) continue;
            dfs(nx, ny, g, visited);
        }
    }
}
