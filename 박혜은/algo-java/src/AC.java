import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AC {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String cmd = br.readLine();
            List<Character> command = new ArrayList<>();
            for (char ch : cmd.toCharArray()) {
                command.add(ch);
            }
            int n = Integer.parseInt(br.readLine());
            String line = br.readLine().replaceAll("\\[|\\]", "");
            List<String> arr = new ArrayList<>();
            if (!line.isEmpty()) {
                // 배열을 리스트로 바꾸는 이유는 remove나 reverse 등을 써야하기 때문
                String[] parts = line.split(",");
                Collections.addAll(arr, parts);
            }
            String result = solve(command, n, arr);
            System.out.println(result);
        }
    }

    static String solve(List<Character> command, int n, List<String> arr) {
        boolean rev = false;
        if (n == 0 && command.contains('D')) return "error";
        for (char ch : command) {
            if (ch == 'R') {
                rev = !rev;
            } else if (ch == 'D') {
                if (arr.isEmpty()) return "error";
                if (rev) arr.remove(arr.size() - 1);
                else arr.remove(0);
            }
        }
        if (rev) {
            Collections.reverse(arr);
        }
        String str = "[]";
        if (!arr.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < arr.size(); i++) {
                sb.append(arr.get(i));
                if (i != arr.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
            str = sb.toString();
        }
        return str;
    }
}
