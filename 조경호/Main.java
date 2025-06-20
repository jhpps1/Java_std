import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 이렇게 해야 빠르게 받을 수 있다고 하더라
        StringTokenizer st = new StringTokenizer(br.readLine()); // 이건 공백제거용
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] a  = new int[N+1][M+1];
        int[][] ps = new int[N+1][M+1];
        
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
       
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                ps[i][j] = ps[i-1][j] + ps[i][j-1] - ps[i-1][j-1] + a[i][j];
            }
        }
        
        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < K; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            int sum = ps[x][y] - ps[i-1][y]- ps[x][j-1]+ ps[i-1][j-1];
            sb.append(sum).append('\n');
        }

        System.out.print(sb);
    }
}
