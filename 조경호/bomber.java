import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int R, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rcn = br.readLine().split(" ");
        R = Integer.parseInt(rcn[0]);
        C = Integer.parseInt(rcn[1]);
        long N = Long.parseLong(rcn[2]);

        char[][] grid0 = new char[R][C];
        for (int i = 0; i < R; i++) {
            grid0[i] = br.readLine().toCharArray();
        }

        if (N == 1) {
            printGrid(grid0);
            return;
        }
        if (N % 2 == 0) {
            printFullBombs();
            return;
        }

        char[][] grid1 = explode(grid0);
        char[][] grid2 = explode(grid1);

        if (N % 4 == 3) {
            printGrid(grid1);
        } else {
            printGrid(grid2);
        }
    }

    static char[][] explode(char[][] bombs) {
        char[][] res = new char[R][C];
        for (int i = 0; i < R; i++) {
            Arrays.fill(res[i], 'O');
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (bombs[i][j] == 'O') {
                    res[i][j] = '.';
                    if (i > 0)      res[i-1][j] = '.';
                    if (i < R-1)   res[i+1][j] = '.';
                    if (j > 0)      res[i][j-1] = '.';
                    if (j < C-1)   res[i][j+1] = '.';
                }
            }
        }
        return res;
    }

    static void printGrid(char[][] grid) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < R; i++) {
            sb.append(grid[i]).append('\n');
        }

        System.out.print(sb);
    }

    static void printFullBombs() {
        StringBuilder sb = new StringBuilder();
        char[] fullArr = new char[C];
        Arrays.fill(fullArr, 'O');
        String full = new String(fullArr);
        for (int i = 0; i < R; i++) {
            sb.append(full).append('\n');
        }
        System.out.print(sb);
    }
}
