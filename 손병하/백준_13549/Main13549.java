package practice;

import java.io.*;
import java.util.*;

public class Main13549 {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 모음을 위한 StringBuilder (매 테스트 케이스마다 결과를 누적시킴)
        StringBuilder output = new StringBuilder();
        
        // 테스트 케이스 개수 입력
        int T = Integer.parseInt(br.readLine().trim());
        
        // 반복문 돌릴 때 마다 -1씩 해주면서 0보다 크면 계속.
        while (T-- > 0) {
            // 명령어 (예: "RDD") 입력
            String commands = br.readLine().trim();
            // 배열의 길이 입력
            int n = Integer.parseInt(br.readLine().trim());
            // 배열 문자열 입력 (예: "[1,2,3,4]")
            String arrLine = br.readLine().trim();

            // 덱(Deque)을 이용한 자료 구조 선언(양방향 큐)
            Deque<Integer> dq = new ArrayDeque<>();

            // 배열 길이가 0이 아닐 때만 파싱 진행
            if (n > 0) {
                // 대괄호 제거 후 콤마 기준으로 분할
                String[] elements = arrLine.substring(1, arrLine.length() - 1).split(",");
                for (String el : elements) {
                    dq.addLast(Integer.parseInt(el)); // 덱의 뒤에 추가
                }
            }

            // 뒤집기 여부를 판단 변수
            boolean reverse = false;
            // 에러 발생 여부를 판단 변수
            boolean error = false;

            // 명령어 문자열을 한 글자씩 처리
            for (char c : commands.toCharArray()) {
                if (c == 'R') {
                    // 뒤집기 명령 시 플래그를 반전
                    reverse = !reverse;
                } else { // 'D' 명령
                    if (dq.isEmpty()) {
                        // 비어 있을 경우 에러 처리
                        error = true;
                        break;
                    }
                    if (reverse) {
                        dq.removeLast();  // 뒤집힌 상태에서는 뒤에서 삭제
                    } else {
                        dq.removeFirst(); // 정방향에서는 앞에서 삭제
                    }
                }
            }

            if (error) {
                // 에러 발생 시 출력
                output.append("error\n");
            } else {
                // 정상 처리 시 덱 내용을 형식에 맞춰 출력
                output.append("[");

                if (reverse) {
                    // 뒤집힌 상태라면 뒤에서부터 출력
                    while (!dq.isEmpty()) {
                        output.append(dq.removeLast());
                        if (!dq.isEmpty()) output.append(",");
                    }
                } else {
                    // 정방향 출력
                    while (!dq.isEmpty()) {
                        output.append(dq.removeFirst());
                        if (!dq.isEmpty()) output.append(",");
                    }
                }

                output.append("]\n");
            }
        }

        // 모든 테스트 케이스 결과 출력
        System.out.print(output.toString());
    }
}
