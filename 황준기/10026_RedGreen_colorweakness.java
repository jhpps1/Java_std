

import java.util.Scanner;

public class RedGreen_colorweakness {
    static char[][] grid; // 색상 정보 저장용 2차원 배열
    static boolean[][] visited; // 방문 여부 확인용
    static int N;

    // 상하좌우 이동 좌표
    static int[] dx = {-1, 1, 0, 0}; // 행 이동 (위, 아래)
    static int[] dy = {0, 0, -1, 1}; // 열 이동 (왼쪽, 오른쪽)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 입력: 그림 크기
        sc.nextLine(); // 버퍼 비우기

        // 색상 정보 입력 받기
        grid = new char[N][N];
        for (int i = 0; i < N; i++) {
            grid[i] = sc.nextLine().toCharArray(); // 문자열을 문자 배열로 변환
        }

        visited = new boolean[N][N];
        int normalCount = 0;

        // 일반인 기준으로 영역 개수 세기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, grid[i][j]);
                    normalCount++;
                }
            }
        }

        // 적록색약 처리를 위해 R을 G로 바꾸기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 'R') {
                    grid[i][j] = 'G';
                }
            }
        }

        visited = new boolean[N][N];
        int colorWeakCount = 0;

        // 적록색약 기준으로 영역 개수 세기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, grid[i][j]);
                    colorWeakCount++;
                }
            }
        }

        System.out.println(normalCount + " " + colorWeakCount);
    }

    // DFS 함수: 현재 좌표 (x, y)에서 같은 색상의 연결된 칸을 모두 방문 처리
    public static void dfs(int x, int y, char color) {
        visited[x][y] = true; // 현재 위치 방문 표시

        // 4방향 탐색
        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 배열 범위 내에 있고, 아직 방문하지 않았으며, 같은 색상인 경우
            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if (!visited[nx][ny] && grid[nx][ny] == color) {
                    dfs(nx, ny, color); // 재귀 호출
                }
            }
        }
    }
}

// 이번 문제를 통해서 공부하게 된 사실
// 1. 자바는 변수에 대한 선언을 해줘야 작동한다.
// 2. DFS가 갖는 의미에 대해서 좀 더 명확하게 이해할 수 있었다.
// 3. 델타와 범위에 대해서 복습할 수 있었다.
// 4. 딴짓 그만하고 비형특강이랑 제대로 들어오겠습니다..