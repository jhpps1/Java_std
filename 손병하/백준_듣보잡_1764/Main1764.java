package backjoon;

import java.util.*;  // Scanner, HashSet, ArrayList, Collections 사용을 위한 import
					 // util 자체를 가져오면 내가 원하는 위의 4가지가 가능! (단, 내가 뭘 쓰려는지 알아야겠지?)

public class Main1764 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위한 Scanner 생성

        // 듣도 못한 사람 수 N, 보도 못한 사람 수 M 입력받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); // 숫자 입력 후 남아 있는 개행 문자(Enter)를 제거

        // 듣도 못한 사람들의 이름을 저장할 HashSet 생성
        // HashSet은 중복을 허용하지 않으며 빠르게 검색할 수 있음
        HashSet<String> unheardSet = new HashSet<>();

        // 결과를 저장할 리스트 (듣도 보도 못한 사람 목록)
        ArrayList<String> result = new ArrayList<>();

        // 듣도 못한 사람 N명의 이름을 입력받아 Set에 저장
        for (int i = 0; i < N; i++) {
            String name = sc.nextLine();  // 한 줄씩 이름 입력
            unheardSet.add(name);         // Set에 추가 (중복 자동 제거)
        }

        // 보도 못한 사람 M명의 이름을 입력받아 Set에 있는지 확인
        for (int i = 0; i < M; i++) {
            String name = sc.nextLine();            // 이름 입력
            if (unheardSet.contains(name)) {        // Set에 존재하면
                result.add(name);                   // 결과 리스트에 추가
            }
        }

        // 결과 리스트를 알파벳 사전 순으로 정렬
        Collections.sort(result);

        // 결과 출력: 듣도 보도 못한 사람 수 먼저 출력
        System.out.println(result.size());

        // 이름들을 한 줄씩 출력
        for (String name : result) {
            System.out.println(name);
        }

        sc.close();  // Scanner 닫기 (자원 해제)
    }
}
