import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class Solution{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        T= Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
 
            int lastBit = (1 << (N)) - 1;  
            if( lastBit == (M & lastBit)){
                System.out.println("#" + tc + " " + "ON");
            }else{
                System.out.println("#" + tc + " " + "OFF");
            }
        }
    }
}