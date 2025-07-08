import java.util.*;
import java.io.*;

public class tree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc=1; tc <= T; tc++) {

            int N = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] parts = line.split(" ");
            List<Integer> height = new ArrayList<>();
            for (String part : parts) {
                height.add(Integer.parseInt(part));
            }
            int max_v = Collections.max(height);
            int sum_v = 0;
            int min_y = 0;

            for (int h : height) {
                sum_v += (max_v - h);
                if ((max_v - h) % 2 == 1) {
                    min_y += 1;
                }
            }
            List<Integer> arr = new ArrayList<>();
            int day= 0;  // 선언과 동시에 초기화해야 add할 때 오류 안남
            for (int x=0; x <= sum_v; x++) {
                int y = sum_v - 2 * x;
                if (y < min_y) continue;
                if (x >= y) {
                    day = 2 * x;
                } else if (x < y) {
                    day = 2 * y - 1;
                }
                arr.add(day);
            }
            System.out.println("#" + tc + " " + Collections.min(arr));
        }
    }
}
