package boj_11723;

import java.util.*;
import java.io.*;


public class Main {
    //  throws IOException: 예외처리. 안하면 BufferedReader 못씀
    public static void main(String[] args) throws IOException {

        HashSet<String> set = new HashSet<>();
//      Scanner sc = new Scanner(System.in);
//      입출력 시 BufferedReader/StringBuilder를 쓰면 더 빠르다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();  //모아서 한 번에 출력


//      int T = sc.nextInt();
//      Integer.parseInt(): 문자열을 int로 바꾼다
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i ++) {
            String line = br.readLine();

            String[] arr = line.split(" ");  //공백 기준으로 단어 나누기
            String command = arr[0];

//          command가 add, remove, check, toggle 중 하나
            if (arr.length == 2) {
                String x = arr[1];

//              switch: 특정 값(변수)가 어떤 경우에 해당하는지 검사할 때 사용
//              if-else문을 간단하게 줄여준다.
                switch (command) {
                    case "add": set.add(x); break;
                    case "remove": set.remove(x); break;
                    case "check":
                        if (set.contains(x)) sb.append("1\n");
                        else sb.append("0\n");
                        break;
                    case "toggle":
                        if (set.contains(x)) set.remove(x);
                        else set.add(x);
                        break;
                }

//          command가 all, empty 중 하나
            } else {
                if (command.equals("all")) {
                    //더 좋은 방법 있다면 알려주세요
                    HashSet<String> set1 = new HashSet<>(Arrays.asList(
                            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                            "12", "13", "14", "15", "16", "17", "18", "19", "20"
                    ));
                    set = set1;
                } else if (command.equals("empty")) {
                    set.clear();  //모든 요소 제거
                }
            }
        }

        System.out.println(sb);  //한 번에 출력
    }
}
