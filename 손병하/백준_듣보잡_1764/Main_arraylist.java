package backjoon;

import java.util.ArrayList;

// 자유롭게 크기가 늘어나는 리스트

public class Main_arraylist {
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");               // 값 추가
        list.add("banana");

        System.out.println(list.get(0)); // 첫 번째 값: "apple"
        System.out.println(list.size()); // 크기: 2
    }
}
