package backjoon;

import java.util.HashSet;

// 중복 없이 저장 & 빠르게 찾기가 가능한 HashSet

public class Main_hashset {
	public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("apple");           // 값 추가
        set.add("banana");
        set.add("apple");           // 중복은 저장되지 않음

        System.out.println(set.contains("banana")); // true
        System.out.println(set.contains("grape"));  // false
    }
}
