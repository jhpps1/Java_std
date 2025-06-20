import java.util.Scanner;
import java.io.FileInputStream;
import java.io.*;
class new_amnesia {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        int total = (1 << 10) - 1;  // 모든 숫자가 등장했을 때 값

        for (int i = 1; i <= tc; i ++){
            int N = Integer.parseInt(br.readLine());

            int bitvisited = 0;
            boolean[] visited = new boolean[10];
            int cnt = 0;
            for (cnt=1; ; cnt++) {
                char[] arr = String.valueOf(N * cnt).toCharArray(); // N * count 값 문자열로 표현
                for (char c:arr){
                    int num = c - '0';
                    bitvisited |= (1 << num);

                    visited[num] = true;
                }
                if (bitvisited == total) break; // 모든 숫자 등장 시 종료
                boolean finish = true;
                for (int k=0; k<= 9; k++) {
                    if (!visited[k]) finish = false;
                }
                if (finish) break;
            }
            System.out.println("#" + i + " "  + (N*cnt));
        
    }
    }
}
